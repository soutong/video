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
	<form action="/video/listVideoInfosServlet" method="post">
	<table align="center">
	<tr>
	<td> <select name="videoGroupID">
	<option value="0" >全部</option>
	<c:forEach items="${groupList}" var="group">
	<c:if test="${group.videoGroupID==videoGroupID }">
	<option value="${group.videoGroupID }" selected >${group.groupName }</option>
	</c:if>
	<c:if test="${group.videoGroupID!=videoGroupID }">
	<option value="${group.videoGroupID }" >${group.groupName }</option>
	</c:if>
	</c:forEach>
	</select>
	</td>
	<td>视频标题 ：<input type="text" name="title" value="${title }"></td>
	<td><input type="submit" value="搜索"></td>
	</tr>
	</table>
	</form>
	<table align="center" width="800" border="1">
	<tr>
	<td>编号</td>
	<td>标题</td>
	<td>封面</td>
	<td>时长</td>
	<td>描述</td>
	<td>操作</td>
	</tr>
	<c:if test="${not empty videoList}">
	<c:forEach items="${videoList }" var="videoInfos">
	<tr>
	<td>
	${videoInfos.videoInfoID }</td>
	<td>${videoInfos.title }</td>
	<td><img src="${videoInfos.videoImage }" width="100" height="50"></img></td>
	<td>
	${videoInfos.duration}
	</td>
	<td>
	${videoInfos.description }
	</td>
	<td>
	编辑	删除
	</td>
	</tr>
	</c:forEach>
	</c:if>
	</table>
	
</body>
</html>