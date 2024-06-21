package com.grstech.srms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String getHome() {
		return "Welcome to tomcat deploy siddhu...with jenkins! is Ready AWS...!!!!" ;
	}
}