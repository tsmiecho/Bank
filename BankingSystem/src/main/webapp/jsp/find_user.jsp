<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Bank</title>
</head>
<body>

	<form method="post">
		<input type="text" name="value" placeholder="wyszukaj" /> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="submit">
	</form>

	<c:if test="${not empty users}">
		<ul>
		<c:forEach items="${users}" var="user">
			
			<form method="POST" action="/BankingSystem/admin/delete_user">
				<li>${user.name} ${user.surname} 
				<input type="hidden" value="${user.id}" name="userId">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<input type="submit" value="Usuń"></li>
			</form>
			
		</c:forEach>
		</ul>
	</c:if>
	
</body>
</html>