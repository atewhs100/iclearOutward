package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;

@RestController
@RequestMapping(value = "/limit")
public class LimitController {

	public Employee getLimitCompanyEmployee() {
		// Employee employee = limitService
		return null;

	}

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

}
