<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/departments/save" method="post">
		科室名称: <input type="text" name="departmentsName" /> <br />
		科室介绍: <input type="text" name="departmentsDesc" /> <br />
		<button type="submit">添加科室</button>
	</form>
</body>
</html>