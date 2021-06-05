package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Bike;


@SpringBootApplication // Configuration ComponentScan autoConfiguration
//@Configuration
//@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getBean("bike"));
		System.out.println(context.getBean("forBike"));

	}

	@Bean
	public Bike bikeNew() {
		return new Bike();
	}
	
	

	
	
	 @Bean
		public CommandLineRunner commandLineRunner(ApplicationContext ctx){
			return (args) -> {
				System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
						Arrays.stream(ctx.getBeanDefinitionNames())
						.sorted()
						.forEach(name->System.out.println(name));
			
			};
	 }
			
}
