<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border="1px">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>密码</td>
			<td>身份证</td>
			<td>年龄</td>
			<td>出生日期</td>
			<td>电话</td>
			<td>邮箱</td>
		</tr>
		<c:forEach items="${list }" var="student">
			<tr>
				<td>${student.id }</td>
				<td>${student.username }</td>
				<td>${student.password }</td>
				<td>${student.number }</td>
				<td>${student.age }</td>
				<td>
				<fmt:formatDate pattern="yyyy-MM-dd" value="${student.birth }" />
				</td>
				<td>${student.phone }</td>
				<td>${student.email }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>