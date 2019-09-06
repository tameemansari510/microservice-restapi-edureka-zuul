package com.example.microservices.bookservice.bookcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	
	@Autowired
	Environment environment;
	
	
	@GetMapping("/ping")
	public String pingBook() {
		return "BOOK-SERVICE is running in port: " + environment.getProperty("local.server.port");
	}

	@GetMapping()
	public List<String> getBookNames() {
		List<String> books = new ArrayList<String>();
		books.add("Spring-Cloud");
		books.add("Microservices");
		books.add("Eureka");
		books.add("Zuul");
		return books;
	}

}
