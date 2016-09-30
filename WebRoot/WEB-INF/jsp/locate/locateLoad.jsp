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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="hui/html5.js"></script>
<script type="text/javascript" src="hui/respond.min.js"></script>
<script type="text/javascript" src="hui/PIE_IE678.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/ncss.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/hui/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="hui/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>场所行业信息登记修改</title>
</head>
<body>

		<form name="locateForm" action="${pageContext.request.contextPath }/locate/update"
			method="post" class="form form-horizontal" id="locateForm ">
			
			<input type="hidden" name="id"  value="${locate.id}"/>
<div class="pd-20">
<div  class="row cl">
  <div class="col-6 col-offset-6 ">
      <div class="col-2 f-r"><input type="submit" class="btn btn-success radius" value="确认保存" id="submit"  onClick="article_save(this,'10001')"></input></div>
      
  </div>
</div>

<div style="width:100%"><div id="tab_demo" class="HuiTab">
  <div class="tabBar cl"></div>
  <div class="tabCon">
  <div  class="row cl text-c" ><h1 style="line-height:80px; margin-bottom:10px;"><small style="color:#000;">场所行业信息登记</small></h1> </div>
  <div  class="row cl">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:45px;">
  <tr>
    <td width="30%"><label class="form-label text-r"><span class="c-red">*</span>场所地址（详细地址,门牌号）：</label></td>
    <td colspan="3" width="55%"><input name="address" value="${locate.address}" type="text" class="input-text radius size-M " style="width:600px;">
</td>
  
  </tr>
  <tr>
    <td width="13%"><label class="form-label text-r"><span class="c-red">*</span>是否出租房：</label></td>
    <td width="20%">
      <input type="radio"   value="0" ${(locate.islethouse==0)?'checked' : ''}  name="islethouse" onclick="document.getElementById('nolease').style.display='block';" tabindex="2" checked="checked">
      否&nbsp;&nbsp;&nbsp;
      <input name="islethouse" value="1" ${(locate.islethouse==1)?'checked' : ''} type="radio"  tabindex="1" onclick="document.getElementById('nolease').style.display='none';" >
      是
    
  </td>
    <td width="15%"></td>
    <td></td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>所属派出所或社区：</label></td>
    <td><input  name="belongplace"  value="${locate.belongplace}" type="text" class="input-text radius size-M " style="width:300px;"></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>社区民警姓名：</label></td>
    <td><input name="policename" value="${locate.policename}" type="text" class="input-text radius size-M " style="width:200px;"></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
</table>

  </div>
  <div id="nolease" class="row cl mt-15" style="display:block;">
   <div class="col-12 mb-15 c-primary f-16" style="border-bottom: solid 2px #2DABF7 ">非出租房相关信息</div>
  <div  class="row cl">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:45px;">
  <tr>
    <td width="30%"><label class="form-label text-r"><span class="c-red">*</span>注册名称：</label></td>
    <td width="20%"><input value="${locate.registername}" name="registername" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">实际经营名称：</label></td>
    <td><input type="text" value="${locate.realregistername}" name="realregistername" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">开业时间：</label></td>
    <td width="20%"><input value="${locate.opentime}" type="text" name="opentime" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="logmax1"  class="input-text Wdate" style="width:200px;"></td>
    <td width="15%">&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>经营范围：</label></td>
    <td colspan="3"><textarea  name="businessscope" cols="3" rows="8" style="width:400px;" >${locate.businessscope}</textarea></td>
    </tr>
  <tr>
    <td><label class="form-label text-r">wifi密码：</label></td>
    <td><input type="text" value="${locate.wifipwd}" name="wifipwd" class="input-text radius size-M " style="width:200px;"></td>
    <td><label class="form-label text-r">从业人数：</label></td>
    <td><input type="text" value="${locate.numberofrelperson}" name="numberofrelperson"  class="input-text radius size-M " style="width:200px;"></td>
    </tr>
   <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>营业执照号码：</label></td>
    <td colspan="3"><input value="${locate.businesslicensenumber}" name="businesslicensenumber" type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
    <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>卫生许可证号码：</label></td>
    <td colspan="3"><input value="${locate.hygienelicensenumber}" name="hygienelicensenumber" type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
    <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>税务登记证：</label></td>
    <td colspan="3"><input value="${locate.taxregistrationcertificatenumber}" name="taxregistrationcertificatenumber" type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
     <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>场所性质：</label></td>
    <td colspan="3">
      <input name="placetype" type="radio" checked="checked" tabindex="3" onclick="document.getElementById('y1').style.display='';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';" value="1"  ${(locate.placetype==1)?'checked' : ''}>
      娱乐场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="placetype" tabindex="4"  onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';" value="2"  ${(locate.placetype==2)?'checked' : ''}>
      服务场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="placetype" tabindex="5"  onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='';
      document.getElementById('j4').style.display='none';" value="3"  ${(locate.placetype==3)?'checked' : ''}>
      特种行业&nbsp;&nbsp;&nbsp;
      <input type="radio" name="placetype" tabindex="6" onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='';" value="4"  ${(locate.placetype==4)?'checked' : ''}>
      九小场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="placetype" tabindex="7" onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';" value="5" ${(locate.placetype==5)?'checked' : ''}>
      物流快递
    </td>
    </tr>
     <tr id="y1" >
    <td><label class="form-label text-r"><span class="c-red">*</span>娱乐场所：</label></td>
    <td colspan="3">
    <input name="entertainmentplacetype" value="1" type="radio" tabindex="8" checked="checked" ${(locate.entertainmentplacetype==1)?'checked' : ''}>
    歌厅&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="2" type="radio" tabindex="9" ${(locate.entertainmentplacetype==2)?'checked' : ''}>
    卡拉OK厅&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="3" type="radio" tabindex="10" ${(locate.entertainmentplacetype==3)?'checked' : ''}>
    迪吧&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="4" type="radio" tabindex="11" ${(locate.entertainmentplacetype==4)?'checked' : ''}>
    夜总会&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="5" type="radio" tabindex="12" ${(locate.entertainmentplacetype==5)?'checked' : ''}>
    电子游戏厅&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="6" type="radio" tabindex="13" ${(locate.entertainmentplacetype==6)?'checked' : ''}>
    棋牌&nbsp;&nbsp;&nbsp;
    <input name="entertainmentplacetype" value="7" type="radio" tabindex="14" ${(locate.entertainmentplacetype==7)?'checked' : ''}>
    其他
</td>
    </tr>
    <tr id="f2" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>服务场所：</label></td>
    <td colspan="3">
    <input name="serviceplacetype" value="1" type="radio" tabindex="15" checked="checked" ${(locate.serviceplacetype==1)?'checked' : ''}>
    桑拿洗浴&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="2" type="radio" tabindex="16" ${(locate.serviceplacetype==2)?'checked' : ''}>
    美容美发&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="3" type="radio" tabindex="17" ${(locate.serviceplacetype==3)?'checked' : ''}>
    足疗按摩&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="4" type="radio" tabindex="18" ${(locate.serviceplacetype==4)?'checked' : ''}>
    咖啡馆&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="5" type="radio" tabindex="19" ${(locate.serviceplacetype==5)?'checked' : ''}>
    小餐桌&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="6" type="radio" tabindex="20" ${(locate.serviceplacetype==6)?'checked' : ''}>
    网吧&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="7" type="radio" tabindex="21" ${(locate.serviceplacetype==7)?'checked' : ''}>
    娱乐城&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="8" type="radio" tabindex="22" ${(locate.serviceplacetype==8)?'checked' : ''}>
    茶馆&nbsp;&nbsp;&nbsp;
    <input name="serviceplacetype" value="9" type="radio" tabindex="23" ${(locate.serviceplacetype==9)?'checked' : ''}>
    其他</td>
    </tr>
    <tr id="t3" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>特种行业：</label></td>
    <td colspan="3"><input name="specialplacetype" value="1" type="radio" tabindex="24" checked="checked" ${(locate.specialplacetype==1)?'checked' : ''}>
    旅馆&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="2" type="radio" tabindex="25" ${(locate.specialplacetype==2)?'checked' : ''}>
    开锁&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="3" type="radio" tabindex="26" ${(locate.specialplacetype==3)?'checked' : ''}>
    刻字印刷&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="4" type="radio" tabindex="27" ${(locate.specialplacetype==4)?'checked' : ''}>
    复印&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="5" type="radio" tabindex="28" ${(locate.specialplacetype==5)?'checked' : ''}>
    废旧金属回收&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="6" type="radio" tabindex="29" ${(locate.specialplacetype==6)?'checked' : ''}>
    二手机动车交易&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="7" type="radio" tabindex="30" ${(locate.specialplacetype==7)?'checked' : ''}>
    机动车拆解&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="8" type="radio" tabindex="31" ${(locate.specialplacetype==8)?'checked' : ''}>
    旧货业回收&nbsp;&nbsp;&nbsp;
    <input name="specialplacetype" value="9" type="radio" tabindex="32" ${(locate.specialplacetype==9)?'checked' : ''}>
    机动车电动车修理</td>
    </tr>
    <tr id="j4" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>九小场所：</label></td>
    <td colspan="3"><input name="ninesmallplacetype" value="1" type="radio" tabindex="33" checked="checked" ${(locate.ninesmallplacetype==1)?'checked' : ''}>
    小学校&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype"  type="radio" value="2" tabindex="34" ${(locate.ninesmallplacetype==2)?'checked' : ''}>
    小商场&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="3" tabindex="35" ${(locate.ninesmallplacetype==3)?'checked' : ''}>
    小医院&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="4" tabindex="36" ${(locate.ninesmallplacetype==4)?'checked' : ''}>
    小旅馆&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="5" tabindex="37" ${(locate.ninesmallplacetype==5)?'checked' : ''}>
    小歌舞娱乐&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="6" tabindex="38" ${(locate.ninesmallplacetype==6)?'checked' : ''}>
    小餐饮&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="7" tabindex="39" ${(locate.ninesmallplacetype==7)?'checked' : ''}>
    小网吧&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="8" tabindex="40" ${(locate.ninesmallplacetype==8)?'checked' : ''}>
    小美容洗浴&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="9" tabindex="41" ${(locate.ninesmallplacetype==9)?'checked' : ''}>
    小生产加工&nbsp;&nbsp;&nbsp;
    <input name="ninesmallplacetype" type="radio" value="10" tabindex="42" ${(locate.ninesmallplacetype==10)?'checked' : ''}>
    其他</td>
    </tr>
</table>

  </div>
 <div id class="row cl mt-15">
   <div class="col-12 mb-15 c-primary f-16" style="border-bottom: solid 2px #2DABF7 ">消防信息</div>
  <div  class="row cl">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:45px;">
  <tr>
    <td width="30%"><label class="form-label text-r"><span class="c-red">*</span>经营面积：</label></td>
    <td width="20%"><input value="${locate.placearea}" name="placearea" type="text" class="input-text radius size-M " style="width:200px;">m<sup>2</sup>
         </td>
  <td width="15%"><label class="form-label text-r">层数：</label></td>
    <td><input value="${locate.numberoffloor}" name="numberoffloor" type="text" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">通道口个数：</label></td>
    <td width="20%"><input value="${locate.numberofchannelport}" name="numberofchannelport" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">包间数量：</label></td>
    <td><input name="numberofroom" value="${locate.numberofroom}" type="text" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">容纳人数：</label></td>
    <td width="20%"><input value="${locate.numberofholdperson}" name="numberofholdperson" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r"><span class="c-red">*</span>合格证号：</label></td>
    <td><input type="text" value="${locate.certificateofqualification}" name="certificateofqualification" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
      <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>是否配备以下消防设施：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div  class="check-box">
    <input type="checkbox" name="firefacilities"  id="checkbox-41">
    <label for="checkbox-41">灭火器</label>
  </div>
  <div class="check-box">
    <input type="checkbox" name="firefacilities" id="checkbox-42">
    <label for="checkbox-42">应急灯</label>
  </div>
  <div class="check-box">
    <input type="checkbox"  name="firefacilities" id="checkbox-43" >
    <label for="checkbox-43">消防拴</label>
  </div>
  <div class="check-box">
    <input type="checkbox" name="firefacilities" id="checkbox-44" >
    <label for="checkbox-44">其他</label>
  </div>
  </div></td>
    </tr>
</table>
</div>
</div>
<div  class="row cl mt-15">
   <div class="col-12 mb-15 c-primary f-16" style="border-bottom: solid 2px #2DABF7 ">防范信息</div>
  <div  class="row cl">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:45px;">
  <tr>
    <td width="30%"><label class="form-label text-r"><span class="c-red">*</span>保安负责人姓名：</label></td>
    <td width="20%"><input name="chargepersonname" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r"><span class="c-red">*</span>保安负责人电话：</label></td>
    <td><input type="text" name="chargepersonphone" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">保安人数：</label></td>
    <td width="20%"><input name="numberofexternalmonitor" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"></td>
    <td></td>   
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">外部监控数量：</label></td>
    <td width="20%"><input name="numberofinsidemonitor" type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">内部监控数量：</label></td>
    <td><input type="text" name="numberofinsidemonitor" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
      <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>物防情况：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox" name="protectcondition" value="防盗门"  id="checkbox-45" >
    <label for="checkbox-45">防盗门</label>
  </div>
  <div class="check-box">
    <input type="checkbox" name="protectcondition" value="防盗窗" id="checkbox-46">
    <label for="checkbox-46">防盗窗</label>
  </div>
  <div class="check-box">
    <input type="checkbox" name="protectcondition" value="报警器" id="checkbox-47" >
    <label for="checkbox-47">报警器</label>
  </div>
  <div class="check-box">
    <input type="checkbox" name="protectcondition" value="其他" id="checkbox-48" >
    <label for="checkbox-48">其他</label>
  </div>
  </div></td>
    </tr>
</table>
</div>
</div>
  </div>
</div></div>

</div></div>
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/hui/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/H-ui.admin.js"></script> 
<script type="text/javascript">

$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,2,4,5,6,7,8,9]}// 制定列不参与排序
	]
});
/*新增关系人*/
function addgxr(title,url,w,h){
	layer.open({
    type: 2,
    area: ['900px', '520px'],
    fix: true, //不固定
	title:title,
    maxmin: true,
    content: url
});
}

$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '10%'
	});
});

/*布控人-添加*/
function bukongman_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		area: ['800px', '500px'],
		title: title,
		content: url
	});
	
}
/*部门流转*/
function Department_change(title,url,w,h){
	var index = layer.open({
		type: 2,
		area: ['800px', '500px'],
		title: title,
		content: url
	});
	
}
/*案例-发布*/
function article_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}
/*案例-疑难*/
function difficult_start(title,url,w,h){
	var index = layer.open({
		type: 2,
		area: ['800px', '500px'],
		title: title,
		content: url
	});
	
}
/*案例-保存*/
function article_save(obj,id){
	layer.confirm('确认要保存吗？',function(index){
		
		layer.msg('已保存!',{icon: 6,time:1000});
	});
}
</script>
</form>

</body>
</html>