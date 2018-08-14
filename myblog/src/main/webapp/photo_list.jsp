<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
	<td>照片描述</td>
	<td>上传时间</td>
	<td>操作</td>
	</tr>
	<c:if test="${not empty photoList}">
	<c:forEach items="${photoList}" var="photo">
	<tr>
	<td>${photo.photoDesc }</td>
	<td>${photo.uploadTime }</td>
	<td><a href="download.action?photoId=${photo.photoId}">下载</a>,<a href="delete.action?photoId=${photo.photoId }">删除</a></td>
	</tr>
	</c:forEach>
	</c:if>
	
	</table>
	
</body>
</html>