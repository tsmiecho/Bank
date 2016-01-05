<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Bank</title>
</head>
<body>
	<form:form modelAttribute="ftransfer" method="POST" action="/BankingSystem/transfer_zagraniczny">
   <table>
    <tr>
        <td><form:label path="title">title</form:label></td>
        <td><form:input path="title" /></td>
    </tr>
    <tr>
        <td><form:label path="amount">amount</form:label></td>
        <td><form:input path="amount" /></td>
    </tr>
    <tr>
        <td><form:label path="receiverName">receiverName</form:label></td>
        <td><form:input path="receiverName" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>