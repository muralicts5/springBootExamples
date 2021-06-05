package com.example.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

	@Bean(name = "bike")
	public Bike createBike() {
		return new Bike();
	}
	
	@Bean(name="forBike")
	public ForiegnBike createFor() {
		return new ForiegnBike();

	}
}
