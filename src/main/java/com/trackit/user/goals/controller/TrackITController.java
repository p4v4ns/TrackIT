package com.trackit.user.goals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackit.user.goals.dao.GoalRepository;
import com.trackit.user.goals.models.Goal;

@RestController
public class TrackITController{
    

	  @Autowired 
	  GoalRepository repository;
	
	@GetMapping("/hello")
    public String sayHello(@RequestParam("id") String id) {
		Goal goal = new Goal();
		System.err.println(repository.count() +" " +repository.findAll() +" " +repository.findByName("wow").get(0).getName());
        return  id;
    } 
	
	@PostMapping("/add")
    public String addGoal(@RequestBody Goal goal) {
		String msg = "";
		System.err.println();
		if(null != goal){
			repository.save(goal);	
		}
		else{
			msg = "please pass the goal object{ name:goal , type:type}";
		}
		
		if(null == repository.findByName(goal.getName()) || repository.findByName(goal.getName()).isEmpty()){
			msg = "goal not added please check the goal details again";
		}
		else{
			msg = repository.findByName(goal.getName()).get(0).getName() + " has been added sucessfully";
		}
		
        return  msg;
    } 
}