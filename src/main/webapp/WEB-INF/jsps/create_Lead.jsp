<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>create lead..</h2>
	<form action="createLead" method="post">
		<table>
			<tr>
				<th>First Name</th>
				<th><input type="text" name="firstName"></th>
			</tr>
			<tr>
				<th>Last Name</th>
				<th><input type="text" name="lastName"></th>
			</tr>
			<tr>
				<th>Email</th>
				<th><input type="text" name="email"></th>
			</tr>
			<tr>
				<th>Mobile</th>
				<th><input type="text" name="mobile"></th>
			</tr>
			<tr>
				<th><input type="submit" value="save"></th>
			</tr>
		</table>
	</form>
	
	${msg}
</body>
</html>