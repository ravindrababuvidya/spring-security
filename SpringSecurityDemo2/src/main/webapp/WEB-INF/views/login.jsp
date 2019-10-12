<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Custom Login Form </h2>
	
	<f:form action="${pageContext.request.contextPath}/authenticateuser" method="post">
	<c:if test="${param.error != null}">
		<i>Sorry your username/password please enter correct details</i>
	</c:if>
	<p>User Name:	<input type="text" name="username"><p><br>
	<p>Password:	<input type="password" name="password"><p><br>
	
	<input type="submit" name="submit">
		
	</f:form>
</body>
</html>