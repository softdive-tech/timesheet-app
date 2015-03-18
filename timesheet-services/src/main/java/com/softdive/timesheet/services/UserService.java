package com.softdive.timesheet.services;

import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.ForgotPassword;
import com.softdive.timesheet.model.User;
import com.softdive.timesheet.model.UserProfile.ProfileType;

public interface UserService {

	User createUser(User user) throws ApplicationException;

	User validateUser(String username, String password, ProfileType profileType, String deviceId) throws ApplicationException;

	ForgotPassword getCurrentUser(long userId) throws ApplicationException;
}
