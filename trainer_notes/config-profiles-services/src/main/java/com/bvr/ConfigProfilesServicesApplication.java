package com.bvr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigProfilesServicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigProfilesServicesApplication.class, args);
	}
	
	@Autowired
	private ServerProperties serverProperties;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(serverProperties);
	}
	
	

}
