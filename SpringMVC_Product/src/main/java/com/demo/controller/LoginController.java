package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService lservice;

	@GetMapping("/mylogin")
	public String showloginform() {
		return "loginpage";
	}
	
	@GetMapping("/validateuser")
	public ModelAndView validateUser(HttpSession session, @RequestParam ("uname") String uname, @RequestParam ("pass") String pass) {
		MyUser u =lservice.authenticateUser(uname,pass);
		if(u!=null) {
			session.setAttribute("user", u);
			if(u.getusername().equals("admin")) {
				return new ModelAndView("redirect:/product/viewproducts");
			}
		}
		String str= "Please re-enter Credentials";
		return new ModelAndView("loginpage","msg",str );
		
	}
	
}
