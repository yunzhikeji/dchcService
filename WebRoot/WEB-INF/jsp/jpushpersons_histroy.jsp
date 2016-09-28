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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="hui/html5.js"></script>
<script type="text/javascript" src="hui/respond.min.js"></script>
<script type="text/javascript" src="hui/PIE_IE678.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>人员检测历史信息</title>
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

</script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>人员检测历史信息
<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>


<div class="pd-20">
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="checknow()" class="btn btn-warning radius"><i class="Hui-iconfont">&#xe665;</i> 当前检测</a> <a class="btn btn-primary radius" href="javascript:;"  onclick="history()"><i class="Hui-iconfont">&#xe603;</i> 历史数据</a></span> <span class="r">共有数据：<strong>${jpushpersonList.size()}</strong> 条</span> </div>
	<div class="mt-20">
		<form name="jpushForm"
			action="${pageContext.request.contextPath }/jcheck.action"
			method="post">
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr class="text-c">
						<th width="5%">序号ID</th>
						<th width="20%">身份证号</th>
						<th width="5%">姓名</th>
						<th width="20%">图片</th>
						<th width="20%">备注</th>
						<th width="5%">上传时间</th>
						<th width="5%">返回时间</th>
						<th width="20%">审核</th>
					</tr>
			</thead>
			<tbody>
					<c:forEach items="${jpushpersonList}" var="jpushperson"
						varStatus="index">
						<tr class="text-c">
							<td class="f-14 td-manage">${index.count }</td>
							<td>${jpushperson.idcard }</td>
							<td>${jpushperson.realname }</td>
							<td><img
								src="${pageContext.request.contextPath }/pic/${jpushperson.picurl }"
								width="128" height="128" /></td>
							<td>${jpushperson.remark}</td>
							<td>${jpushperson.checkstarttime}</td>
							<td>${jpushperson.backcheckresulttime}</td>
							<td class="f-14 td-manage"><c:if test="${jpushperson.istrue ==1 }">
									<img src="${pageContext.request.contextPath }/images/tg.png">
									  <a style="text-decoration:none;" class="ml-5" onclick="" href="${pageContext.request.contextPath }/jdelete.action?id=${jpushperson.id}" title="删除"><i class="Hui-iconfont" style="font-size:30px; color:#F00;">&#xe6dd;</i></a>




								</c:if> <c:if test="${jpushperson.istrue ==2 }">
									 <img src="${pageContext.request.contextPath }/images/wtg.png">

									 <a style="text-decoration:none;" class="ml-5" onclick="" href="${pageContext.request.contextPath }/jdelete.action?id=${jpushperson.id}" title="删除"><i class="Hui-iconfont" style="font-size:30px; color:#F00;">&#xe6dd;</i></a>
								</c:if></td>
						</tr>
					</c:forEach>
			</tbody>
		</table>
		</form>
	</div>
    
</div>
</body>
</html>