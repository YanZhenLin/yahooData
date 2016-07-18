<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
<script type="text/javascript" src="resources/js/jquery-1.12.3.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
</head>
	<body>
		<div class="container">
			<div class="row">
			    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
					<sf:form role="form" method="POST" modelAttribute="createAccountForm" action="createAccount" >
						<font color="red"><sf:errors path="*" /></font><br/>
						<h2>Please Sign Up </h2>
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-md-6">
								<div class="form-group">
									<sf:input path="firstName" type="text" class="form-control input-lg" placeholder="First Name" tabindex="1"/>
								</div>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-6">
								<div class="form-group">
									<sf:input path="lastName" type="text" class="form-control input-lg" placeholder="Last Name" tabindex="2"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<sf:input path="username" type="text" class="form-control input-lg" placeholder="Username" tabindex="3" />
						</div>
						<div class="form-group">
							<sf:input path="email" class="form-control input-lg" placeholder="Email Address" type="email" tabindex="4" />
						</div>
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-md-6">
								<div class="form-group">
									<sf:password path="password" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="6" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="14"></div>
							<div class="col-xs-12 col-md-6"><a href="#" class="btn btn-success btn-block btn-lg">Sign In</a></div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</body>
</html>