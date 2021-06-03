package com.cen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/all")
	public String doAll() {
		log.info("SampleController :: doAll() invoked!!!");		
		return "all";
	}//doAll
	
	@GetMapping("/member")
	public String doMember() {
		log.info("SampleController :: doMember() invoked!!!");
		return "member";
	}//doMember
	
	@GetMapping("/admin")
	public String doAdmin() {
		log.info("SampleController :: doAdmin() invoked!!!");
		return "admin";		
	}//doAdmin
	
//	@GetMapping("/all")
//	public void doAll() {
//		log.info("SampleController :: doAll() invoked!!!");
//	}//doAll
//	
//	@GetMapping("/member")
//	public void doMember() {
//		log.info("SampleController :: doMember() invoked!!!");
//	}//doMember
//	
//	@GetMapping("/admin")
//	public void doAdmin() {
//		log.info("SampleController :: doAdmin() invoked!!!");
//	}//doAdmin
	
}//end class
