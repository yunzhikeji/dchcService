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
<title>场所行业信息登记</title>
</head>
<body>
<div class="pd-20">
<div  class="row cl">
  <div class="col-6 col-offset-6 ">
      <div class="col-2 f-r"><button type="submit" class="btn btn-success radius" id="button" name="" onClick="article_save(this,'10001')"><i class="Hui-iconfont">&#xe636;</i> 确认保存</button></div>
      
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
    <td colspan="3" width="55%"><input type="text" class="input-text radius size-M " style="width:600px;">
      
</td>
  
  </tr>
  <tr>
    <td width="13%"><label class="form-label text-r"><span class="c-red">*</span>是否出租房：</label></td>
    <td width="20%"><form name="form1" method="post" action="">
      <input name="radio" type="radio"  tabindex="1" onclick="document.getElementById('nolease').style.display='none';" >
      是&nbsp;&nbsp;&nbsp;
      <input type="radio" name="radio" onclick="document.getElementById('nolease').style.display='block';" tabindex="2" checked="checked">
      否
    </form></td>
    <td width="15%"></td>
    <td></td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>所属派出所或社区：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>社区民警姓名：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
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
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">实际经营名称：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">开业时间：</label></td>
    <td width="20%"><input type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax1"  class="input-text Wdate" style="width:200px;"></td>
    <td width="15%">&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
  <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>经营范围：</label></td>
    <td colspan="3"><input type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
  <tr>
    <td><label class="form-label text-r">wifi密码：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
    <td><label class="form-label text-r">从业人数：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
    </tr>
   <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>营业执照号码：</label></td>
    <td colspan="3"><input type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
    <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>卫生许可证号码：</label></td>
    <td colspan="3"><input type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
    <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>税务登记证：</label></td>
    <td colspan="3"><input type="text" class="input-text radius size-M " style="width:400px;"></td>
    </tr>
     <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>场所性质：</label></td>
    <td colspan="3">
    <form name="form2" method="post" action="">
      <input name="radio1" type="radio" tabindex="3" onclick="document.getElementById('y1').style.display='';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';">
      娱乐场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="radio1" tabindex="4" checked="checked" onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';">
      服务场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="radio1" tabindex="5"  onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='';
      document.getElementById('j4').style.display='none';">
      特种行业&nbsp;&nbsp;&nbsp;
      <input type="radio" name="radio1" tabindex="6" onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='';">
      九小场所&nbsp;&nbsp;&nbsp;
      <input type="radio" name="radio1" tabindex="7" onclick="document.getElementById('y1').style.display='none';
      document.getElementById('f2').style.display='none';document.getElementById('t3').style.display='none';
      document.getElementById('j4').style.display='none';">
      物流快递
    </form></td>
    </tr>
    <tr id="y1" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>娱乐场所：</label></td>
    <td colspan="3"><div class="skin-minimal">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-6" >
    <label for="checkbox-6">歌厅</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-7" checked>
    <label for="checkbox-7">卡拉OK厅</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-8" >
    <label for="checkbox-8">迪吧</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-9" >
    <label for="checkbox-9">夜总会</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-10" >
    <label for="checkbox-10">电子游戏厅</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-11" >
    <label for="checkbox-11">棋牌室</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-12" >
    <label for="checkbox-12">其他</label>
  </div>
</div></td>
    </tr>
    <tr id="f2" >
    <td><label class="form-label text-r"><span class="c-red">*</span>服务场所：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-13" >
    <label for="checkbox-13">桑拿洗浴</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-14" checked>
    <label for="checkbox-14">美容美发</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-15" >
    <label for="checkbox-15">足疗按摩</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-16" >
    <label for="checkbox-16">咖啡馆</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-17" >
    <label for="checkbox-17">小餐桌</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-18" >
    <label for="checkbox-18">网吧</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-19" >
    <label for="checkbox-19">娱乐城</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-20" >
    <label for="checkbox-20">茶馆</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-21" >
    <label for="checkbox-21">其他</label>
  </div>
</div></td>
    </tr>
    <tr id="t3" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>特种行业：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-22" >
    <label for="checkbox-22">旅馆</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-23" checked>
    <label for="checkbox-23">开锁</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-24" >
    <label for="checkbox-24">刻字印刷</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-25" >
    <label for="checkbox-25">复印</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-26" >
    <label for="checkbox-26">废旧金属回收</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-27" >
    <label for="checkbox-27">二手机动车交易</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-28" >
    <label for="checkbox-28">机动车拆解</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-29" >
    <label for="checkbox-29">旧货业回收</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-30" >
    <label for="checkbox-30">机动车电动车修理</label>
  </div>
</div></td>
    </tr>
    <tr id="j4" style="display:none">
    <td><label class="form-label text-r"><span class="c-red">*</span>九小场所：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-31" >
    <label for="checkbox-31">小学校</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-32" checked>
    <label for="checkbox-32">小商场</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-33" >
    <label for="checkbox-33">小医院</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-34" >
    <label for="checkbox-34">小旅馆</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-35" >
    <label for="checkbox-35">小歌舞娱乐</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-36" >
    <label for="checkbox-36">小餐饮</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-37" >
    <label for="checkbox-37">小网吧</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-38" >
    <label for="checkbox-38">小美容洗浴</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-39" >
    <label for="checkbox-39">小生产加工</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-40" >
    <label for="checkbox-40">其他</label>
  </div>
</div></td>
    </tr>
</table>

  </div>
 <div id class="row cl mt-15">
   <div class="col-12 mb-15 c-primary f-16" style="border-bottom: solid 2px #2DABF7 ">消防信息</div>
  <div  class="row cl">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:45px;">
  <tr>
    <td width="30%"><label class="form-label text-r"><span class="c-red">*</span>经营面积：</label></td>
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">层数：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">通道口个数：</label></td>
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">包间数量：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">容纳人数：</label></td>
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r"><span class="c-red">*</span>合格证号：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
      <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>是否配备以下消防设施：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-41" >
    <label for="checkbox-41">灭火器</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-42" checked>
    <label for="checkbox-42">应急灯</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-43" >
    <label for="checkbox-43">消防拴</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-44" >
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
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r"><span class="c-red">*</span>保安负责人电话：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">保安人数：</label></td>
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"></td>
    <td></td>   
  </tr>
  <tr>
    <td width="30%"><label class="form-label text-r">外部监控数量：</label></td>
    <td width="20%"><input type="text" class="input-text radius size-M " style="width:200px;">
         </td>
  <td width="15%"><label class="form-label text-r">内部监控数量：</label></td>
    <td><input type="text" class="input-text radius size-M " style="width:200px;"></td>   
  </tr>
      <tr>
    <td><label class="form-label text-r"><span class="c-red">*</span>物防情况：</label></td>
    <td colspan="3"><div class="skin-minimal ">
  <div class="check-box" >
    <input type="checkbox"  id="checkbox-45" >
    <label for="checkbox-45">防盗门</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-46" checked>
    <label for="checkbox-46">防盗窗</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-47" >
    <label for="checkbox-47">报警器</label>
  </div>
  <div class="check-box">
    <input type="checkbox" id="checkbox-48" >
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


</body>
</html>