package com.softdive.timesheet.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.User;
import com.softdive.timesheet.services.UserService;

@Controller
public class HomeController {

	@Autowired UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model model) {
		return "home/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) throws ApplicationException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setId(2);
		user.setName(username);
		user.setMobile(password);
		userService.createUser(user);
		return "home/login";
	}

}