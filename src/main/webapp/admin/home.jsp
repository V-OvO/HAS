<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h3>医院预约平台</h3>
<style>
	.title {
		text-align: center; height: 50px; line-height: 25px; font-size:15px; text-shadow:5px 5px 5px gray
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row title">
			<div class="col-md-12">
				权限管理模块<br />
					
				欢迎<shiro:principal />登录 <a href="/logout">安全退出</a>
			</div>
		</div>
		<div class="row" style="height: 500px;">
			<div class="col-md-3">
				<ul>
					<li>
						权限管理
						<ul>
<<<<<<< HEAD
							<li><a href="/permissions/findAll" target="mainFrame">查看权限</a></li>
=======
							<li><a href="/permissions/findAll" target="mainFrame">查看权限</a></li>
>>>>>>> branch 'dev' of git@github.com:V-OvO/HAS.git
							<li><a href="/permissions/saveUI" target="mainFrame">添加权限</a></li>
						</ul>
					</li>
					<li>
						角色管理
						<ul>
							<li><a href="/roles/findAll" target="mainFrame">查看角色</a></li>
							<li><a href="/admin/roles/saveUI.jsp" target="mainFrame">添加角色</a></li>
						</ul>
					</li>
				</ul>
				<ul>
					<li>号源
						<ul>
							<li><a href="/pool/find" target="mainFrame">查看号源</a></li>
							<li><a href="/pool/saveUI" target="mainFrame">添加号源</a></li>
						</ul>
					</li>
					
				</ul>
				<ul>
					<li>排班
						<ul>
							<li><a href="/schedulings/find" target="mainFrame">查看排班</a></li>
							<li><a href="/admin/schedulings/saveUI.jsp" target="mainFrame">添加班次</a></li>
						</ul>
					</li>
					
				</ul>
			</div>
			<div class="col-md-9">
				<iframe name="mainFrame" height="100%" width="100%" frameborder="0"></iframe>
			</div>
		</div>
	</div>	
</body>
</html>