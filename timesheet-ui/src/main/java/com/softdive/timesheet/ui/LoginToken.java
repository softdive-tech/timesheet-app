package com.softdive.timesheet.ui;

import org.apache.shiro.authc.UsernamePasswordToken;

import com.softdive.timesheet.model.UserProfile.ProfileType;


public class LoginToken extends UsernamePasswordToken {
	
	private static final long serialVersionUID = 1L;
	
	private ProfileType profileType;

	public LoginToken(String username, String password, boolean rememberMe, String host) {
		super(username, password, rememberMe, host);
	}

	public LoginToken(String username, String password) {
		super(username, password);
	}

	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}
}
