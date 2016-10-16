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
<script type="text/javascript"> 

var id = "${relperson.belongplace}";

var policeroom = "${relperson.policeroom}";

$(document).ready(function(){
	
	if(id==null||id==""||id=="0")
	{
		id = 0;
	}else
	{
		 id =  Number(id);
	}
	
	if(policeroom==null||policeroom==""||policeroom=="0")
	{
		id = 1;
	}else
	{
		policeroom =  Number(policeroom);
	}
	
	
   $("#policeroom"+id).show();
   
   $("#policeroom"+id).val(policeroom);
   
   $("#belongplace").change(function(){
	   id = $(this).val();
	   $(".policeroom").hide();
	   $("#policeroom"+id).show();
	   $("#policeroom").val(1);
   });
   
   $(".policeroom").change(function(){
	   $("#policeroom").val($(this).val());
   });
   
});


</script>
<title>相关人员人口登记</title>
</head>
<body>
	<form name="form2" method="post"
		action="${pageContext.request.contextPath }/relperson/editRelpersonSubmit">
		<div class="pd-20">
			<div class="row cl">
				<div class="col-6 col-offset-6 ">
					<div class="col-2 f-r">
						<button type="submit" class="btn btn-success radius" id="button"
							name="">
							<i class="Hui-iconfont">&#xe636;</i> 确认保存
						</button>
					</div>

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
									<input type="hidden" name="id" value="${relperson.id }">
									<td width="40%"><label class="form-label text-r"><span
											class="c-red">*</span>相关人员类别：</label></td>
									<td colspan="3" width="55%">
									
									<input name="rtype" 
									
									onclick="document.getElementById('gx').style.display='none';
      document.getElementById('fc').style.display='';document.getElementById('cy').style.display='none';"
      
										type="radio" tabindex="1" value="1"
										<c:if test="${relperson.rtype ==1 }">checked="checked"</c:if> />
										房东&nbsp;&nbsp;&nbsp; 
										
										<input type="radio" name="rtype"
										
										onclick="document.getElementById('gx').style.display='';
      document.getElementById('fc').style.display='none';document.getElementById('cy').style.display='none';"
										
										tabindex="2" value="2"
										<c:if test="${relperson.rtype==2 }">checked="checked"</c:if> />
										房客&nbsp;&nbsp;&nbsp; 
										
										<input type="radio" name="rtype"
										
										onclick="document.getElementById('gx').style.display='none';
      document.getElementById('fc').style.display='none';document.getElementById('cy').style.display='';"
      
										tabindex="3" value="3"
										<c:if test="${relperson.rtype ==3 }">checked="checked"</c:if> />
										业主&nbsp;&nbsp;&nbsp; 
										
										<input type="radio" name="rtype"
										tabindex="4" value="4"
										<c:if test="${relperson.rtype==4 }">checked="checked"</c:if> />
										从业人员</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>姓名：</label></td>
									<td><input type="text" name="name"
										value="${relperson.name }" class="input-text radius size-M "
										style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>性别：</label></td>
									<td><input name="sex" type="radio" tabindex="5" value="1"
										<c:if test="${relperson.sex==1 }">checked="checked"</c:if> />
										男&nbsp;&nbsp;&nbsp; <input type="radio" name="sex"
										tabindex="6" value="2"
										<c:if test="${relperson.sex ==2 }">checked="checked"</c:if> />
										女</td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>民族：</label></td>
									<td><input type="text" name="nation"
										value="${relperson.nation }" class="input-text radius size-M "
										style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>身份证号：</label></td>
									<td><input type="text" name="idcard"
										value="${relperson.idcard }" class="input-text radius size-M "
										style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">出生日期：</label></td>
									<td>
										<input type="text"
										onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"
										id="logmax1" name="birthday" value="${relperson.birthday }"
										class="input-text Wdate" style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">QQ：</label></td>
									<td><input type="text" name="qq" value="${relperson.qq }"
										class="input-text radius size-M " style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">微信号：</label></td>
									<td><input type="text" name="wechat"
										value="${relperson.wechat }" class="input-text radius size-M "
										style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r">车牌号：</label></td>
									<td><input type="text" name="platenumber"
										value="${relperson.platenumber }" class="input-text radius size-M "
										style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>户籍所在地址：</label></td>
									<td><input type="text" name="registeraddress"
										value="${relperson.registeraddress }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>现居住地址：</label></td>
									<td><input type="text" name="currentaddress"
										value="${relperson.currentaddress }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								
								
								
								<tr id="gx"  <c:if test="${relperson.rtype==2}">style="display:''"</c:if><c:if test="${relperson.rtype!=2}">style="display:none"</c:if>>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>与承租人关系：</label></td>
									<td><input type="text" name="relationshipwithlandlord"
										value="${relperson.relationshipwithlandlord }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								
								
								
								
								<tr id="fc"   <c:if test="${relperson.rtype==1}">style="display:''"</c:if><c:if test="${relperson.rtype!=1}">style="display:none"</c:if>  >
									<td><label class="form-label text-r"><span
											class="c-red">*(请填写主要的三处地址)</span>
											所拥有房产地址：
											</label></td>
									<td>
									<textarea  name="propertyandequipment" cols="3" rows="8" style="width:400px;" >${relperson.propertyandequipment}</textarea>
								</tr>
								
								<tr id="cy"   <c:if test="${relperson.rtype==3}">style="display:''"</c:if><c:if test="${relperson.rtype!=3}">style="display:none"</c:if>  >
									<td><label class="form-label text-r"><span
											class="c-red">*(请填写主要的三处地址)</span>
											所拥有产业地址：
											</label></td>
									<td>
									<textarea  name="propertyandequipment" cols="3" rows="8" style="width:400px;" >${relperson.propertyandequipment}</textarea>
									</td>
								</tr>
								
								
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>工作单位名称：</label></td>
									<td><input type="text" name="workdunit"
										value="${relperson.workdunit }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>职务：</label></td>
									<td><input type="text" name="position"
										value="${relperson.position }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>工作单位地址：</label></td>
									<td><input type="text" name="workdunitaddress"
										value="${relperson.workdunitaddress }"
										class="input-text radius size-M " style="width: 400px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>联系电话：</label></td>
									<td><input type="text" name="telphone"
										value="${relperson.telphone }"
										class="input-text radius size-M " style="width: 200px;"></td>
								</tr>
								<tr>
									<td><label class="form-label text-r"><span
											class="c-red">*</span>是否办理居住证：</label></td>
									<td><input name="ispermit" type="radio" tabindex="7"
										value="1"
										<c:if test="${relperson.ispermit== 1 }">checked="checked"</c:if> />
										是&nbsp;&nbsp;&nbsp; <input type="radio" name="ispermit"
										tabindex="8" value="0"
										<c:if test="${relperson.ispermit== 0 }">checked="checked"</c:if> />
										否</td>
								</tr>
								<tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>所属派出所：</label></td>
    <td>
    <select id="belongplace"  class="input-text radius size-M " name="belongplace" style="width:200px;"> 
   	   <option value="0" ${relperson.belongplace==0?'selected':''}>请选择所属派出所</option> 
       <option value="1" ${relperson.belongplace==1?'selected':''}>剪子股派出所</option> 
       <option value="2" ${relperson.belongplace==2?'selected':''}>黄河涯派出所</option> 
       <option value="3" ${relperson.belongplace==3?'selected':''}>东地派出所</option> 
       <option value="4" ${relperson.belongplace==4?'selected':''}>新河东路派出所</option> 
       <option value="5" ${relperson.belongplace==5?'selected':''}>于官屯派出所</option> 
       <option value="6" ${relperson.belongplace==6?'selected':''}>建设街派出所</option> 
       <option value="7" ${relperson.belongplace==7?'selected':''}>车站街派出所</option> 
       <option value="8" ${relperson.belongplace==8?'selected':''}>湖滨北路派出所</option> 
       <option value="9" ${relperson.belongplace==9?'selected':''}>二屯派出所</option>
       <option value="10"${relperson.belongplace==10?'selected':''}>长庄派出所</option> 
   </select> 
   </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
     <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>所属警务室：</label></td>
    <td>
    <select id="policeroom0"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
   		<option  value="0">请选择所属警务室</option> 
   </select> 
   <select id="policeroom1"   class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >小锅市社区警务室</option> 
       <option  value="2" >桥口社区警务室</option> 
       <option  value="3" >北营社区警务室</option> 
       <option  value="4" >荣庄社区警务室</option> 
       <option  value="5" >丰华社区警务室</option>
       <option  value="6" >胜利社区警务室</option>
       <option  value="7" >顺城社区警务室</option>
       <option  value="8" >城隍庙社区警务室</option> 
   </select>  
   <select id="policeroom2"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >馨秋社区警务室</option> 
       <option  value="2" >二十里铺社区警务室</option> 
       <option  value="3" >焦庄社区警务室</option> 
   </select> 
   <select id="policeroom3"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >文化社区金紫荆警务室</option> 
       <option  value="2" >祥和社区警务室</option> 
       <option  value="3" >永庆社区警务室</option> 
       <option  value="4" >东方家园社区机关警务室</option> 
   </select> 
    <select id="policeroom4"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >益德社区警务室</option> 
       <option  value="2" >振华社区警务室</option> 
       <option  value="3" >德苑社区警务室</option> 
       <option  value="4" >邹李社区警务室</option> 
       <option  value="5" >辛庄社区警务室</option>
       <option  value="6" >新河社区警务室</option> 
   </select> 
    <select id="policeroom5"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >新园社区警务室</option> 
       <option  value="2" >魏庄社区警务室</option> 
       <option  value="3" >三七社区警务室</option> 
       <option  value="4" >新领域社区警务室</option> 
   </select> 
    <select id="policeroom6"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >北园社区警务室</option> 
       <option  value="2" >尉署社区警务室</option> 
       <option  value="3" >状元府社区警务室</option> 
       <option  value="4" >南龙社区警务室</option> 
       <option  value="5" >罗南社区警务室</option> 
   </select> 
    <select id="policeroom7"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >南关社区警务室</option> 
       <option  value="2" >南营社区警务室</option> 
       <option  value="3" >南市社区警务室</option> 
       <option  value="4" >柴市社区警务室</option> 
       <option  value="5" >马庄社区警务室</option> 
       <option  value="6" >马市社区警务室</option> 
   </select> 
    <select id="policeroom8"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >大东关社区警务室</option> 
       <option  value="2">长乐社区警务室</option> 
       <option  value="3">学府社区警务室</option> 
       <option  value="4">锦绣川社区警务室</option> 
       <option  value="5">岔河社区警务室</option> 
   </select> 
    <select id="policeroom9"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >馨苑社区警务室</option> 
       <option  value="2" >舜昕缘社区警务室</option> 
   </select> 
    <select id="policeroom10"  class="input-text radius size-M policeroom" style="width:200px;display: none;"> 
       <option  value="1" >肖何社区警务室</option> 
       <option  value="2">罗庄社区警务室</option> 
       <option  value="3">果园社区警务室</option> 
       <option  value="4">乾城社区警务室</option> 
       <option  value="5">新四合警务室</option> 
       <option  value="6">翟时社区警务室</option> 
   </select> 
   <input  type="hidden" name="policeroom" value="${relperson.policeroom}" id="policeroom"/>
   </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
								<tr>
									<td><label class="form-label text-r">备注：</label></td>
									<td>
									<textarea  name="remark" cols="3" rows="8" style="width:400px;" >${relperson.remark}</textarea>
									</td>
								</tr>
								<!-- 
								<tr>
									<td><label class="form-label text-r">测试固定资产：</label></td>
									<td>
									<textarea  name="propertyandequipment" cols="3" rows="8" style="width:400px;" >${relperson.propertyandequipment}</textarea>
									</td>
								</tr>
								 -->
							</table>
						</div>


					</div>
				</div>
			</div>

		</div>
		</div>
	</form>
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