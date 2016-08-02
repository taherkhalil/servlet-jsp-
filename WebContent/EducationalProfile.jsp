<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="abc" uri="WEB-INF/log.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<abc:GetForm />
<h1>Educational information here</h1>
<form action="occProfile" method="post" >
		<table>
			<td>
			<tr>
				Enter College Name :
				<input type="text" name="college">
			</tr>
			<br>
			<tr>
				Enter Latest Degree :
				<input type="text" name="degree">
			</tr>
			<br>
			<tr>
				Enter Percentage :
				<input type="text"
					onkeypress='return event.charCode >= 48 && event.charCode <= 57'
					name="percentage">
			</tr>
			<br>
			<tr>
				<input type="submit" value="submit" onclick="OccupationProfile.jsp">
			</tr>
			</td>
		</table>
	</form>
</body>
</html>