package com.training.microservice.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class FirstController {

	public FirstController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/message")
	public String test() {
		return "Hello Api gateway demo - employee Service";
	}
}