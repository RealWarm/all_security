package com.cen.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.cen.controller.CommonController;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j
@Slf4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler{

	@Override
	public void handle(HttpServletRequest request, 
						HttpServletResponse response,
			AccessDeniedException accessDeniedException) 
					throws IOException, ServletException {
		
		log.info("CustomAccessDeniedHandler :: handle()!!!!!");
		log.info("will be redirected !! ");
		response.sendRedirect("/accessError");
		
	}//handle

}//end class
