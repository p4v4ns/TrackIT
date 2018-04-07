package com.trackit.user.goals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String helloController(ModelMap model){
		model.put("name","bhargav");
		return "welcome";	
	} 



}