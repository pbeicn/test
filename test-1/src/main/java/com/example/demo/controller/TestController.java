package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService testService;

	@GetMapping(value = "/test")
	public String sayHello() {
		return testService.sayone();
	}
}
