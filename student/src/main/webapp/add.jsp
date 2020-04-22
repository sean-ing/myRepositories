<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="js/jquery-1.9.1.js"	></script>
	<script type="text/javascript">
	$(function(){
		//用户名验证
		$(":text:eq(0)").blur( function(){
			if($(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().html("请输入姓名");
				$(this).next().css({ color: "red"});
			}
		});
		$(":password").blur( function(){
			if($(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().html("请输入密码6-16位");
				$(this).next().css({ color: "red"});
			}
		});
	});
	
	</script>
</head>
<body>
	<form action="insert" method="post">
		姓名：<input type="text" name="username" /><span>请输入姓名</span><br/>
		密码：<input type="password" name="password" /><span>请输入密码6-16位</span><br/>
		身份证：<input type="text" name="number" /><br/>
		年龄：<input type="text" name="age" /><br/>
		出生日期：<input type="text" name="tbirth" /><br/>
		电话号码：<input type="text" name="phone" /><br/>
		邮箱：<input type="text" name="email" /><br/>
			<input type="submit" value="提交" /><br/>
	</form>
</body>
</html>