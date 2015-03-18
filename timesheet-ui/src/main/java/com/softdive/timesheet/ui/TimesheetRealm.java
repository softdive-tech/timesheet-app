package com.softdive.timesheet.ui;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.ForgotPassword;
import com.softdive.timesheet.model.RoleType;
import com.softdive.timesheet.model.User;
import com.softdive.timesheet.model.UserProfile.ProfileType;
import com.softdive.timesheet.services.UserService;

public class TimesheetRealm extends AuthorizingRealm {
	
	private static final Logger log = LoggerFactory.getLogger(TimesheetRealm.class);
	
	public static final String UNVERFIED_MESSAGE = "xyz";
	
	@Autowired UserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        User user = (User) getAvailablePrincipal(principals);
        Set<String> roles = new HashSet<>();
        
        for(RoleType role: user.getAllRoles()) {
        	roles.add(role.name());
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		LoginToken token = (LoginToken) authenticationToken;
		try {
			User user = userService.validateUser(token.getUsername(), new String(token.getPassword()), ProfileType.EMAIL, null);
			
			if(!isMerchantEmailVerified(user)) {
				throw new AuthenticationException(UNVERFIED_MESSAGE);
			}
			
			return new SimpleAuthenticationInfo(user, token.getPassword(), getName());
		} catch (ApplicationException e) {
			log.error(e.getMessage(),e);
			throw new AuthenticationException(e);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new AuthenticationException(e);
		}
	}
	
	private boolean isMerchantEmailVerified(User user) throws ApplicationException {
		Collection<RoleType> roles = user.getAllRoles();
		boolean isMerchant = false;
		for (RoleType roleType : roles) {
			if(roleType == RoleType.ASSOCIATE) {
				isMerchant = true;
			}
		}
		
		if(!isMerchant) return true;
		
		Collection<RoleType> verifiedRoles = user.getVerifiedRoles();
		for (RoleType roleType : verifiedRoles) {
			if(roleType == RoleType.PROJECT_MANAGER) {
				isMerchant = true;
				break;
			}
		}
		
		if(isMerchant) return true;
		
		ForgotPassword forgotPassword = userService.getCurrentUser(user.getId());
		if(forgotPassword.isVerified) {
			return true;
		}
		return false;
	}
}
