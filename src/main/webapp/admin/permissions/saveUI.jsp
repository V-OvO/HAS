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
	</form>
</body>
</html>