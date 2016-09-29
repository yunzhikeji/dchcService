<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="hui/html5.js"></script>
<script type="text/javascript" src="hui/respond.min.js"></script>
<script type="text/javascript" src="hui/PIE_IE678.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/ncss.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/skin/blue/skin.css" rel="stylesheet" type="text/css"  />
<link href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>管理系统</title>
<meta name="keywords" content="">
</head>
<body>
<header class="Hui-header cl">
 <a class="Hui-logo l" href="#"></a>  <img style=" margin-top:25px " src="${pageContext.request.contextPath }/images/logo.png" width="489" height="70">
<ul class="nav" style="margin-right:20px;margin-top:25px">
    <li><a href="${pageContext.request.contextPath }/login/logout.action" title="注销"><img src="${pageContext.request.contextPath }/images/icon07.png" title="注销" /><h4>注销</h4> </a></li>
    </ul>
	<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a> </header>
<aside class="Hui-aside" style="overflow-y:auto; overflow-x:hidden;">
	<div class="menu_dropdown bk_2">
    <div class="my-profile dropDown dropDown_hover"  >
						<a href="#" class="my-profile-pic">
							<img src="${pageContext.request.contextPath }/images/user.jpg" alt="" />
						</a>
						<span class="first-child">您好 ，<strong>${username}</strong></span>
						<span>警号：123456</span>
	</div>
    <div class="divider"></div>
    
		<dl id="menu-article">
			<dt><i class="Hui-iconfont ">&#xe616;</i> 日常工作<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd >
			  <ul>
					<li><a href="${pageContext.request.contextPath }/jcheck.action" target="myiframe">人员信息检测 </a></li>
					<li><a href="${pageContext.request.contextPath }/person/list.action" target="myiframe">人员信息导出</a></li>
                    <li><a href="${pageContext.request.contextPath }/locate/list.action" target="myiframe">地点(场所)</a></li>
                    <li><a href="${pageContext.request.contextPath }/relevant-list.html" target="myiframe">相关人员</a></li>
				</ul>
			</dd>
		</dl>		
	</div>
    

</aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)" ></a></div>
<section class="Hui-article-box">
  <div id="iframe_box" class="Hui-article">
	  <div class="show_iframe">
			<div style="display:none" class="loading"></div>
            <iframe name="myiframe" scrolling="yes" frameborder="0" src="${pageContext.request.contextPath }/jcheck.action"></iframe>
	  </div>
	</div>
  <div id="Hui-tabNav" class="Hui-tabNav">
    <div class="Hui-tabNav-wp">
      <ul id="min_title_list" class="acrossTab cl">
        <li class="active"><span title="日常工作">日常工作</span><em></em></li>
      </ul>
    </div>
    
  </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/H-ui.admin.js"></script> 

</body>
</html>