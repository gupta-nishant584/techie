package com.example.springbootmanagementexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@Value("${application-profile}")
	private String profile;

	@GetMapping("/example")
	public String example() {
		return "Hello User !!!" + profile ;
	}
}
