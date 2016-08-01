<%@page import="org.apache.catalina.Session"%>
<%-- <%@page import="javax.websocket.Session"%> --%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="ex" uri="mytags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>


<body>

<% if(request.getSession().getId()!=session.getAttribute("session")){ response.sendRedirect("login.jsp"); } %>
<h1>hello</h1>
<h1><%out.println(this.getServletContext().getAttribute("username")); %></h1>

<%String username=(String)getServletContext().getAttribute("username"); %>
<%session.setAttribute("User", username);%>
 session ID: <%out.println(request.getSession().getId()); %><br/>
 creation  time :<%out.println(request.getSession().getCreationTime()); %><br/>


<form  action="display.jsp" method="post">
 
 Enter email :<input type="email" name="email" > <br>
Enter address :<input type="text" name="addr" ><br>
Enter Phone number :<input  type="text" onkeypress='return event.charCode >= 48 && event.charCode <= 57'  name ="no"><br>
<div style="color: #FF0000;">${errorMessage}</div>
<input type="submit" value="submit">
</form>
<%request.getSession(false); %>
<form action="login.jsp">
<button type="button">Log out!</button>
<%-- <%se.removeAttribute("user"); %> --%>
<%-- <% request.getSession(false).invalidate(); %> --%>
<%-- <%response.sendRedirect("login.jsp"); %> --%>

</form>
</body>
</html>