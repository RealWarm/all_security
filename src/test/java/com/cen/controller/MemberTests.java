package com.cen.controller;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
public class MemberTests {

//	@Inject
	@Autowired
	private PasswordEncoder pwencoder;
	
//	@Inject
	@Autowired
	private DataSource ds;
	
	
	@Test
	public void testIsertMember() {
		
		System.out.println("PasswordEncoder :: " + pwencoder);
//		for(int i=0; i<100; i++) {
//			System.out.println(i + " : " + pwencoder.encode("pw"+i));
//		}//for-i
		
	}//testIsertMember
	
	
}//end class



































