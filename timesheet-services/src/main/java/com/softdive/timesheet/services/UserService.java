package com.softdive.timesheet.services;

import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.User;

public interface UserService {

	User createUser(User user) throws ApplicationException;

}
