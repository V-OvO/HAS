<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>患者添加</h3>
	<form action="/patients/save">
		<!-- <input name="patients_id"><br> auto_increment-->
		用户id:<input name="usersId"><br>
		患者姓名:<input name="patientsName"><br>
		电话:<input name="patientsPhone"><br>
		身份证:<input name="patientsIdcard"><br>
		信用值:<input name="patientsCredit"><br>
		<button>添加</button>
	</form>
	
</body>
</html>