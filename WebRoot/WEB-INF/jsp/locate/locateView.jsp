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

<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/pageKit.js"></script>
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
<!--[if IE 6]>
<script type="text/javascript" src="hui/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>场所行业信息登记查看</title>
</head>
<body>
	<input type="hidden" name="id" value="${locate.id}" />
	<div class="pd-20">
		<div class="row cl">
			<div class="col-6 col-offset-6 ">
				<div class="col-2 f-r">
					<input type="button" class="btn btn-success radius" value="关闭"
						id="button" onClick="childPage_close()"></input>
				</div>

			</div>
		</div>

		<div style="width: 100%">
			<div id="tab_demo" class="HuiTab">
				<div class="tabBar cl"></div>
				<div class="tabCon">
					<div class="row cl text-c">
						<h1 style="line-height: 80px; margin-bottom: 10px;">
							<small style="color: #000;">场所行业信息登记</small>
						</h1>
					</div>
					<div class="row cl">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							style="line-height: 45px;">
							<tr>
								<td width="30%"><label class="form-label text-r"><span
										class="c-red">*</span>场所地址（详细地址,门牌号）：</label></td>
								<td colspan="3" width="55%">${locate.address}</td>

							</tr>
							<tr>
								<td width="13%"><label class="form-label text-r"><span
										class="c-red">*</span>是否出租房：</label></td>
								<td width="20%"><c:if test="${locate.islethouse==0}">否</c:if>
									<c:if test="${locate.islethouse==1}">是</c:if></td>
								<td width="15%"></td>
								<td></td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>所属派出所或社区：</label></td>
								<td>${locate.belongplace}</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td><label class="form-label text-r"><span
										class="c-red">*</span>社区民警姓名：</label></td>
								<td>${locate.policename}</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
						</table>

					</div>
					<div id="nolease" class="row cl mt-15"
						<c:if test="${locate.islethouse==0}">style="display:block;"</c:if>
						<c:if test="${locate.islethouse==1}">style="display:none;"</c:if>>
						<div class="col-12 mb-15 c-primary f-16"
							style="border-bottom: solid 2px #2DABF7">非出租房相关信息</div>
						<div class="row cl">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								style="line-height: 45px;">
								<tr>
									<td width="30%"><label class="form-label text-r"><span
											class="c-red">*</span>注册名称：</label></td>
									<td width="20%">${locate.registername}</td>
									<td width="15%"><label class="form-label text-r">实际经营名称：</label></td>
									<td>${locate.realregistername}</td>
								</tr>
								<tr>
									<td width="30%"><label class="form-label text-r">开业时间：</label></td>
									<td width="20%">${locate.opentime}</td>
									<td width="15%">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>经营范围：</label></td>
									<td colspan="3">${locate.businessscope}</td>
								</tr>
								<tr>
									<td><label class="form-label text-r">wifi密码：</label></td>
									<td>${locate.wifipwd}</td>
									<td><label class="form-label text-r">从业人数：</label></td>
									<td>${locate.numberofrelperson}</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>营业执照号码：</label></td>
									<td colspan="3">${locate.businesslicensenumber}</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>卫生许可证号码：</label></td>
									<td colspan="3">${locate.hygienelicensenumber}</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>税务登记证：</label></td>
									<td colspan="3">${locate.taxregistrationcertificatenumber}</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>场所性质：</label></td>
									<td colspan="3"><c:if test="${locate.placetype==1}">娱乐场所</c:if>
										<c:if test="${locate.placetype==2}">服务场所</c:if> <c:if
											test="${locate.placetype==3}">特种行业</c:if> <c:if
											test="${locate.placetype==4}">九小场所</c:if> <c:if
											test="${locate.placetype==5}">物流快递</c:if>
								</tr>
								<tr id="y1"
									<c:if test="${locate.placetype==1}">style="display:''"</c:if>
									<c:if test="${locate.placetype!=1}">style="display:none"</c:if>>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>娱乐场所：</label></td>
									<td colspan="3"><c:if
											test="${locate.entertainmentplacetype==1}">歌厅</c:if> <c:if
											test="${locate.entertainmentplacetype==2}">卡拉OK厅</c:if> <c:if
											test="${locate.entertainmentplacetype==3}">迪吧</c:if> <c:if
											test="${locate.entertainmentplacetype==4}">夜总会</c:if> <c:if
											test="${locate.entertainmentplacetype==5}">电子游戏厅</c:if> <c:if
											test="${locate.entertainmentplacetype==5}">电子游戏厅</c:if> <c:if
											test="${locate.entertainmentplacetype==6}">棋牌室</c:if> <c:if
											test="${locate.entertainmentplacetype==7}">其他</c:if>
								</tr>
								<tr id="f2"
									<c:if test="${locate.placetype==2}">style="display:''"</c:if>
									<c:if test="${locate.placetype!=2}">style="display:none"</c:if>>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>服务场所：</label></td>
									<td colspan="3"><c:if test="${locate.serviceplacetype==1}">桑拿洗浴</c:if>
										<c:if test="${locate.serviceplacetype==2}">美容美发</c:if> <c:if
											test="${locate.serviceplacetype==3}">足疗按摩</c:if> <c:if
											test="${locate.serviceplacetype==4}">咖啡馆</c:if> <c:if
											test="${locate.serviceplacetype==5}">小餐桌</c:if> <c:if
											test="${locate.serviceplacetype==6}">网吧</c:if> <c:if
											test="${locate.serviceplacetype==7}">娱乐城</c:if> <c:if
											test="${locate.serviceplacetype==8}">茶馆</c:if> <c:if
											test="${locate.serviceplacetype==9}">其他</c:if>
								</tr>
								<tr id="t3"
									<c:if test="${locate.placetype==3}">style="display:''"</c:if>
									<c:if test="${locate.placetype!=3}">style="display:none"</c:if>>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>特种行业：</label></td>
									<td colspan="3">
								</tr>
								<tr id="j4"
									<c:if test="${locate.placetype==4}">style="display:''"</c:if>
									<c:if test="${locate.placetype!=4}">style="display:none"</c:if>>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>九小场所：</label></td>
									<td colspan="3"><c:if
											test="${locate.ninesmallplacetype==1}">小学校</c:if> <c:if
											test="${locate.ninesmallplacetype==2}">小商场</c:if> <c:if
											test="${locate.ninesmallplacetype==3}">小医院</c:if> <c:if
											test="${locate.ninesmallplacetype==4}">小旅馆</c:if> <c:if
											test="${locate.ninesmallplacetype==5}">小歌舞娱乐</c:if> <c:if
											test="${locate.ninesmallplacetype==6}">小餐饮</c:if> <c:if
											test="${locate.ninesmallplacetype==7}">小网吧</c:if> <c:if
											test="${locate.ninesmallplacetype==8}">小美容洗浴</c:if> <c:if
											test="${locate.ninesmallplacetype==9}">小生产加工</c:if> <c:if
											test="${locate.ninesmallplacetype==10}">其他</c:if>
								</tr>
							</table>

						</div>
						<div id class="row cl mt-15">
							<div class="col-12 mb-15 c-primary f-16"
								style="border-bottom: solid 2px #2DABF7">消防信息</div>
							<div class="row cl">
								<table width="100%" border="0" cellspacing="0" cellpadding="0"
									style="line-height: 45px;">
									<tr>
										<td width="30%"><label class="form-label text-r"><span
												class="c-red">*</span>经营面积：</label></td>
										<td width="20%">${locate.placearea}m<sup>2</sup>
										</td>
										<td width="15%"><label class="form-label text-r">层数：</label></td>
										<td>${locate.numberoffloor}</td>
									</tr>
									<tr>
										<td width="30%"><label class="form-label text-r">通道口个数：</label></td>
										<td width="20%">${locate.numberofchannelport}</td>
										<td width="15%"><label class="form-label text-r">包间数量：</label></td>
										<td>${locate.numberofroom}</td>
									</tr>
									<tr>
										<td width="30%"><label class="form-label text-r">容纳人数：</label></td>
										<td width="20%">${locate.numberofholdperson}</td>
										<td width="15%"><label class="form-label text-r"><span
												class="c-red">*</span>合格证号：</label></td>
										<td>${locate.certificateofqualification}</td>
									</tr>
									<tr>
										<td><label class="form-label text-r"><span
												class="c-red">*</span>是否配备以下消防设施：</label></td>
										<td colspan="3"><div class="skin-minimal ">${locate.firefacilities}
											</div></td>
									</tr>
								</table>
							</div>
						</div>
						<div class="row cl mt-15">
							<div class="col-12 mb-15 c-primary f-16"
								style="border-bottom: solid 2px #2DABF7">防范信息</div>
							<div class="row cl">
								<table width="100%" border="0" cellspacing="0" cellpadding="0"
									style="line-height: 45px;">
									<tr>
										<td width="30%"><label class="form-label text-r"><span
												class="c-red">*</span>保安负责人姓名：</label></td>
										<td width="20%">${locate.chargepersonname}</td>
										<td width="15%"><label class="form-label text-r"><span
												class="c-red">*</span>保安负责人电话：</label></td>
										<td>${locate.chargepersonphone}</td>
									</tr>
									<tr>
										<td width="30%"><label class="form-label text-r">保安人数：</label></td>
										<td width="20%">${locate.numberofexternalmonitor}</td>
										<td width="15%"></td>
										<td></td>
									</tr>
									<tr>
										<td width="30%"><label class="form-label text-r">外部监控数量：</label></td>
										<td width="20%">${locate.numberofinsidemonitor}</td>
										<td width="15%"><label class="form-label text-r">内部监控数量：</label></td>
										<td>${locate.numberofinsidemonitor}</td>
									</tr>
									<tr>
										<td><label class="form-label text-r"><span
												class="c-red">*</span>物防情况：</label></td>
										<td colspan="3"><div class="skin-minimal ">${locate.protectcondition}
											</div></td>
									</tr>
								</table>
							</div>
						</div>
						<div class="row cl mt-20">
							<div class="col-12 mb-0 c-primary f-16"
								style="border-bottom: solid 2px #2DABF7; line-height: 43px;">
								相关人员基本信息</div>
							<div class="col-12">
								<c:if test="${relpersons==null||relpersons.size()<1}">
										暂未录入相关人员信息
										</c:if>
								<c:if test="${relpersons.size()>1}">
									<table class="table table-border table-bg mb-10">
										<thead>
											<tr>
												<th>序号</th>
												<th>人员姓名</th>
												<th>人员性别</th>
												<th>人员类型</th>
												<th>联系电话</th>
											</tr>
										</thead>
										<tbody>

											<c:forEach items="${relpersons}" var="relperson"
												varStatus="index">
												<tr>
													<td>${index.count }</td>
													<td>
													<a style="text-decoration: none" class="ml-5"
									href="${pageContext.request.contextPath }/relperson/view?id=${relperson.id}" title="查看人员信息">
													${relperson.name }
													</a>
													</td>
													<td><c:if test="${relperson.sex==1 }">男</c:if> <c:if
															test="${relperson.sex==2 }">女</c:if></td>
													<td><c:if test="${relperson.rtype==1 }">房东</c:if> <c:if
															test="${relperson.rtype==2 }">房客</c:if> <c:if
															test="${relperson.rtype==3 }">业主</c:if> <c:if
															test="${relperson.rtype==4 }">从业人员</c:if></td>
													<td>${relperson.telphone }</td>
												</tr>
											</c:forEach>

										</tbody>
									</table>
								</c:if>
							</div>

						</div>

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