<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>用户管理</title> <!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/respond.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/PIE_IE678.js"></script>
<![endif]-->
	<link href="${pageContext.request.contextPath }/css/user.css"
		rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath }/css/1.0.7/iconfont.css"
		rel="stylesheet" type="text/css" />
	<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
</head>

<body>
	<div class="pd-20">
		<form action="" method="post" class="form form-horizontal" id=" ">
			<table class="table">
				<thead class="text-c">
					<tr class="text-d">
						<th colspan="8" style="text-align: left; height: 35px;"><a class="button blue bla smallrounded" href="${pageContext.request.contextPath }/user/addUser" target="_self" style="font-size:14px;">
								<i class="Hui-iconfont">&nbsp;&#xe607;&nbsp;</i>添加用户
							</a>
							<button class="button orange bla smallrounded" style="font-size: 14px;margin-left:3px;line-height:14px; ">
								<i class="Hui-iconfont">&nbsp;&#xe609;&nbsp;</i>批量删除
							</button></th>
					</tr>
					<tr class="text-d">
						<th width="5%"></th>
						<th width="5%" style="font-size: 14px;">序号</th>
						<th width="20%" style="font-size: 14px;">用户名</th>
						<th width="20%" style="font-size: 14px;">真实姓名</th>
						<th width="20%" style="font-size: 14px;">管理级别</th>
						<th width="10%" style="font-size: 14px;">密码初始化</th>
						<th width="10%" style="font-size: 14px;"></th>
						<th width="10%" style="font-size: 14px;"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList }" var="user">
						<tr class="text-c">
							<td class="text-c"><input name="" type="checkbox" value="" /></td>
							<td>1</td>
							<td>${user.username }</td>
							<td>${user.realname }</td>
							<td><input name="vd" type="radio" value="1"
								checked="checked" /> A <input name="vd" type="radio" value="4" />
								B <input name="vd" type="radio" value="6" /> C</td>
							<td class="text-c"><input name="" type="checkbox" value="" /></td>
							<td><a id="edit" href="${pageContext.request.contextPath }/user/editUserUI" class="button blue bigrounded bla"
								style="font-size: 14px;"><i class="Hui-iconfont">&nbsp;&nbsp;&nbsp;&#xe647;</i>编辑&nbsp;&nbsp;&nbsp;</a></td>
							<td><button class="button orange bla smallrounded" style="font-size: 14px;line-height:14px;">
									<i class="Hui-iconfont">&nbsp;&#xe609;&nbsp;</i>删除
								</button></td>
						</tr>


					</c:forEach>

				</tbody>
			</table>

		</form>
		<div class="digg">
			<span class="disabled">&lt; </span> <span class="current">1</span> <a
				href="#?page=2">2</a> <a href="#?page=3">3</a> <a href="#?page=4">4</a>
			<a href="#?page=5">5</a> <a href="#?page=6">6</a> <a href="#?page=7">7</a>
			... <a href="#?page=199">199</a> <a href="#?page=200">200</a> <a
				href="#?page=2"> &gt; </a>
		</div>
	</div>
</body>
</html>
