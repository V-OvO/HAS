<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	input{
		width: 300px;
	}
</style>
</head>
<body>
	<form action="/schedulings/update">
	    <input type="hidden" name="schedulingsId" value="${schedulingsId}">
		当班日期<input type="text" name="schedulingsDate" value="<f:formatDate value='${s.schedulingsDate}' pattern='yyyy-MM-dd HH:mm:ss' />"/><br/>
		开始时间<input type="text" name="schedulingsStarttime" value="<f:formatDate value='${s.schedulingsStarttime}' pattern='yyyy-MM-dd HH:mm:ss' />"/><br/>
		结束时间<input type="text" name="schedulingsEndtime" value="<f:formatDate value='${s.schedulingsEndtime}' pattern='yyyy-MM-dd HH:mm:ss' />"/><br/>
		医生Id<input type="text" name="doctorsId" value="${s.doctorsId}"/><br/>
	    <button type="submit">修改</button>
	</form>
</body>
</html>