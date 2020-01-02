<<<<<<< HEAD
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
	<h3>添加权限</h3>
	
	<form action="/permissions/save" method="post">
		权限名称: <input type="text" name="permissionName" /> <br />
		权限简介:<input type="text" name="permissionsDesc" /><br />
		父级权限:
			<select name="parentid">
				<option value="0">无</option>
				<c:forEach items="${list }" var="p">
					<option value="${p.permissionsId }">${p.permissionName }</option>
				</c:forEach>
			</select>
			
		<br>
		<button type="submit">添加权限</button>
=======
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/permissions/save" method="post">
		权限名称<input type="text" name="permissionName"/><br>
		权限备注<input type="text" name="permissionsDesc"/><br>
		父级权限:
			<select name="parentid">
				<option value="0">无</option>
				<c:forEach items="${list}" var="p">
					<option value="${p.permissionsId }">${p.permissionName }</option>
				</c:forEach>
			</select>
		<br>
		<button>添加权限</button>
>>>>>>> branch 'dev' of git@github.com:V-OvO/HAS.git
	</form>
</body>
</html>