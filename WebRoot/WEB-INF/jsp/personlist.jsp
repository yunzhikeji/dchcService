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
<title>人员信息导出</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>人员信息导出
<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>


<div class="pd-20">
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="${pageContext.request.contextPath }/person/export.action" class="btn btn-success radius"><i class="Hui-iconfont">&#xe644;</i> 导出EXCEL</a> <a href="${pageContext.request.contextPath }/person/clean.action"  class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 清空</a></span> <span class="r">共有数据：<strong>${personList.size()}</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr class="text-c">
					<th width="80">序号ID</th>
					<th width="200">身份证号</th>
					<th width="200">姓名</th>
					<th width="200">性别</th>
					<th width="200">出生日期</th>
                    <th width="200">户籍</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${personList }" var="person" varStatus="index">
						<tr class="text-c">
							<td class="f-14 td-manage">${index.count }</td>
							<td>${person.idcard }</td>
							<td>${person.realname }</td>
							<td><c:if test="${person.gender ==null||person.gender ==''}"></c:if>
								<c:if test="${person.gender !=null&&person.gender !=''}">
									<c:if test="${person.gender ==1 }">男</c:if>
									<c:if test="${person.gender ==2 }">女</c:if>
								</c:if></td>
							<td>${person.birthday }</td>
							<td>${person.regaddress }</td>
							<td class="f-14 td-manage"><a style="text-decoration: none;"
								class="ml-5" onclick="return confirm('你确定删除该信息吗？')"
								href="${pageContext.request.contextPath }/person/delete.action?id=${person.id}"
								title="删除"><i class="Hui-iconfont">&#xe6dd;</i></a></td>
						</tr>
					</c:forEach>
			</tbody>
		</table>
	</div>
    
</div>
</body>
</html>