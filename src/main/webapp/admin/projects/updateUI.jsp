<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>诊室修改</h3>
	
	<form action="/projects/update" method="post">
		<input type="hidden" name="projectsId" value="${p.projectsId }" />
		诊室名称: <input type="text" name="projectsName" value="${p.projectsName }" /> <br />
		所属科室: <input type="text" name="departmentsId" value="${p.departmentsId }" /> <br />
		<button type="submit">修改</button>
	</form>
</body>
</html>