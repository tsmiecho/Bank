<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<form method="post">
			<div class="row">
				<div class = "form-group">
					<input type="text" name="value" placeholder="wyszukaj" />
				</div>
			</div>
			<div class="row">
				<div class = "form-group">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> <input type="submit">
				</div>
			</div>
		</form>

		<c:if test="${not empty users}">
			<c:forEach items="${users}" var="user">
				<div class="row">
					<div class = "form-group">
					<form method="POST" action="${pageContext.request.contextPath}/admin/delete_user">
						${user.name} ${user.surname}
						<input type="hidden" value="${user.id}" name="userId">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						<input type="submit" value="Usuń">
					</form>
					</div>
				</div>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>