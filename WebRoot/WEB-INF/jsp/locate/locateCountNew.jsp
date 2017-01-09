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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/respond.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/PIE_IE678.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css"
	rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>地点录入统计</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>录入统计
		<a class="btn btn-success radius r mr-20"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>


	<div class="pd-20">
		
		<div class="mt-20">
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr class="text-c">
						<th width="80">序号ID</th>
						<th width="100">派出所名称</th>
						<th width="100">出租房</th>
						<th width="100">非出租房</th>
						<th width="100">未选择场所</th>
						<th width="100">娱乐场所</th>
						<th width="100">服务场所</th>
						<th width="100">特种行业</th>
						<th width="100">九小场所</th>
						<th width="100">物流快递</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${locateCounts }" var="count" varStatus="index">
						<tr class="text-c">
							<td class="f-14 td-manage">${index.count }</td>
							<td><c:if test="${count.belongPlace ==1}">剪子股派出所</c:if>
								<c:if test="${count.belongPlace ==2}">黄河涯派出所</c:if>
								<c:if test="${count.belongPlace ==3}">东地派出所</c:if>
								<c:if test="${count.belongPlace ==4}">新河东路派出所</c:if>
								<c:if test="${count.belongPlace ==5}">于官屯派出所</c:if>
								<c:if test="${count.belongPlace ==6}">建设街派出所</c:if>
								<c:if test="${count.belongPlace ==7}">车站街派出所</c:if>
								<c:if test="${count.belongPlace ==8}">湖滨北路派出所</c:if>
								<c:if test="${count.belongPlace ==9}">二屯派出所</c:if>
								<c:if test="${count.belongPlace ==10}">长庄派出所</c:if>
								</td>
							<td>${count.lengthHouseCount }</td>
							<td>${count.nonLengthHouseCount }</td>
							<td>${count.placeType0Count }</td>
							<td>${count.placeType1Count }</td>
							<td>${count.placeType2Count }</td>
							<td>${count.placeType3Count }</td>
							<td>${count.placeType4Count }</td>
							<td>${count.placeType5Count }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>
</body>
</html>