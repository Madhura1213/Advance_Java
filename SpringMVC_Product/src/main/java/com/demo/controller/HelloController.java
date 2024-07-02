package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/")
	public ModelAndView sayhello() {
		String message = "Welcome to Spring MVC !!";
		return new ModelAndView("myhello","msg",message);
	}
	
	@GetMapping("/welcome")
	public String sayWelcome (Model ob) {
		ob.addAttribute("message","Welcome to MVC");
		return "welcome";
	}
	
	
}
