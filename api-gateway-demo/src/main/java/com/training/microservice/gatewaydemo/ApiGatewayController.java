package com.training.microservice.gatewaydemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class ApiGatewayController {

	public ApiGatewayController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/message")
	public String test() {
		return "Hello Api gateway demo - employee Service";
	}
}
