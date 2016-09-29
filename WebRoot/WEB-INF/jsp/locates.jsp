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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="hui/html5.js"></script>
<script type="text/javascript" src="hui/respond.min.js"></script>
<script type="text/javascript" src="hui/PIE_IE678.js"></script>
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
<title>场所行业信息</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i><span class="c-gray en">&gt;</span>地点（场所）
		<a class="btn btn-success radius r mr-20"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>


	<div class="pd-20">
		<div class="text-c">
			<form class="Huiform" method="post" action="" target="_self">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					style="line-height: 35px;">
					<tr height="35">
						<td width="21%" align="left">地址： <input type="text"
							placeholder="详细地址" value="" class="input-text"
							style="width: 300px"></td>
						<td align="left"><button type="button"
								class="btn btn-success" id="button2" name="" onClick="">
								<i class="Hui-iconfont">&#xe665;</i> 查询
							</button></td>
					</tr>
				</table>
			</form>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					批量删除</a> <a class="btn btn-primary radius"
				onclick="article_add('场所行业信息登记','address-add.html')"
				href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 新增信息</a></span> <span
				class="r">共有数据：<strong>54</strong> 条
			</span>
		</div>
		<div class="mt-20">
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="80">流水编号</th>
						<th>场所地址（详细地址，门牌号）</th>
						<th width="120">是否出租房</th>
						<th width="120">所属派出所或社区</th>
						<th width="75">社区民警姓名</th>
						<th width="120">场所性质</th>
						<th width="120">上报时间</th>
						<th width="120">操作</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${locates }" var="locate" varStatus="index">
						<tr class="text-c">
							<td class="f-14 td-manage">${index.count }</td>
							<td>${locate.address }</td>
							<td><c:if test="${locate.islethouse ==0 }">否</c:if> <c:if
									test="${locate.islethouse ==1 }">是</c:if></td>
							<td>${locate.belongplace }</td>
							<td class="f-14 td-manage">${locate.policename }</td>
							<td class="f-14 td-manage">${locate.policename }</td>
							<td class="f-14 td-manage"><a style="text-decoration: none"
								class="ml-5"
								onClick="article_edit('场所行业信息登记','address-add.html','10001')"
								href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
								<a style="text-decoration: none" class="ml-5"
								onClick="article_del(this,'10001')" href="javascript:;"
								title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>
	<script type="text/javascript" src="hui/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="hui/layer/1.9.3/layer.js"></script>
	<script type="text/javascript" src="hui/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript"
		src="hui/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
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
</body>
</html>