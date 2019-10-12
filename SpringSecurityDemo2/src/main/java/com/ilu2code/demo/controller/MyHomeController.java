package com.ilu2code.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHomeController {
	
	@GetMapping("/")
	public String showLanding() {
		
		return "landing";
	}
	
	@GetMapping("/employees")
	public String showHome() {
		
		return "home";
	}
	
	// add request mapping for /leaders

	@GetMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";
	}
	
	// add request mapping for /systems
	
	@GetMapping("/systems")
	public String showSystems() {
		
		return "systems";
	}

}
