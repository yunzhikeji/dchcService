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
<title>人员信息检测</title>

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
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>人员信息检测
		<a class="btn btn-success radius r mr-20"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>

	<div class="pd-20">
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;" onclick="checknow()"
				class="btn btn-warning radius"><i class="Hui-iconfont">&#xe665;</i>
					当前检测</a> <a class="btn btn-primary radius" href="javascript:;"
				onclick="history()"><i class="Hui-iconfont">&#xe603;</i> 历史数据</a></span> <span
				class="r">共有数据：<strong>${jpushpersonList.size()}</strong> 条
			</span>
		</div>
		<div class="mt-20">
			<form name="jpushForm"
				action="${pageContext.request.contextPath }/jcheck.action"
				method="post">
				<table class="table table-border table-bordered table-bg">
					<thead>
						<tr class="text-c">
							<th width="80">序号ID</th>
							<th width="300">身份证号</th>
							<th width="200">姓名</th>
							<th width="200">图片</th>
							<th width="200">备注</th>
							<th width="200">上传部门</th>
							<th width="200">审核</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${jpushpersonList }" var="jpushperson"
							varStatus="index">
							<tr class="text-c">
								<td class="f-14 td-manage">${index.count }</td>
								<td>${jpushperson.idcard }</td>
								<td>${jpushperson.realname }</td>
								<td><img
									src="${pageContext.request.contextPath }/pic/${jpushperson.picurl }"
									width="128" height="128" /></td>
								<td class="f-14 td-manage"><textarea
										id="remark${jpushperson.id}" rows="4"
										style="height: 100%; width: 100%" name=""></textarea></td>
								<td>
								<c:if test="${jpushperson.unitname ==1 }">剪子股派出所</c:if> <c:if
										test="${jpushperson.unitname ==2 }">黄河涯派出所</c:if> <c:if
										test="${jpushperson.unitname ==3 }">东地派出所</c:if> <c:if
										test="${jpushperson.unitname ==4 }">新河东路派出所</c:if> <c:if
										test="${jpushperson.unitname ==5 }">于官屯派出所</c:if>
									<c:if test="${jpushperson.unitname ==6 }">建设街派出所</c:if>
									<c:if test="${jpushperson.unitname ==7 }">车站街派出所</c:if>
									<c:if test="${jpushperson.unitname ==8 }">湖滨北路派出所</c:if>
									<c:if test="${jpushperson.unitname ==9 }">二屯派出所</c:if>
									<c:if test="${jpushperson.unitname ==10 }">长庄派出所</c:if>
									<c:if test="${jpushperson.unitname ==11 }">刑警大队</c:if>
									<c:if test="${jpushperson.unitname ==12 }">巡警大队</c:if>
									<c:if test="${jpushperson.unitname ==13 }">治安大队</c:if>
									<c:if test="${jpushperson.unitname ==14 }">经侦大队</c:if>
									</td>


								<td class="f-14 td-manage"><a style="text-decoration: none"
									class="ml-5" onclick="result(${jpushperson.id},1);"
									href="javascript:;" title="正确"><i class="Hui-iconfont"
										style="font-size: 30px">&#xe6e1;</i></a> <a
									style="text-decoration: none" class="ml-5"
									onclick="result(${jpushperson.id},2);" href="javascript:;"
									title="不正确"><i class="Hui-iconfont" style="font-size: 30px">&#xe6dd;</i></a>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</form>
		</div>

	</div>
</body>
</html>