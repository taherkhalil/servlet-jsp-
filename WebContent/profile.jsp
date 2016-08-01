<%-- <%@page import="org.apache.catalina.Session"%> --%>
<%@page import="javax.websocket.Session"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="abc" uri="WEB-INF/log.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>


<body>
	<abc:GetForm />
	<a href="EducationalProfile.jsp">Click to Your Profile Information</a>

	<h1>
		<c:out value="Hello"></c:out>

	</h1>
	<% this.getServletContext().getAttribute("username"); %>

	<form action="Logout" method="post">
		<input type="submit" value="logout">

	</form>
</body>
</html>