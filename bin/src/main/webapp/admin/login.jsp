<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>XXX平台 后台登录界面</h3>
	
	<form action="/users/login" method="post">
		账号：<input name="usersNumber" /> <br />
		密码：<input name="usersPassword" /> <br />
		<button type="submit">登录</button>
	</form>
</body>
</html>