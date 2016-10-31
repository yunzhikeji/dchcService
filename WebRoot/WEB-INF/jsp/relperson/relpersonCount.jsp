<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/respond.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/PIE_IE678.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>地点录入统计</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>录入统计
<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>


<div class="pd-20">
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="${pageContext.request.contextPath }/relperson/count?countType=10" class="btn btn-primary radius">所属派出所统计</a> </span>
  <span class="l" style="margin-left:2px"><a href="${pageContext.request.contextPath }/relperson/count?countType=2" class="btn btn-primary radius">是否办理居住证统计</a> </span>
  <span class="l" style="margin-left:2px"><a href="${pageContext.request.contextPath }/relperson/count?countType=5" class="btn btn-primary radius">相关人员类别统计</a> </span>
   <span class="r">共有数据：<strong>${totalNumber}</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr class="text-c">
					<th width="80">序号ID</th>
					<th width="200">统计类型</th>
					<th width="200">统计数量</th>
				</tr>
			</thead>
			<tbody>
					<c:if test="${countVOs== null || fn:length(countVOs) == 0}">
					   <tr class="text-c">
					   	<td colspan="3">
					   		暂无数据.
					   	</td>
						</tr>
					</c:if>
					<c:forEach items="${countVOs }" var="count" varStatus="index">
						<tr class="text-c">
							<td class="f-14 td-manage">${index.count }</td>
							<td>${count.countTypeName}</td>
							<td>${count.number }</td>
						</tr>
					</c:forEach>
			</tbody>
		</table>
	</div>
    
</div>
</body>
</html>