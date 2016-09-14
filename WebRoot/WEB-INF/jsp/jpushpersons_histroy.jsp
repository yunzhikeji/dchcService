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
						<th width="5%">序号ID</th>
						<th width="20%">身份证号</th>
						<th width="5%">姓名</th>
						<th width="30%">图片</th>
						<th width="20%">备注</th>
						<th width="20%">审核</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${jpushpersonList}" var="jpushperson"
						varStatus="index">
						<tr>
							<td class="f-14 td-manage">${index.count }</td>
							<td>${jpushperson.idcard }</td>
							<td>${jpushperson.realname }</td>
							<td><img
								src="${pageContext.request.contextPath }/pic/${jpushperson.picurl }"
								width="40%" height="100px" /></td>
							<td>${jpushperson.remark}</td>
							<td><c:if test="${jpushperson.istrue ==1 }">
									<span
										style="font-size: 16px; color: #5eb95e; border: 1px solid #5eb95e; padding-left: 8px; padding-right: 8px;"><strong>&nbsp;正确&nbsp;</strong></span>
									<a
										href="${pageContext.request.contextPath }/jdelete.action?id=${jpushperson.id}"
										class="btn btn-danger radius" style="margin-left: 50px"><i
										class="Hui-iconfont">&#xe6a6;</i> 删除</a>
								</c:if> <c:if test="${jpushperson.istrue ==0 }">
									<span
										style="font-size: 16px; color: #dd514c; border: 1px solid #dd514c; padding-left: 5px; padding-right: 5px;"><strong>不正确</strong></span>

									<a
										href="${pageContext.request.contextPath }/jdelete.action?id=${jpushperson.id}"
										class="btn btn-danger radius" style="margin-left: 50px"><i
										class="Hui-iconfont">&#xe6a6;</i> 删除</a>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</div>

</body>
</html>