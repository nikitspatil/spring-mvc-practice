package com.mvcpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController2 {
	@ResponseBody
	@GetMapping("/test")
	public String getHomePage() {
		return "testing...";

	}

}
