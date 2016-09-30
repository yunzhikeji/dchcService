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
<link href="${pageContext.request.contextPath }/css/ncss.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/hui/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>相关人员人口登记</title>
</head>
<body>

		<div class="pd-20">
			<div class="row cl">
				<div class="col-6 col-offset-6 ">
				</div>
			</div>

			<div style="width: 100%">
				<div id="tab_demo" class="HuiTab">
					<div class="tabBar cl"></div>
					<div class="tabCon">
						<div class="row cl text-c">
							<h1 style="line-height: 80px; margin-bottom: 10px;">
								<small style="color: #000;">相关人员人口登记</small>
							</h1>
						</div>
						<div class="row cl">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								style="line-height: 45px;">
								<tr>
									<input type="hidden" value="${relperson.id }">
									<td width="40%"><label class="form-label text-r"><span
											class="c-red">*</span>相关人员类别：</label></td>
									<td colspan="3" width="55%"><c:if
											test="${relperson.rtype ==1 }">房东</c:if>
										<c:if test="${relperson.rtype ==2 }">房客</c:if>
										<c:if test="${relperson.rtype ==3 }">业主</c:if>
										<c:if test="${relperson.rtype ==4 }">从业人员</c:if>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>姓名：</label></td>
									<td><span class="input-text radius size-M ">${relperson.name }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>性别：</label></td>
									<td><c:if test="${relperson.sex==1 }">男</c:if><c:if test="${relperson.sex==2 }">女</c:if></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>民族：</label></td>
									<td><span class="input-text radius size-M ">${relperson.nation }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>身份证号：</label></td>
									<td><span class="input-text radius size-M ">${relperson.idcard }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">出生日期：</label></td>
									<td><span class="input-text radius size-M ">${relperson.birthday }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">QQ：</label></td>
									<td><span class="input-text radius size-M ">${relperson.qq }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">微信号：</label></td>
									<td><span class="input-text radius size-M ">${relperson.wechat }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>户籍所在地址：</label></td>
									<td><span class="input-text radius size-M ">${relperson.registeraddress }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>现居住地址：</label></td>
									<td><span class="input-text radius size-M ">${relperson.currentaddress }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>工作单位名称：</label></td>
									<td><span class="input-text radius size-M ">${relperson.workdunit }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>工作单位地址：</label></td>
									<td><span class="input-text radius size-M ">${relperson.workdunitaddress }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>联系电话：</label></td>
									<td><span class="input-text radius size-M ">${relperson.telphone }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>是否办理居住证：</label></td>
									<td><c:if test="${relperson.ispermit== 1 }">是</c:if><c:if test="${relperson.ispermit== 0 }">否</c:if></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">所属派出所或社区：</label></td>
									<td><span class="input-text radius size-M ">${relperson.belongplace }</span></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">备注：</label></td>
									<td><span class="input-text radius size-M ">${relperson.remark }</span></td>
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

</body>
</html>