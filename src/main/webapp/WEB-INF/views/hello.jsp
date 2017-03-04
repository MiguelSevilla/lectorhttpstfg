<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<h2>Hello, ${name}. Welcome to Spring MVC!</h2>
	
	
	
	 <c:forEach items="${urls}" var="url">
    <h2>     
        ${url}
    </h2>
</c:forEach>
	
	
</body>
</html>