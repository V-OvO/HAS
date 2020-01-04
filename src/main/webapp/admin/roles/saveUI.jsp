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
	<h3>添加角色</h3>
	<form action="/roles/save" method="post">
		角色名: <input type="text" name="rname" /> <br />
		<button type="submit">添加</button>
	</form>
</body>
</html>