package com.cen.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class CommonController {

	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("CommonController :: accessDenied() invoked!!!!!");
		model.addAttribute("msg", "Access Denied");
	}//accessDenied
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		log.info("CommonController :: loginInput() invoked!!!!!!!");
		System.out.println("error :: " + error + " || " + "logout :: " + logout);
		if(error!=null) {
			model.addAttribute("error", "Login Error Check Your Account by Hoon");
		}//if
		
		if(logout != null) {
			model.addAttribute("logout", "Logout!!");
		}//if
		
	}//loginInput
	
}//end class
















