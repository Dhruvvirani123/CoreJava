<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="Bootie Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<link href="css/font-awesome.css" rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900"
	rel="stylesheet">
</head>

<body>

	<section class="ab-info-main py-5">
		<div class="container py-3">
			<h3 class="tittle text-center">
				<span class="sub-tittle">Find Us</span> Customer Registration
			</h3>
			<div class="row contact-main-info mt-5">
				<div class="col-md-12 contact-right-content">
					<form action="CustomerController" method="post">
						<input type="text" name="name" placeholder="Name" required="">
						<input type="text" name="contact" placeholder="Contact"
							required=""> <input type="text" name="address"
							placeholder="Address" required=""> <input type="email"
							class="email" name="email" placeholder="Email" required="">
						<input type="password" class="email" name="password"
							placeholder="Password" required="">
						<div class="text-center">
							<input type="submit" name="action" value="register">
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>