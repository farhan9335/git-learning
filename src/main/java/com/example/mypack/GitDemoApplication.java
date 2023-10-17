package com.example.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Repository
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}
	
	@GetMapping(path = "/welcome")
	public String getMessage() {
		return "This is First Git Demo API";
	}
	
	@GetMapping(path = "/populate")
	public String poupulateMessage() {
		return "Pouplate message to user";
	}

}
