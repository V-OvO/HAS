<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/pool/save" method="post">
		号码剩余量：<input type="text" name="poolResidue"/><br/>
		班次Id：
			<select name="schedulingsId">
				<p:forEach items="${list}" var="l">
					<option value="${l.schedulingsId}">${l.schedulingsId}</option>
				</p:forEach>
			</select><br/>
		医生Id：
			<select name="doctorsId">
				<p:forEach items="${list1}" var="li">
					<option value="${li.doctorsId}">${li.doctorsName}</option>
				</p:forEach>
			</select>
		<button type="submit">添加</button>
	</form>
</body>
</html>