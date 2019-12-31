<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page isELIgnored="false"%>
<%@ include file="../commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="/js/zTree_v3/css/zTreeStyle/zTreeStyle.css"/>
<script src="/js/zTree_v3/js/jquery.ztree.all.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>权限列表</h3>
	<ul id="ztree" class="ztree"></ul>
	<script>
		$(function() {

			var setting = {
					data: {
						simpleData: {
							enable:true,
							pIdKey:"parentId",
							idKey:"pid"
						},
						key: {
							name:"pname"
						}
					},
					edit: {
						enable:true
					},
					callback: {
						beforeRemove: function(treeId, treeNode) {
							if(treeNode.isParent) {
								alert("不能删除父节点");
								return false;
							}
							return true;
						},
						onRemove: function(event, treeId, node) {
							window.location = "/permissions/delete/" +node.pid;
						},
						onRename: function(event, treeid, node) {
							window.location = "/permissions/update?pid="+node.pid+"&pname="+node.pname;
						}
					}
			};

			var nodes = ${treejson};
			
			var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);

			ztree.expandAll(true);
		});
	</script>
</body>
</html>