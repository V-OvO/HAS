<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>诊室列表</h3>
	<table>
		<tr>
			<td>诊室id</td>
			<td>诊室名称</td>
			<td>所属科室</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="p">
			<tr>
				<td>${p.projectsId }</td>
				<td>${p.projectsName }</td>
				<td>${p.departmentsId }</td>
				<td>
					<a href="/projects/delete/${p.projectsId }">删除</a>
					|
					<a href="/projects/updateUI/${p.projectsId }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/admin/projects/saveUI.jsp">增加</a>
</body>
</html>