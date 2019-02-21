package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.UserService;

public class Application {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		UserService us = (UserService) ac.getBean("User Service");
		System.out.println(us.findAll());
		
		((AbstractApplicationContext) ac).close();
	}
}
