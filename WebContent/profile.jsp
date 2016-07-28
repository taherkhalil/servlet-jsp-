<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h1>hello</h1>
<h1><%out.println(this.getServletContext().getAttribute("username")); %></h1>
<%HttpSession se=request.getSession(false); %>
<%String username=(String)getServletContext().getAttribute("username"); %>
<%session.setAttribute("User", username);%>
 session ID: <%out.println(request.getSession().getId()); %>
session name: <%out.println(se); %>
<form action="login.jsp">
<button type="button">Log out!</button>
<%session.removeAttribute("User"); %>
<% session.invalidate();%>
<%-- <%response.sendRedirect("login.jsp"); %> --%>
</form>
</body>
</html>