<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="occupation" class="asg.login.Occupation"
		scope="application">
	</jsp:useBean>

	<jsp:setProperty property="*" name="occupation" />
	<h1>Occupational information here</h1>
	<form action="show" method="post">
		<table> 
			<td>
			<tr>
				Enter Current Addresss :
				<input type="text" name="addr">
			</tr>
			<br>
			<tr>
				Enter your Email Id :
				<input type="email" name="email">
			</tr>
			<br>
			<tr>
				Enter Conatct Number :
				<input type="text"
					onkeypress='return event.charCode >= 48 && event.charCode <= 57'
					name="number">
			</tr>
			<br>
			<tr>
				Enter Pincode :
				<input type="text"
					onkeypress='return event.charCode >= 48 && event.charCode <= 57'
					name="pin">
			</tr>
			<br>
			<tr>
				<input type="submit" value="submit" >
			</tr>
			</td>
		</table>
	</form>
</body>
</html>