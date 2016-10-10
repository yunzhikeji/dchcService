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
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/respond.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/PIE_IE678.js"></script>
<![endif]-->
<!--[if IE 6]>
		<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
		<script>DD_belatedPNG.fix('*');</script>
		<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/ncss.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/icheck/icheck.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/hui/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js" ></script>
<!--[if IE 6]>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->

<script type="text/javascript">
function checkUserRole()
{
	var username = $("#username").val();
	var password = $("#password").val();
	var id = $("#uid").val();
	var booleanBack =true;
	
	if(id=='')
	{
		id = 0;
	}
	
	if(username==''||username==null)
	{
		alert("用户名不能为空.");
		return false;
	}
	
	if(password==''||password==null)
	{
		alert("密码不能为空.");
		return false;
	}
	
	$.ajax({   
	            url:"${pageContext.request.contextPath }/user/checkUsername",//这里是你的action或者servlert的路径地址   
	            type:'post', //数据发送方式   
	            async:false,
	            data:{"username":username,"id":id},
	            dataType:'json',
	            error: function(msg)
	            { //失败   
	            	console.log(msg);   
	            },   
	            success: function(msg)
	            { //成功
					 if(msg!=null)
					 {
					 	alert('用户名已存在，请重新输入.');
				 		$(document).ready(function(){ 
				 			$("#username").val('');
				 			username = '';
				 		});
				 		booleanBack =false;
					 }
				}
			});
	
	
	return booleanBack;
	/*
	if(userRoleTelphone!='')
	{
		if(!(/(^(\d{3,4}-)?\d{7,8})$|(^1[3|4|5|8][0-9]{9})/.test(userRoleTelphone))||userRoleTelphone.length>11){
			alert("不是正确的11位手机号或者正确的固话");
			return false;
		}
	}*/
}

</script>

<title>新增用户</title>
</head>
<body>

	<form name="userroleForm"
		action="${pageContext.request.contextPath }/user/update" onsubmit="return checkUserRole();"
		method="post" class="form form-horizontal" id="userroleForm " >
		<div class="pd-20">
			<div class="row cl">
				<div class="col-6 col-offset-6 ">
					<div class="col-2 f-r">
						<input type="submit" class="btn btn-success radius" value="确认保存"
							id="submit"></input>
					</div>
				</div>
			</div>
			
			<input type="hidden" id="uid" name="id" value="${userrole.id }"/>

			<div style="width: 100%">
				<div id="tab_demo" class="HuiTab">
					<div class="tabBar cl"></div>
					<div class="tabCon">
						<div class="row cl text-c">
							<h1 style="line-height: 80px; margin-bottom: 10px;">
								<small style="color: #000;">修改用户</small>
							</h1>
						</div>
						<div class="row cl">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								style="line-height: 45px;">
								<tr>
									<td width="30%"><label class="form-label text-r"><span
											class="c-red">*</span>用户名：</label></td>
									<td width="25%"><input name="username" id="username" type="text" value="${userrole.username }"
										class="input-text radius size-M " style="width: 200px;">
									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td width="30%"><label class="form-label text-r"><span
											class="c-red">*</span>密码：</label></td>
									<td width="25%"><input name="password" id="password" type="text" value="${userrole.password }"
										class="input-text radius size-M " style="width: 200px;">
									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<td width="30%"><label class="form-label text-r"><span
											class="c-red">*</span>电话：</label></td>
									<td width="25%"><input name="telephone" type="text" value="${userrole.telephone }"
										class="input-text radius size-M " style="width: 200px;">
									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td width="30%"><label class="form-label text-r"><span
											class="c-red">*</span>真实姓名：</label></td>
									<td width="25%"><input name="realname" type="text" value="${userrole.realname }"
										class="input-text radius size-M " style="width: 200px;">
									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

		<script type="text/javascript"
			src="${pageContext.request.contextPath }/hui/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath }/hui/layer/1.9.3/layer.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath }/hui/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath }/hui/icheck/jquery.icheck.min.js"></script>
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
			/*新增关系人*/
			function addgxr(title, url, w, h) {
				layer.open({
					type : 2,
					area : [ '900px', '520px' ],
					fix : true, //不固定
					title : title,
					maxmin : true,
					content : url
				});
			}

			$(function() {
				$('.skin-minimal input').iCheck({
					checkboxClass : 'icheckbox-blue',
					radioClass : 'iradio-blue',
					increaseArea : '10%'
				});
			});

			/*布控人-添加*/
			function bukongman_add(title, url, w, h) {
				var index = layer.open({
					type : 2,
					area : [ '800px', '500px' ],
					title : title,
					content : url
				});

			}
			/*部门流转*/
			function Department_change(title, url, w, h) {
				var index = layer.open({
					type : 2,
					area : [ '800px', '500px' ],
					title : title,
					content : url
				});

			}
			/*案例-发布*/
			function article_start(obj, id) {
				layer.confirm('确认要发布吗？', function(index) {
					layer.msg('已发布!', {
						icon : 6,
						time : 1000
					});
				});
			}
			/*案例-疑难*/
			function difficult_start(title, url, w, h) {
				var index = layer.open({
					type : 2,
					area : [ '800px', '500px' ],
					title : title,
					content : url
				});

			}
			/*案例-保存*/
			function article_save(obj, id) {
				layer.confirm('确认要保存吗？', function(index) {

					layer.msg('已保存!', {
						icon : 6,
						time : 1000
					});
				});
			}
		</script>
	</form>

</body>
</html>