<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>Bank</title>
</head>
<body>
	<sec:authorize access="hasRole('ROLE_USER')">
		    Informacja tylko dla zalogowanych
	</sec:authorize>
	Hello 
</body>
</html>