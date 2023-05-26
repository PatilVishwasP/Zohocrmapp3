<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<h2>update lead..</h2>
	<form action="updateLead" method="post">
		<table>
			<tr>
				<th><input type="hidden" name="id" value="${leads.id}"></th>
			</tr>
			<tr>
				<th>First Name</th>
				<th><input type="text" name="firstName"
					value="${leads.firstName}"></th>
			</tr>
			<tr>
				<th>Last Name</th>
				<th><input type="text" name="lastName"
					value="${leads.lastName}"></th>
			</tr>
			<tr>
				<th>Email</th>
				<th><input type="text" name="email" value="${leads.email}"></th>
			</tr>
			<tr>
				<th>Mobile</th>
				<th><input type="text" name="mobile" value="${leads.mobile}"></th>
			</tr>
			<tr>
				<th><input type="submit" value="save"></th>
			</tr>
		</table>
	</form>

	${msg}
</body>
</html>