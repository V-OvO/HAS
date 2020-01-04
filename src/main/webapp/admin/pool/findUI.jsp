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
 	    .pool{
 	    	font-size: 12px;
			text-align: center;
 	    }
 		.pool td{
 		    width: 300px;
 			height: 30px;
 			border: 1px solid black;
 		}
 	</style>
</head>
<body>
	<table class="pool" cellspacing="0">
		<tr>
			<td>号码Id</td>
			<td>号码剩余量</td>
			<td>排班Id</td>
			<td>排班时间</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>医生Id</td>
			<td>医生姓名</td>
			<td>医生诊室</td>
			<td>操作</td>
		</tr>
	
		<p:forEach items="${list}" var="l">
			<tr>
				<td>${l.poolId}</td>
				<td>${l.poolResidue}</td>
				<td>${l.schedulingsId}</td>
				<td><f:formatDate value="${l.schedulings.schedulingsDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><f:formatDate value="${l.schedulings.schedulingsStarttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><f:formatDate value="${l.schedulings.schedulingsEndtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${l.schedulings.doctorsId}</td>
					<p:forEach items="${l.schedulings.doctors}" var="y">
					
						<td>${y.doctorsName}</td>
						<td>${y.diagnoseroomsId}</td>
					
					</p:forEach>
				<td>
					<a href="/pool/updateUI/${l.poolId}">修改</a>
					|
					<a href="/pool/find/${l.poolId}">删除</a>
				</td>
			</tr>
		</p:forEach>
	</table>
</body>
</html>