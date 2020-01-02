<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>科室列表</h3>
	<table>
		<tr>
			<td>科室id</td>
			<td>科室名称</td>
			<td>科室介绍</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="d">
			<tr>
				<td>${d.departmentsId }</td>
				<td>${d.departmentsName }</td>
				<td>${d.departmentsDesc }</td>
				<td>
					<a href="/departments/delete/${d.departmentsId }">删除</a>
					|
					<a href="/departments/updateUI/${d.departmentsId }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/admin/departments/saveUI.jsp">增加</a>
</body>
</html>