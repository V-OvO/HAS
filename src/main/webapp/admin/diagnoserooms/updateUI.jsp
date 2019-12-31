<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>诊室修改</h3>
	<form action="/diagnoserooms/update">
		<input type="hidden" name="diagnoseroomsId" value="${d.patientsId }">
		诊室名称:<input name="diagnoseroomsName" value="${d.diagnoseroomsName }"><br>
		项目id:<input name="projectsId" value="${d.projectsId}"><br>
		<button>添加</button>
	</form>
</body>
</html>