package com.example.microservices.studentservice.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	Environment environment;
	
	
	@GetMapping("/ping")
	public String pingStudent() {
		return "STUDENT-SERVICE is running in port: " + environment.getProperty("local.server.port");
	}
	
	@GetMapping("/{name}")
	public String getBookByStudentName(@PathVariable(value = "name") String studentName) {
		return "Welcome " + studentName + ". Learing is fun";
	}

}
