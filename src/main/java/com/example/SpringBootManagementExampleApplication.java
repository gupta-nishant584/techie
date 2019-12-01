package com.example;

import com.example.configuration.CommandLineApplicationRunner;
import com.example.configuration.CommandLineApplicationRunnerTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootManagementExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootManagementExampleApplication.class, args);
	}


	@Bean
	public CommandLineApplicationRunner runner(){
		return new CommandLineApplicationRunner();
	}


	@Bean
	public CommandLineApplicationRunnerTwo runner2(){
		return new CommandLineApplicationRunnerTwo();
	}
}
