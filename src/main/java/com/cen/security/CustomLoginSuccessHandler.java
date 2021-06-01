package com.cen.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.log4j.Log4j;


// �α��� �� ����ڿ� �ο��� ���� Authentication ��ü�� �̿��ؼ� 
// ����ڰ� ���� ��� ������ ���ڿ��� üũ�Ѵ�.
// ���� ����ڰ� 'ROLE_ADMIN' ������ �����ٸ� �α��� �Ŀ� �ٷ� '/sample/admin'���� �̵��ϰ� �Ǵ� ���
@Log4j
public class CustomLoginSuccessHandler 
				implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(
			HttpServletRequest request, 
			HttpServletResponse response,
			Authentication auth) throws IOException, ServletException {
		
		log.warn("Login Success");
		
		List<String> roleNames = new ArrayList<>();
		
		auth.getAuthorities().forEach(authority->{
			roleNames.add(authority.getAuthority());
		});
		
		log.warn("ROLE NAMES : " + roleNames);
		
		if(roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect("/sample/admin");
			return;
		}//if
		
		if(roleNames.contains("ROLE_MEMBER")) {
			response.sendRedirect("/sample/member");
			return;
		}//if
		
		response.sendRedirect("/");
	}//onAuthenticationSuccess

}//end class



















