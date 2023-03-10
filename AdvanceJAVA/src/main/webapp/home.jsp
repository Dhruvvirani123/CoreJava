<%@page import="Dao.CustomerDao"%>
<%@page import="java.util.List"%>
<%@page import="Model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	p

			Customer d = null;
			if (session.getAttribute("data") != null) {
		d = (Customer) session.getAttribute("data");
			} else {
		response.sendRedirect("login.jsp");
			}
	%>

	Welcome,
	Name :
	<%=t(d.getName%>
	Contact :
	<%=t(d.getContact%>
	Address :
	<%=t(d.getAddress%>
	Email :
	<%=t(d.getEmail%>
	Password :
	<%=t(d.getPassword%>
	
	
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<%
			p

					List<Customer> list = CustomerDao.getallUsers();
			%>
			<tbody>
				<%
				for (Customer u2 : list) {
				%>
				<tr>
					<td><%=u2.getId()%></td>
					<td><%=u2.getName()%></td>
					<td><%=u2.getContact()%></td>
					<td><%=u2.getAddress()%></td>
					<td><%=u2.getEmail()%></td>
					<td><%=u2.getPassword()%></td>
					
					<td>
						<form action = "UserController" method="post">
							<input type="hidden" name="id" value="<%=u2.getId()%>">
							<input type="submit" name="action" value="edit">
						</form>
					</td>
					<td>
						<form action = "UserController" method="post">
						<input type="hidden" name="id" value="<%=u2.getId()%>">
							<input type="submit" name="action" value="delete">
						</form>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	
	<h1 class="text-center">
		<a href="logout.jsp">Logout...</a>
	</h1>
</body>
</html>