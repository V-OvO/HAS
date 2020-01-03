<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>患者修改</h3>
	<form action="/patients/update">
		<input type="hidden" name="patientsId" value="${p.patientsId }">
		用户id:<input name="usersId" value="${p.usersId }"><br>
		患者姓名:<input name="patientsName" value="p.patientsName"><br>
		电话:<input name="patientsPhone" value="p.patientsPhone"><br>
		身份证:<input name="patientsIdcard" value="p.patientsIdcard"><br>
		信用值:<input name="patientsCredit" value="p.patientsCredit"><br>
		<button>添加</button>
	</form>
</body>
</html>