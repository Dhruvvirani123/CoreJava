<%@page import="Dao.CustomerDao"%>
<%@page import="Model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>

<link href="admin/css/bootstrap.min.css" rel='stylesheet'
	type='text/css' />
<link href="admin/css/style.css" rel='stylesheet' type='text/css' />
<link href="admin/css/lines.css" rel='stylesheet' type='text/css' />
<link href="admin/css/font-awesome.css" rel="stylesheet">
<script src="admin/js/jquery.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<link href="admin/css/custom.css" rel="stylesheet">
</head>
<body>
	<div id="wrapper">
		<nav class="top1 navbar navbar-default navbar-static-top"
			role="navigation" style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Dhruv</a>
			</div>
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<l`i><a href="admin-home.jsp"><i
								class="fa fa-dashboard fa-fw nav_icon"></i>Dashboard</a></li>
						<li><a href="admin-customers-list.jsp"><i
								class="fa fa-indent nav_icon"></i>Customers<span
								class="fa arrow"></span></a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div id="page-wrapper">
			<div class="graphs">
				<div class="col_3">
					<div class="col-md-3 widget widget1">
						<div class="r3_counter_box">
							<i class="pull-left fa fa-users user1 icon-rounded"></i>
							<div class="stats">
								<%
								List<Customer> clist = CustomerDao.getAllCustomers();
								%>
								<h5>
									<strong>
										<%
										out.print(clist.size());
										%>
									</strong>
								</h5>
								<span>Total Customers</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-widget">
						<div class="tables">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>Contact</th>
										<th>Address</th>
										<th>Email</th>
									</tr>
								</thead>
								<tbody>

									<%
									List<Customer> list = CustomerDao.getAllCustomers();
									%>
									<%
									for (Customer c : list) {
									%>
									<tr>
										<th scope="row"><%=c.getId()%></th>
										<td><%=c.getName()%></td>
										<td><%=c.getContact()%></td>
										<td><%=c.getAddress()%></td>
										<td><%=c.getEmail()%></td>
									</tr>
									<%
									}
									%>
								</tbody>
							</table>
						</div>
					</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<script src="admin/js/bootstrap.min.js"></script>
</body>
</html>