<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<h2 align="center">用户注册</h2>
  	<hr>
  	<form action="registerServlet" method="post" enctype="multipart/form-data">
  	<table align="center">
  		<tr>
  			<td>用户名:</td>
  			<td><input type="text" name="userName"/></td>
  		</tr>
  		<tr>
  			<td>密码:</td>
  			<td><input type="password" name="userPwd"/></td>
  		</tr>
  		<tr>
  			<td>头像:</td>
  			<td><input type="file" name="userFace"/></td>
  		</tr>
  		<tr>
  			<td>密保问题:</td>
  			<td>
				<input type="text" name="pwdQuestion"/>
  			</td>
  		</tr>
  		<tr>
  			<td>密保答案:</td>
  			<td>
				<input type="text" name="questionAnswer"/>
  			</td>
  		</tr>
  		<tr>
  			<td>用户身份:</td>
  			<td>
				<input type="radio" name="userGroup" value="2"/> 教师
				<input type="radio" name="userGroup" value="3"/> 学生
  			</td>
  		</tr>
  		<tr>
  			<td colspan="2"><input type="submit" value="注册"/></td>
  		</tr>
  	</table>
  	</form>
  </body>
</html>