package com.mvcpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@GetMapping("/home")
	public String getHomePage() {
		return "home-page";

	}

}
