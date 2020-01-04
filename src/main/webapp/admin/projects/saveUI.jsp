<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>增加诊室</h3>
	<form action="/projects/save" method="post">
		诊室名称: <input type="text" name="projectsName" /> <br />
		所属科室: <input type="text" name="departmentsId" /> <br />
		<button type="submit">添加诊室</button>
	</form>
</body>
</html>