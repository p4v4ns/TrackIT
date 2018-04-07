package com.trackit.user.goals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackITController {
    
	@GetMapping("/hello")
    public String sayHello() {
        return  "Hello";
    } 
}