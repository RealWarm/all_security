package com.cen.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.cen.controller.CommonController;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j
@Slf4j
public class CustomNoOpPasswordEncoder 
				implements PasswordEncoder{
		
	@Override
	public String encode(CharSequence rawPassword) {
		log.info("CustomNoOpPasswordEncoder :: encode() invoked !!!");
		log.warn("+++ before encode : " + rawPassword);
		return rawPassword.toString();
	}//encode

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		log.info("CustomNoOpPasswordEncoder :: matches() invoked !!!");
		log.warn("matches : " + rawPassword + ":" + encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}//matches	

}//end class
