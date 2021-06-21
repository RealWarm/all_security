<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" 
	prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>/sample/admin page</h1>
	
	<p>principal : 			<sec:authentication property="principal"/></p>
	<!-- principal(=CustomUser=UDS에서 반환된 객체) == 즉 CUDS를 이용했다면 LOAD함수에서 반환된 CustomUser 객체가 됨 -->	 
	<p>MemberVO : 			<sec:authentication property="principal.member"/></p>
	<!-- principal.member == CustomUser객체의 getMember()를 호출한다 -->
	<p>사용자 이름 : 			<sec:authentication property="principal.member.userName"/></p>
	<p>사용자 아이디 : 			<sec:authentication property="principal.username"/></p>
	<p>사용자 권한 리스트 : 		<sec:authentication property="principal.member.authList"/></p>
	
	<a href="/customLogout">Logout</a>
</body>
</html>