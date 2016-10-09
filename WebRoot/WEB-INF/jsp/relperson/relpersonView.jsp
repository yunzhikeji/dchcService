<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
			<div class="col-6 col-offset-6 "></div>
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
								<td width="40%"><label class="form-label text-r"><span
										class="c-red">*</span>相关人员类别：</label></td>
								<td colspan="3" width="55%"><c:if
										test="${relperson.rtype ==1 }">房东</c:if> <c:if
										test="${relperson.rtype ==2 }">房客</c:if> <c:if
										test="${relperson.rtype ==3 }">业主</c:if> <c:if
										test="${relperson.rtype ==4 }">从业人员</c:if>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>姓名：</label></td>
								<td>${relperson.name }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>性别：</label></td>
								<td><c:if test="${relperson.sex==1 }">男</c:if> <c:if
										test="${relperson.sex==2 }">女</c:if></td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>民族：</label></td>
								<td>${relperson.nation }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>身份证号：</label></td>
								<td>${relperson.idcard }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r">出生日期：</label></td>
								<td>
								<c:if test="${relperson.birthday=='请选择'}"></c:if>
								<c:if test="${relperson.birthday!='请选择'}">${relperson.birthday}</c:if>
								</td>
							</tr>
							<tr>
								<td><label class="form-label text-r">QQ：</label></td>
								<td>${relperson.qq }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r">微信号：</label></td>
								<td>${relperson.wechat }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>户籍所在地址：</label></td>
								<td>${relperson.registeraddress }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>现居住地址：</label></td>
								<td>${relperson.currentaddress }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>工作单位名称：</label></td>
								<td>${relperson.workdunit }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>工作单位地址：</label></td>
								<td>${relperson.workdunitaddress }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>联系电话：</label></td>
								<td>${relperson.telphone }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>是否办理居住证：</label></td>
								<td><c:if test="${relperson.ispermit== 1 }">是</c:if> <c:if
										test="${relperson.ispermit== 0 }">否</c:if></td>
							</tr>
							<tr>
								<td><label class="form-label text-r">所属派出所或社区：</label></td>
								<td>${relperson.belongplace }</td>
							</tr>
							<tr>
								<td><label class="form-label text-r">备注：</label></td>
								<td>${relperson.remark }</td>
							</tr>
						</table>
					</div>
				</div>

				<div class="row cl mt-20">
					<div class="col-12 mb-0 c-primary f-16"
						style="border-bottom: solid 2px #2DABF7; line-height: 43px;">
						相关场所信息</div>
					<div class="col-12">
							<table class="table table-border table-bg mb-10">
								<thead>
									<tr>
										<th>序号</th>
										<th>类型</th>
										<th>场所地址</th>
										<th>场所性质</th>
									</tr>
								</thead>
								<tbody>
										<c:if test="${currentLocate!=null}">
										<tr>
											<td>1</td>
											<td>现居住地址</td>
											<td>	<a style="text-decoration: none" class="ml-5"
									href="${pageContext.request.contextPath }/locate/view?id=${currentLocate.id}" title="查看场所行业信息">${currentLocate.address}</a>
									</td>
											
											<td><c:if
										test="${currentLocate.placetype ==0 ||currentLocate.placetype ==null  }">出租房</c:if>
									<c:if test="${currentLocate.placetype ==1 }">娱乐场所</c:if> <c:if
										test="${currentLocate.placetype ==2 }">服务场所</c:if> <c:if
										test="${currentLocate.placetype ==3 }">特种行业</c:if> <c:if
										test="${currentLocate.placetype ==4 }">九小场所</c:if> <c:if
										test="${currentLocate.placetype ==5 }">物流快递</c:if></td>
										</tr>
										</c:if>
										<c:if test="${currentLocate==null}">
										<tr>
											<td>1</td>
											<td>现居住地址</td>
											<td colspan="2">暂无登记该场所</td>
											</tr>
										</c:if>
										
										
										<c:if test="${workdunitLocate!=null}">
										<tr>
											<td>2</td>
											<td>工作单位地址</td>
											<td>
											<a style="text-decoration: none" class="ml-5"
									href="${pageContext.request.contextPath }/locate/view?id=${workdunitLocate.id}" title="查看场所行业信息">${workdunitLocate.address}</a>
											</td>
											<td><c:if
										test="${workdunitLocate.placetype ==0 ||workdunitLocate.placetype ==null  }">出租房</c:if>
									<c:if test="${workdunitLocate.placetype ==1 }">娱乐场所</c:if> <c:if
										test="${workdunitLocate.placetype ==2 }">服务场所</c:if> <c:if
										test="${workdunitLocate.placetype ==3 }">特种行业</c:if> <c:if
										test="${workdunitLocate.placetype ==4 }">九小场所</c:if> <c:if
										test="${workdunitLocate.placetype ==5 }">物流快递</c:if></td>
										</tr>
										</c:if>
										<c:if test="${workdunitLocate==null}">
											<tr>
											<td>2</td>
											<td>工作单位地址</td>
											<td colspan="2">暂无登记该场所</td>
											</tr>
										</c:if>
								</tbody>
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

		/*信息-编辑*/
		function article_edit(title, url, id, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
	</script>

</body>
</html>