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
	<h3>修改权限</h3>
	
	<form action="/permissions/update" method="post">
		<input type="hidden" name="pid" value="${p.pid }" />
		权限名称: <input type="text" name="pname" value="${p.pname }" /> <br />
		<button type="submit">修改权限</button>
	</form>
</body>
</html>