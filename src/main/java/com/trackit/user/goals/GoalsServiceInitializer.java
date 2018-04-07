package com.trackit.user.goals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.trackit.user.goals")
public class GoalsServiceInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(GoalsServiceInitializer.class, args);
	}

}
