<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.schedulings{
		font-size: 12px;
		text-align: center;
	}
	.schedulings td{
	        width: 300px;
 			height: 30px;
		border: 1px solid black;
		
	}
</style>
</head>
<body>
	<table class="schedulings" cellspacing="0">
		<tr>
			<td>排班Id</td>
			<td>当班日期</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>医生Id</td>
			<td>操作</td>
		</tr>
		<p:forEach items="${list}" var="l">
			<tr>
				<td>${l.schedulingsId}</td>
				<td><f:formatDate value="${l.schedulingsDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><f:formatDate value="${l.schedulingsStarttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><f:formatDate value="${l.schedulingsEndtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${l.doctorsId}</td>
				<td>
					<a href="/admin/schedulings/updateUI/${l.schedulingsId}">修改</a>
					|
					<a href="/schedulings/delete/${l.schedulingsId}">删除</a>
				</td>
			</tr>
		</p:forEach>
	</table>
</body>
</html>