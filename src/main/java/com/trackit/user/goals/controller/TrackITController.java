package com.trackit.user.goals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackit.user.goals.dao.GoalRepository;

@RestController
public class TrackITController{
    

	  @Autowired 
	  GoalRepository repository;
	
	@GetMapping("/hello")
    public String sayHello(@RequestParam("id") String id) {
		repository.findAll();
		System.err.println(repository.count() +" " +repository.findAll() +" " +repository.findByName("wow").get(0).getName());
        return  id;
    } 
}