<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Access Denied Page</h1>
	<h2><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage()}" /></h2>
	<h2><c:out value="${msg}"/></h2>
</body>
</html>