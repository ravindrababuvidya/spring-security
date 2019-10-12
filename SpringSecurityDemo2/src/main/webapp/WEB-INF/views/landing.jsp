<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Demo</title>
</head>
<body>
<h1>Landing Page</h1><br>
	<p>Welcome to landing page do something </p><br>
	<a href="${pageContext.request.contextPath}/employees">Security Page Access Link</a>
	
</body>
</html>