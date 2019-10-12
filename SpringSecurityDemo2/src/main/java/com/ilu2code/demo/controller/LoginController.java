package com.ilu2code.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	

	@RequestMapping("showloginpage")
	public String showLoginPage() {
		return "fancy-login";
	}
}
