<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<%@ taglib prefix="abc" uri="WEB-INF/log.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display</title>
</head>
<body>

	<abc:GetForm />
	<jsp:useBean id="residential" class="asg.login.Residential"
		scope="application">
	</jsp:useBean>
	<jsp:setProperty property="*" name="residential" />
	<jsp:useBean id="education" class="asg.login.Education"
		scope="application">
	</jsp:useBean>

	Educational information:
	<br>

	<jsp:getProperty property="college" name="education" /><br>
	<jsp:getProperty property="degree" name="education" /><br>
	<jsp:getProperty property="percentage" name="education" /><br>
	<jsp:useBean id="occupation" class="asg.login.Occupation"
		scope="application">
	</jsp:useBean>


	Occupational information:
	<br>
	<jsp:getProperty property="company" name="occupation" /><
	<br>
	<jsp:getProperty property="designation" name="occupation" /><br>
	<jsp:getProperty property="salary" name="occupation" /><br>
	<%-- <jsp:useBean id="residential" class="asg.login.Residential"
		scope="application">
	</jsp:useBean> --%>

	Residential information:
	<jsp:getProperty property="addr" name="residential" /><br>
	<jsp:getProperty property="email" name="residential" /><br>
	<jsp:getProperty property="number" name="residential" /><br>
	<jsp:getProperty property="pin" name="residential" /><br>

</body>
</html>