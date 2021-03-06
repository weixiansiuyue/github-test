package com.zhang.springboot001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/hello")
	String index() {
		return "Hello Springboot test";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
