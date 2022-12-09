package com.login.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.demo.entity.User;
import com.login.demo.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	UserService userService;
	@RequestMapping(value="/addUser")
	public String showForm(){
		return "home.html";
	}
	
	@PostMapping(value="/addUser")
	public ModelAndView addUser(User user) 
	{
		userService.saveUser(user);
		
		return new ModelAndView("redirect:/result");
	}
	
	@RequestMapping(value="/result")
	public String sendToResult(){
		return "datadisplay.html";
	}
}
