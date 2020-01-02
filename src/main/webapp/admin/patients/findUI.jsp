<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>患者展示</h3>
	<table>
		<tr>
			<td>patientsId</td>
			<td>users_id</td>
			<td>patients_name</td>
			<td>patients_phone</td>
			<td>patientsIdcard</td>
			<td>patients_credit</td>
			<td>操作</td>
		</tr>
 		<c:forEach items="${list }" var="p" >
			<tr>
				<td>${ p.patientsId}</td>
				<td>${ p.usersId}</td>
				<td>${ p.patientsName}</td>
				<td>${ p.patientsPhone}</td>
				<td>${ p.patientsIdcard}</td>
				<td>${ p.patientsCredit}</td>
				<td>
				<a href="/patients/delete/${p.patientsId }">删除</a>
				|
				<a href="/patients/updateUI/${p.patientsId }">修改</a>
				</td>
			</tr>
		</c:forEach> 
		
	</table>
	<button type="button" onclick="location.href='/admin/patients/saveUI.jsp'">添加用户</button>
	
	
</body>
</html>