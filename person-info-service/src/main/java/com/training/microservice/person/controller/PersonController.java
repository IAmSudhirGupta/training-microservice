package com.training.microservice.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.microservice.person.model.Person;


@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.key}")
	private String apiKey;
	@Value("${api.baseUrl}")
	private String baseUrl;

	@RequestMapping("/{personId}")
	public Person getPersonInfo(@PathVariable("personId") String personId) {
		Person person = restTemplate
				.getForObject(baseUrl + "/person/" + personId + "?api_key=" + apiKey + "&language=en-US", Person.class);
		return person;
	}
}
