package com.cen.security;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cen.domain.MemberVO;
import com.cen.persistence.MemberDao;
import com.cen.security.domain.CustomUser;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService 
			implements UserDetailsService{

	@Inject
	private MemberDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String userName) 
							throws UsernameNotFoundException {
		log.warn("CustomUserDetailsService :: loadUserByUsername() invoked !!! \n"
				+ "@@@@@@@@@@ Load user By UserName : " + userName);
		
		//userName means userid
		MemberVO vo = dao.read(userName);
		
		log.warn("queried by member mapper : " + vo);
				
		return vo==null ? null : new CustomUser(vo);
	}//loadUserByUsername
	

}//end class




























