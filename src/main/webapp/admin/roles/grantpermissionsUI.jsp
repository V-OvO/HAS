<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../commons/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/js/zTree_v3/css/zTreeStyle/zTreeStyle.css" />
<script src="/js/zTree_v3/js/jquery.ztree.all.min.js"></script>
</head>
<body>
	<h3>为${r.rname }角色分配权限</h3>
	<ul id="ztree" class="ztree"></ul>
	<button type="button">分配</button>
	<script>
		$(function() {

			$("button:eq(0)").click(function() {
				var checkedNodes = ztree.getCheckedNodes();
				var pids = [];
				var rid = ${r.rid};
				for(var i = 0; i < checkedNodes.length; i++) {
					pids.push(checkedNodes[i].pid);
				}

				window.location = "/roles/grantpermissions?rid="+rid+"&pids="+pids;
			});
			
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
					check: {
						enable:true
					}
			};
	
			var nodes = ${treejson};
			
			var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);

			ztree.expandAll(true);

			var hasPermissionList = ${hasPermissionsJson };


			var rootnodes = ztree.getNodes();
			var allnodes = ztree.transformToArray(rootnodes);

			for(var i = 0; i < allnodes.length; i++) {
				if(exists(hasPermissionList, allnodes[i].pid)) {
					ztree.checkNode(allnodes[i], true, false);
				}
			}

			function exists(arr, pid) {
				for(var i = 0; i < arr.length; i++) {
					if(arr[i].pid == pid) {
						return true;
					}
				}
				return false;
			}
			
		});
	</script>
</body>
</html>