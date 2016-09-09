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
<link href="${pageContext.request.contextPath }/skin/blue/skin.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/css/Hui-iconfont/1.0.1/iconfont.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" />
<title>管理系统</title>
<meta name="keywords" content="">
</head>
<body>
	<header class="Hui-header cl">
		<a class="Hui-logo l" href="#"><img src="${pageContext.request.contextPath }/images/logo.png"
			width="489" height="70"> </a>
		<ul class="nav" style="margin-right: 30px;">
			<li><a href="${pageContext.request.contextPath }/login/logout.action"
				 title="注销"><img
					src="${pageContext.request.contextPath }/images/icon06.png" title="注销" />
					<h4>注销</h4> </a></li>
		</ul>

		<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a>
	</header>
	<aside class="Hui-aside"
		style="overflow-y: auto; overflow-x: hidden; overflow-y: hidden;">
		
		
		
		<div class="my-profile dropDown dropDown_click ">
				<a href="javascript:;" class="my-profile-pic dropDown_A"
					aria-expanded="false" aria-haspopup="true" data-toggle="dropdown">
					<img src="${pageContext.request.contextPath }/images/touxiang.jpg" alt="暂无照片" /> </a>
				<div class="dropDown-menu box-shadow text-c pt-10 mr-10">
					<ul style="color: #333; text-shadow: none">
						<p>
							所属机构：
						</p>
						<p>
							${session.userRoleo.unit.name}
						</p>
					</ul>
				</div>
				<span class="first-child">您好 ，<strong>${session.username}</strong>
				</span>
				<span>警号：${session.jobnumber}</span>
			</div>

		<div class="divider"></div>

		<ul class="ce">
			<li><i class="Hui-iconfont ">&#xe62c;</i> 日常工作
				<ul class="er" style="display: block;">
					<li class="e_li"><a href="${pageContext.request.contextPath }/jcheck.action" target="myiframe">人员信息检测 </a></li>
					<li class="e_li"><a href="${pageContext.request.contextPath }/person/list.action" target="myiframe">人员信息导出</a></li>
				</ul>
		</div>


	</aside>
	<div class="dislpayArrow">
		<a class="pngfix" href="javascript:void(0);"
			onClick="displaynavbar(this)"></a>
	</div>
	<section class="Hui-article-box">
		<div id="iframe_box" class="Hui-article">
			<div class="show_iframe">
				<div style="display: none" class="loading"></div>
				<iframe name="myiframe" scrolling="yes" frameborder="0" src="${pageContext.request.contextPath }/jcheck.action"></iframe>
			</div>
		</div>
		<div id="Hui-tabNav" class="Hui-tabNav">
			<div class="Hui-tabNav-wp">
				<ul id="min_title_list" class="acrossTab cl">
					<li class="active"><span title="我的桌面"
						data-href="userRoleAction!welcome">日常工作</span><em></em></li>
				</ul>
			</div>
			<div class="Hui-tabNav-more btn-group">
				<a id="js-tabNav-del" class="btn radius btn-default size-S"
					href="javascript:;"><i class="Hui-iconfont">&#xe6a6;</i> </a> <a
					id="js-tabNav-prev" class="btn radius btn-default size-S"
					href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i> </a> <a
					id="js-tabNav-next" class="btn radius btn-default size-S"
					href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i> </a>
			</div>
		</div>
	</section>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/layer/1.9.3/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/H-ui.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/H-ui.admin.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/bootstrap-modalmanager.js"></script>
	<script type="text/javascript">
		/*研判工具*/
		function ypgj(title, url, w, h) {
			layer.open({
				type : 2,
				title : title,
				shadeClose : true,
				shade : 0.8,
				area : [ w, h ],
				content : url
			//iframe的url
			});
		}
	</script>
	<iframe scrolling="yes" frameborder="0" src="${pageContext.request.contextPath }/jcheck.action"></iframe>
</body>
</html>