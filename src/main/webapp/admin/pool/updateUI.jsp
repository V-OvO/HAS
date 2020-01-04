<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>
	<script type="text/javascript">
		$(function(){
			$("select option[value='"+${pool.schedulingsId}+"']").prop("selected","selected");
			});
	</script>
	<form action="/pool/update">
		<input type="hidden" name="poolId" value="${pool.poolId}"/><br/>
		号码剩余量：<input type="text" name="poolResidue" value="${pool.poolResidue}"/><br/>
		班次Id：<select name="schedulingsId">
					<p:forEach items="${ss}" var="l">
						<option value="${l.schedulingsId}">${l.schedulingsId}</option>
					</p:forEach>
			  </select><br/>
		<button type="submit">修改</button>
	</form>
</body>
</html>