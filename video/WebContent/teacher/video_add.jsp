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
<form action="/video/addVideoInfosServlet" method="post" enctype="multipart/form-data">
	<table align="center" >
	<tr>
	<td>视频分类</td>
	<td><select name="videoGroupID">
	<c:forEach items="${list }" var="videogroups">
	<option value="${videogroups.videoGroupID}">${videogroups.groupName }
	</c:forEach>
	</select>
	</td>
	</tr>
	<tr>
	<td>视频标题</td>
	<td><input type="text" name="title"></td>
	</tr>
	<tr>
	<td>封面图</td>
	<td><input type="file" name="videoimage"></td>
	</tr>
	<tr>
	<td>时长</td>
	<td><input type="text" name="duration"></td>
	</tr>
	<tr>
	<td>视频</td>
	<td><input type="file" name="videopath"></td>
	</tr>
	<tr>
	<td>描述</td>
	<td><input type="text" name="description"></td>
	</tr>
	<tr>
	<td>标签1</td>
	<td><input type="text" name="tag1"></td>
	</tr>
	<tr>
	<td>标签2</td>
	<td><input type="text" name="tag2"></td>
	</tr>
	<tr>
	<td>标签3</td>
	<td><input type="text" name="tag3"></td>
	</tr>
	<tr>
	<td>标签4</td>
	<td><input type="text" name="tag4"></td>
	</tr>
	<tr>
	<td>标签5</td>
	<td><input type="text" name="tag5"></td>
	</tr>
	<tr><td colspan="2"><input type="submit" value="提交"></td></tr>
	</table>
	</form>
</body>
</html>