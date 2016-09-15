<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${pageContext.request.contextPath }/css/H-ui.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/ncss.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/css/Hui-iconfont/1.0.1/iconfont.css"
	rel="stylesheet" type="text/css" />
<title>人员信息列表</title>

<script type="text/javascript">
	function checknow() {
		//提交form
		document.jpushForm.action = "${pageContext.request.contextPath }/jcheck.action";
		document.jpushForm.submit();
	}
	function history() {
		//提交form
		document.jpushForm.action = "${pageContext.request.contextPath }/jlist.action";
		document.jpushForm.submit();
	}
	
	function result( pid, istrue)
	{
		var url = "${pageContext.request.contextPath }/push/result.action?id="+pid+"&istrue="+istrue;
		
		var textremark =  document.getElementById("remark"+pid).value;
			
		if (textremark == null || textremark == undefined || textremark == '') { 
			textremark = ''; 
		}
		url = url + "&remark=" + textremark;
		console.log(url);
		url = encodeURI(url);
		url = encodeURI(url);
		console.log(url);
		window.location = url;
		
	}
</script>
</head>
<body>

	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l"><a href="javascript:;" onclick="checknow()"
			class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i>
				当前检测</a> <a class="btn btn-primary radius" onclick="history()"
			href="javascript:;"><i class="Hui-iconfont">&#xe603;</i> 历史数据</a></span>

	</div>
	<div class="mt-20">
		<form name="jpushForm"
			action="${pageContext.request.contextPath }/jcheck.action"
			method="post">
			<table
				class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<!-- <th width="41">&nbsp;</th> -->
						<th width="5%">序号ID</th>
						<th width="20%">身份证号</th>
						<th width="5%">姓名</th>
						<th width="30%">图片</th>
						<th width="20%">备注</th>
						<th width="20%">审核</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${jpushpersonList }" var="jpushperson"
						varStatus="index">
						<tr>
							<td class="f-14 td-manage">${index.count }</td>
							<td>${jpushperson.idcard }</td>
							<td>${jpushperson.realname }</td>
							<td><img
								src="${pageContext.request.contextPath }/pic/${jpushperson.picurl }"
								width="40%" height="100px" /></td>
							<td><textarea id="remark${jpushperson.id}" rows="4"
									style="height: 100%; width: 100%" name=""></textarea></td>
							<td>
									<div>
										<span class="l"> <a class="btn btn-primary radius"
											href="javascript:void(0);"
											onclick="result(${jpushperson.id},1);"
											style="padding-left: 16px; padding-right: 16px;"><i
												class="Hui-iconfont">&#xe6a7;</i> 正确</a> <a
											href="javascript:void(0);"
											onclick="result(${jpushperson.id},2);"
											class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6a6;</i>
												不正确</a>
										</span> <span class="r"> </span>
									</div>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</div>

</body>
</html>