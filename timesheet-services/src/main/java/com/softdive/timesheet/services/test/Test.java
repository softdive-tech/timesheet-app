package com.softdive.timesheet.services.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.User;
import com.softdive.timesheet.services.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/timesheet-services.xml");
		UserService userService = applicationContext.getBean(UserService.class);
//		User user = new User();
//		user.setId(1);
//		user.setName("lovesh");
//		user.setMobile("9650072863");
//		try {
//			userService.createUser(user);
//		} catch (ApplicationException e) {
//			System.out.println(e.getMessage());
//		}

	}
}
