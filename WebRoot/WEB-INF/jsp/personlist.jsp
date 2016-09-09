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
</script>
</head>
<body>

	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l"><a
			href="${pageContext.request.contextPath }/person/export.action"
			class="btn btn-danger radius"><i class="Hui-iconfont"></i>
				导出EXCEL</a></span>



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
						<th width="10%">姓名</th>
						<th width="10%">性别</th>
						<th width="10%">出生日期</th>
						<th width="10%">户籍</th>


					</tr>
				</thead>
				<tbody>
					<c:forEach items="${personList }" var="person" varStatus="index">
						<tr>
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
						</tr>
					</c:forEach>

					<!--	<tr class="text-c">
					<td><input type="checkbox" value="" name=""></td>
					<td>10001</td>
					<td class="text-l"><u style="cursor: pointer"
						class="text-primary"
						onClick=""
						title="查看">资讯标题</u></td>
					<td>&nbsp;</td>
					<td>城北派出所</td>
					<td>21212</td>
					<td class="f-14 td-manage"></td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage">张然</td>
					<td class="f-14 td-manage"><a style="text-decoration: none"
						class="ml-5" onClick="article_edit('编辑信息','run-add.html','10001')"
						href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
						<a style="text-decoration: none" class="ml-5"
						onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i
							class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
				<tr class="text-c">
					<td><input type="checkbox" value="" name=""></td>
					<td>10001</td>
					<td class="text-l"><u style="cursor: pointer"
						class="text-primary"
						onClick="article_edit('查看','article-zhang.html','10001')"
						title="查看">资讯标题</u></td>
					<td>&nbsp;</td>
					<td>城北派出所</td>
					<td>21212</td>
					<td class="f-14 td-manage"></td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage"><a style="text-decoration: none"
						class="ml-5"
						onClick=""
						href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
						<a style="text-decoration: none" class="ml-5"
						onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i
							class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>   -->
				</tbody>
			</table>
		</form>
	</div>

</body>
</html>