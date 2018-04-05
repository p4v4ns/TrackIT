package com.trackit.user.goals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/", method = RequestMethod.GET)
public class LoginController {

	
@RequestMapping(value="/hello")
public String Welcome(){
	return "welcome";	
} 



}