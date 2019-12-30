<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
<style type="text/css">
	/* .container-fluid{
		background-image: url(/imgs/319541.jpg);
		图片暂无法显示
	} */
	#top{
		height: 100px;
		text-align: center;		
		padding-top: 80px;
	}
	#mid{
		
		padding-left: 430px;
		padding-top: 120px;
		height: 400px;
	}
	#down{
		height: 130px;
		text-align: center;	
	}
</style>
</head>
<body >
	<div class="container-fluid">
		<div class="row"  id="top">
			<div class="col-md-12">
				<h1>欢迎登录xx医院预约系统</h1>
			</div>
		</div>
		<div class="row" id="mid">
			<div class="col-md-12">
				<form action="/users/login" method="post" class="form-horizontal" role="form" >	
					<div class="form-group">
					    <label for="usersNumber" class="col-md-2 control-label" style="color: black" >用户名</label>
					    <div class="col-md-3">
					      <input type="text" class="form-control" name="usersNumber"  placeholder="请输入用户名" >
					    	<span id="PS" style="color: white"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="usersPassword" class="col-sm-2 control-label" style="color: black">密码</label>
					    <div class="col-md-3">
					      <input type="password" class="form-control" name="usersPassword" placeholder="请输入密码">
					    </div>
					  </div>
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-primary">登陆</button>
					    </div>
					  </div>				
				</form>
			</div>
		</div>
		<div class="row" id="down">
				<div class="col-md-12" >
					<h5>&copy;版权所有</h5>
				</div>
			</div>
	</div>
</body>
</html>