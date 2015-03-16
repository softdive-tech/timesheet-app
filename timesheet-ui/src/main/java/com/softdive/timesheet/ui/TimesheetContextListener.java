package com.softdive.timesheet.ui;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

public class TimesheetContextListener extends ContextLoaderListener {
	
	public static String CTX_PATH = "";
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		CTX_PATH = event.getServletContext().getContextPath();
	}
}
