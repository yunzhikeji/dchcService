﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<title>用户管理</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>用户管理
		<a class="btn btn-success radius r mr-20"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>

	<form id="form1" class="Huiform" method="post"
		action="${pageContext.request.contextPath }/user/list" target="_self">
		<div class="pd-20">
			<div class="text-c">

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					style="line-height: 35px;">
					<tr height="35">
						<td align="left">真实姓名： <input type="text" name="realname"
							placeholder="真实姓名" class="input-text" style="width: 300px"></td>
						<td align="left"><input type="submit" class="btn btn-success"
							id="button2" value="查询" onClick=""> </input></td>
					</tr>
				</table>

			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l"> <!--
			<a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					批量删除</a> --> <a class="btn btn-primary radius"
					onclick="article_add('用户管理','${pageContext.request.contextPath }/user/toAdd')"
					href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 新增信息</a>
				</span> <span class="r">当前显示：<strong>${page.list.size()}</strong> 条
				</span>
			</div>
			<div class="mt-20">
				<c:if test="${page.list==null||page.list.size()<1}">
										暂无用户
										</c:if>
				<c:if test="${page.list.size()>0}">
					<table class="table table-border table-bordered table-bg">
						<thead>
							<tr class="text-c">
								<th width="25"><input type="checkbox" name="" value=""></th>
								<th width="80">流水编号</th>
								<th width="120">用户类别</th>
								<th width="120">用户名</th>
								<th width="120">密码</th>
								<th width="75">真实姓名</th>
								<th width="120">联系电话</th>
								<th width="120">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${page.list }" var="userrole" varStatus="index">
								<tr class="text-c">
									<td><input type="checkbox" value="" name=""></td>
									<td>${index.count }</td>
									<td><c:if test="${userrole.type == 1}">大厅用户</c:if> <c:if
											test="${userrole.type != 1}">外勤用户</c:if></td>
									<td>${userrole.username}</td>
									<td class="f-14 td-manage">${userrole.password}</td>
									<td class="f-14 td-manage">${userrole.realname}</td>
									<td class="f-14 td-manage">${userrole.telephone}</td>
									<td class="f-14 td-manage"><a
										style="text-decoration: none" class="ml-5"
										onClick="article_edit('用户信息','${pageContext.request.contextPath }/user/load?id=${userrole.id}','10001')"
										href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
										<a style="text-decoration: none" class="ml-5"
										onClick="return confirm('您确认要删除信息吗?')"
										href="${pageContext.request.contextPath }/user/delete?id=${userrole.id}"
										title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
			<div class="page_c">
				<span class="l inb_a"> </span> <span class="r page"> <input
					type="hidden" id="pageNo" name="pageNo" /> <input type="hidden"
					value="${page.totalCount}" id="totalCount" name="totalCount" /> <input
					type="hidden" value="${page.pageNo}" id="currentPageNo"
					name="currentPageNo" /> <input type="hidden"
					value="${page.totalPage}" id="totalPage" name="totalPage" /> 共<var
						id="pagePiece" class="orange">${page.totalCount }</var>条 <var
						id="pageTotal">${page.pageNo }/${page.totalPage }</var> <a
					href="javascript:void(0);" id="firstPage">首页</a> <a
					href="javascript:void(0);" id="previous" title="上一页">上一页</a> <a
					href="javascript:void(0);" id="next" title="下一页">下一页</a>
				</span>
			</div>
		</div>
	</form>


	<script type="text/javascript"
		src="${pageContext.request.contextPath }/hui/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/hui/layer/1.9.3/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/hui/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/hui/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/H-ui.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/H-ui.admin.js"></script>
	<script type="text/javascript">
		$('.table-sort').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 0, 2, 4, 5, 6, 7, 8, 9 ]
			} // 制定列不参与排序
			]
		});

		/*信息-添加*/
		function article_add(title, url, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/*信息-编辑*/
		function article_edit(title, url, id, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/*信息-删除*/
		function article_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', 1);
			});
		}
	</script>
	
		<script type="text/javascript">
		$(function() {

			/* <div class="page_c">
			<span class="l inb_a">
			</span>
			<span class="r page">
			    <input type="hidden" id="pageNo" name="pageNo" />
			    <input type="hidden" value="${page.totalCount}" id="totalCount" name="totalCount" />
			    <input type="hidden" value="${page.pageNo}" id="currentPageNo" name="currentPageNo" />
			    <input type="hidden" value="${page.totalPage}" id="totalPage" name="totalPage" />
			            共<var id="pagePiece" class="orange">${page.totalCount }<ar>条<var id="pageTotal">${page.pageNo }/${page.totalPage }<ar>
			    <a href="javascript:void(0);" id="previous" class="hidden" title="上一页">上一页</a>
			    <a href="javascript:void(0);" id="next" class="hidden" title="下一页">下一页</a>
			</span>
			</div> */
			//获得当前页面和总页数
			var pageNo = parseInt($("#currentPageNo").val());
			var totalPage = parseInt($("#totalPage").val());

			if (pageNo == 1 && pageNo == totalPage) {
				$("#previous").hide();
				$("#next").hide();
			} else if (pageNo == 1 && pageNo < totalPage) {
				$("#previous").hide();
				$("#next").show();
			} else if (pageNo > 1 && pageNo < totalPage) {
				$("#previous").show();
				$("#next").show();
			} else if (pageNo > 1 && pageNo == totalPage) {
				$("#previous").show();
				$("#next").hide();
			}

			$("#next").click(function() {
				pageNo++;
				$("#pageNo").val(pageNo);
				$("#form1").submit();
			});
			$("#previous").click(function() {
				pageNo--;
				$("#pageNo").val(pageNo);
				$("#form1").submit();
			});
			$("#firstPage").click(function() {

				$("#pageNo").val(1);
				$("#form1").submit();
			});
			$("#lastPage").click(function() {

				$("#pageNo").val(totalPage);
				$("#form1").submit();
			});

			$("#selectPage").change(function() {
				var page = $(this).val();
				$("#pageNo").val(page);
				$("#form1").submit();
			});

			$("#selectPage").val(pageNo);
		})
	</script>
</body>
</html>