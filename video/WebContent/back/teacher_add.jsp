<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

  <body>
  	<h2 align="center">添加教师</h2>
  	<hr>
  	<form action="/video/addTeacherServlet" method="post">
  	<table align="center">
  		<tr>
  			<td>教师姓名:</td>
  			<td><input type="text" name="teacherName"/></td>
  		</tr>
  		<tr>
  			<td>教师性别:</td>
  			<td>
  				<input type="radio" name="gender" value="1"/>男
  				<input type="radio" name="gender" value="0"/>女
  			</td>
  		</tr>
  		<tr>
  			<td>生日:</td>
  			<td><input type="text" name="birthday"/></td>
  		</tr>
  		<tr>
  			<td>电子邮件:</td>
  			<td>
				<input type="text" name="email"/>
  			</td>
  		</tr>
  		<tr>
  			<td>专业:</td>
  			<td>
				<input type="text" name="major"/>
  			</td>
  		</tr>
  		<tr>
  			<td>职称:</td>
  			<td>
  				<select name="jobTitle">
  					<option value="助教">助教</option>
  					<option value="讲师">讲师</option>
  					<option value="副教授">副教授</option>
  					<option value="教授">教授</option>
  				</select>
  			</td>
  		</tr>
  		<tr>
  			<td>绑定账号:</td>
  			<td>
  				<select name="userID">
  					<c:forEach items="${list}" var="users">
	  					<option value="${users.userID}">${users.userName}</option>
  					</c:forEach>
  				</select>
  			</td>
  		</tr>
  		
  		<tr>
  			<td colspan="2"><input type="submit" value="添加"/></td>
  		</tr>
  	</table>
  	</form>
  </body>
</html>