<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>添加用户</title>
<link href="${pageContext.request.contextPath }/css/build.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id=" ">
	  <table class="table">
    <thead class="text-c">
    <tr>
        <th>用户名</th>
         <td width="70%"><input type="text" /></td>
      </tr>
    </thead>
      <tbody>
      <tr class="text-c">
        <th>用户职位</th>
        <td><input type="text" /></td>
      </tr>
     <tr class="text-c">
       <th>管理级别</th>
       <td><input name="vd" type="radio" value="1" checked="checked"/>
         A <input name="vd" type="radio" value="4" />
         B <input name="vd" type="radio" value="6" />
         C</td>
     </tr>
      <tr class="text-c">
       <th>密码初始化</th>
        <td><input name="vd" type="radio" value="1" checked="checked"/> 
          是
            <input name="vd" type="radio" value="4" /> 
            否
</td>
      </tr>
      <tr class="text-c">
        <th style="background:#FFF;border: #FFF; text-align:center;" colspan="2"><a href="${pageContext.request.contextPath }/user/queryUsers" class="button orange smallrouded"><i class="Hui-iconfont">&nbsp;&nbsp;&nbsp;&#xe66c;</i>返回&nbsp;&nbsp;&nbsp;</a>  <a id="save" href="#" class="button blue smallrouded"><i class="Hui-iconfont">&nbsp;&nbsp;&nbsp;&#xe632;</i>保存&nbsp;&nbsp;&nbsp;</a></th>
      </tr>
      </tbody>
    </table>
    
		
		</form>
        
</div>
</body>
</html>
