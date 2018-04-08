package com.trackit.user.goals.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trackit.user.goals.models.Goal;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Long>{
	List<Goal> findByName(String name);
	
}
