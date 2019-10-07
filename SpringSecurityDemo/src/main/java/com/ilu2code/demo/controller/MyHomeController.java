package com.ilu2code.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyHomeController {
	
	@GetMapping("/")
	public String getHomePageMessage() {
		return "home";
	}

}
