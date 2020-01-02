<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>科室修改</h3>
	<form action="/departments/update" method="post">
		<input type="hidden" name="departmentsId" value="${d.departmentsId }" />
		科室名称: <input type="text" name="departmentsName" value="${d.departmentsName }" /> <br />
		科室介绍: <input type="text" name="departmentsDesc" value="${d.departmentsDesc }" /> <br />
		<button type="submit">修改</button>
	</form>
</body>
</html>