<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>诊室展示</h3>
	<table>
		<tr>
			<td>diagnoserooms_id</td>
			<td>diagnoserooms_name</td>
			<td>projects_id</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="d">
			<tr>
				<td>${ d.diagnoseroomsId}</td>
				<td>${ d.diagnoseroomsName}</td>
				<td>${ d.projectsId}</td>
				<td>
				<a href="/diagnoserooms/delete/${d.diagnoseroomsId }">删除</a>
				|
				<a href="/diagnoserooms/updateUI/${d.diagnoseroomsId }">修改</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<button type="button" onclick="location.href='/admin/diagnoserooms/saveUI.jsp'">添加诊室</button>
	
</body>
</html>