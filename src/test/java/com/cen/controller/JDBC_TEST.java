package com.cen.controller;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class JDBC_TEST {

//	static {
//		try {
//			Class.forName("oracle.jdbc.driver.oracleDriver");
//		}catch(Exception e){
//			e.printStackTrace();
//		}//try
//	}//static
	
	@Test
	public void testConnection() {
		log.info("JDBC_TEST :: testConnection() invoked!!!!");
		try(Connection con=
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE",
						"all_care",
						"all_care"
						)){
			log.info(con);
		}catch(Exception e) {
			e.printStackTrace();
		}//try
		
	}//testConnection	
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testDataSource() {
		log.info("+++++++++++++++JDBC_TEST :: testDataSource() invoked!!!!"); 		
		try(Connection con = ds.getConnection()){			
			log.info("++++++" + con);
		}catch(Exception e) {
			fail(e.getMessage());
		}//try		
	}//testDataSource
	
	
}//end class
