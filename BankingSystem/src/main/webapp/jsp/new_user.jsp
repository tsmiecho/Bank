<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Bank</title>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
	<form:form modelAttribute="user" method="POST" action="${pageContext.request.contextPath}/new_user">
		<table>
			<form:hidden path="enabled" value="true" />
			<form:hidden path="userRole" value="ROLE_USER" />
			<tr>
				<td><form:label path="name">name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="surname">surname</form:label></td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td><form:label path="login">login</form:label></td>
				<td><form:input path="login" /></td>
			</tr>
			<tr>
				<td><form:label path="password">password</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
		<div class="g-recaptcha" data-sitekey="6LeHuRQTAAAAAIHsh-gb-P37_N0aRESDWAoF6Rmf"></div>
	</form:form>
</body>
</html>