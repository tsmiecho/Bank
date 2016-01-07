<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Bank</title>
<meta http-equiv="X-UA-Compatible" content="IE = edge">
<meta name="viewport" content="width = device-width, initial-scale = 1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
	<div class="container">
		<form:form modelAttribute="user" method="POST" action="${pageContext.request.contextPath}/new_user">
			<div class="row">
				<div class="form-group">
					<form:hidden path="enabled" value="true" />
					<form:hidden path="userRole" value="ROLE_USER" />
					<form:label path="name">name</form:label>
					<form:input path="name" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<form:label path="surname">surname</form:label>
					<form:input path="surname" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<form:label path="login">login</form:label>
					<form:input path="login" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<form:label path="password">password</form:label>
					<form:input path="password" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<input type="submit" value="Submit" />
				</div>
			</div>
			<div class="row">
				<div class="g-recaptcha" data-sitekey="6LeHuRQTAAAAAIHsh-gb-P37_N0aRESDWAoF6Rmf"></div>
			</div>
		</form:form>
	</div>
</body>
</html>