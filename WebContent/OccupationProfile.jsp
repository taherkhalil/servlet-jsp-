<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="education" class="asg.login.Education"
		scope="application">
	</jsp:useBean>

	<jsp:setProperty property="*" name="education" />
	<h1>Occupational information here</h1>
	<form action="ResidentialProfile.jsp">
		<table>
			<td>
			<tr>
				Enter Current Company :
				<input type="text" name="company">
			</tr>
			<br>
			<tr>
				Enter Designation :
				<input type="text" name="designation">
			</tr>
			<br>
			<tr>
				Enter Salary :
				<input type="text"
					onkeypress='return event.charCode >= 48 && event.charCode <= 57'
					name="salary">
			</tr>
			<br>
			<tr>
				<input type="submit" value="submit" onclick="ResidentialProfile.jsp">
			</tr>
			</td>
		</table>
	</form>

</body>
</html>