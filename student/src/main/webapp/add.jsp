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
		//密码验证
		$(":password:eq(0)").blur( function(){
			if($(this).val()==$(":password:eq(1)").val()&&$(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}
			else{
				$(this).next().html("密码不为空或不一致");
				$(this).next().css({ color: "red"});
			} 
		});
		//确认密码
		$(":password:eq(1)").blur( function(){
			if($(this).val()==$(":password:eq(0)").val()){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
				$(":password:eq(0)").next().html("√");
				$(":password:eq(0)").next().css({ color: "blue"});
			}else{
				$(this).next().html("密码不一致");
				$(this).next().css({ color: "red"});
			}
		});
		//身份证验证
		$(":text:eq(1)").blur( function(){
			if($(this).val().length=="18"){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().html("请正确的身份证号码");
				$(this).next().css({ color: "red"});
			}
		});
		//年龄验证
		$(":text:eq(2)").blur( function(){
			if($(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().html("请输入年龄");
				$(this).next().css({ color: "red"});
			}
		});
		//出生日期
		$(":text:eq(3)").blur( function(){
			if($(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().css({ color: "red"});
			}
		});
		//电话号码
		$(":text:eq(4)").blur( function(){
			if($(this).val().length=="11"){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().css({ color: "red"});
			}
		});
		//邮箱验证
		$(":text:eq(5)").blur( function(){
			if($(this).val()!=""){
				$(this).next().html("√");
				$(this).next().css({ color: "blue"});
			}else{
				$(this).next().html("请输入正确的邮箱");
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
		确认密码：<input type="password" name="checkpassword" /><span>请再输一次密码</span><br/>
		身份证：<input type="text" name="number" /><span>请输入身份证号码</span><br/>
		年龄：<input type="text" name="age" /><span>请输入年龄</span><br/>
		出生日期：<input type="text" name="tbirth" /><span>请输入出生年月(xxxx-xx-xx)</span><br/>
		电话号码：<input type="text" name="phone" /><span>请输入电话号码</span><br/>
		邮箱：<input type="text" name="email" /><span>请输入邮箱</span><br/>
			<input type="submit" value="提交" /><br/>
	</form>
</body>
</html>