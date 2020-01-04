<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../commons/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>修改角色</h3>
	<form action="/roles/update" method="post">
		<input type="hidden" name="rolesId" value="${roles.rolesId }" />
		角色名: <input type="text" name="rolesName" value="${roles.rolesName }" /> <br />
		<button type="submit">修改</button>
	</form>
</body>
</html>