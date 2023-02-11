package com.javamantram.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello to Spring and Docker integration";
	}

}
