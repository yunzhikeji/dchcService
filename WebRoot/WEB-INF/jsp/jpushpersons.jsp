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
<link href="${pageContext.request.contextPath }/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/ncss.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<title>人员信息列表</title>
</head>
<body>

<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe665;</i> 当前检测</a> <a class="btn btn-primary radius" onclick="article_add('新增赌博人员','gamb-add.html')" href="javascript:;"><i class="Hui-iconfont">&#xe603;</i> 历史数据</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="41">&nbsp;</th>
					<th width="70">序号ID</th>
					<th width="71">人员姓名</th>
					<th width="81">人员类型</th>
					<th width="109">录入单位</th>
					<th width="81">信息状态</th>
					<th width="71">录入民警</th>
					<th width="74">录入时间</th>
					<th width="107">办理状态</th>
					<th width="79">操作</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-c">
					<td ><input type="checkbox" value="" name=""></td>
					<td>10001</td>
					<td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit('查看','article-zhang.html','10001')" title="查看">资讯标题</u></td>
					<td>&nbsp;</td>
					<td>城北派出所</td>
					<td>21212</td>
					<td class="f-14 td-manage"></td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage">张然</td>
					<td class="f-14 td-manage">
                    
                    <a style="text-decoration:none" class="ml-5" onClick="article_edit('编辑信息','run-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> 
                    <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
                <tr class="text-c">
					<td ><input type="checkbox" value="" name=""></td>
					<td>10001</td>
					<td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit('查看','article-zhang.html','10001')" title="查看">资讯标题</u></td>
					<td>&nbsp;</td>
					<td>城北派出所</td>
					<td>21212</td>
					<td class="f-14 td-manage"></td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage">&nbsp;</td>
					<td class="f-14 td-manage"><a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯信息','article-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>