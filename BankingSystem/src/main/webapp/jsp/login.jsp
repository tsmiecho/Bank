<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Bank</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/login">
		login<input type="text" name="login" /> 
		password<input type="password" name="password" />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="submit" value="Zaloguj" />
	</form>
</body>
</html>