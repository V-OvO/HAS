<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/schedulings/save">
		当班日期<input type="text" name="schedulingsDate"/><br/>
		开始时间<input type="text" name="schedulingsStarttime"/><br/>
		结束时间<input type="text" name="schedulingsEndtime"/><br/>
		医生Id<input type="text" name="doctorsId"/><br/>
	    <button type="submit">添加</button>
	</form>
</body>
</html>