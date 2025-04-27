package com.example.google.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.google.login.repository")
public class GoogleLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleLoginApplication.class, args);
	}


}
