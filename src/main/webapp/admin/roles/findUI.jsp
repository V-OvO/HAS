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
	<h3>角色列表</h3>
	<table>
		<tr>
			<td>角色编号</td>
			<td>角色名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="roles">
			<tr>
				<td>${roles.rolesId }</td>
				<td>${roles.rolesName }</td>
				<td>
					<a href="/roles/delete/${roles.rolesId }">删除</a>
					|
					<a href="/roles/updateUI/${roles.rolesId }">修改</a>
					|
					<a href="/roles/grantpermissions/${roles.rolesId }">分配权限</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>