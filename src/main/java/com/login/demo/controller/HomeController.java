package com.login.demo.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping(value={"/home","/"})
	public String home(Model model)
	{
		//model.addAttribute("date",new Date().toLocaleString());
		 model.addAttribute("date","09-11-22-date Attribute using model");
	return "home.html";
}
}
