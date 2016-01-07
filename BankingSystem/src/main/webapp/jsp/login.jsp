<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Bank</title>
<meta http-equiv="X-UA-Compatible" content="IE = edge">
<meta name="viewport" content="width = device-width, initial-scale = 1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<form method="post" action="${pageContext.request.contextPath}/login">
			<div class="row">
				<div class="form-group">
					login <input type="text" name="login" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					password <input type="password" name="password" />
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					<input type="submit" value="Zaloguj" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>