<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<h2 align="center">添加视频分类</h2>
  	<hr>
  	<form action="/video/addVideoGroupsServlet" method="post">
  	<table align="center">
  		<tr>
  			<td>视频分类名称:</td>
  			<td><input type="text" name="groupName"/></td>
  		</tr>
   		<tr>
  			<td colspan="2"><input type="submit" value="添加"/></td>
  		</tr>
  	</table>
  	</form>
</html>