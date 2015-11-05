package com.java2learn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception {

		ModelAndView modelAndView=new ModelAndView("hello");
		modelAndView.addObject("customsrs", "Welcome to Spring MVC!!!");
		//JDBC CODE
		//Get the Customer records from DB
		
		
		return modelAndView;
	}

}
