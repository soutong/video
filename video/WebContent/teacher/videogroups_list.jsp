<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
  <form action="/video/listVideoGroupsServlet" method="post">
  	<input type="hidden" name="op" value="post">
  	<table align="center">
		<tr>
			<td>分类名称:<input type="text" name="groupName" value="${groupName }"/></td>
			<td><input type="submit" value="搜索"></td>
		</tr>  	
  	</table>	
  </form>
  	<table align="center" width="800" border="1">
  		<caption>视频分类基本信息列表</caption>
  		<tr>
  				<td>编号</td>
  				<td>分类名称</td>
  				<td>创建时间</td>
  				<td>操作</td>
  		</tr>
  		<c:if test="${empty pagination.list}">
  			<tr>
  				<td colspan="4">暂无数据!</td>
  			</tr>
  		</c:if>
  		<c:if test="${not empty pagination.list}">
  			<c:forEach items="${pagination.list}" var="group">
 				<tr>
 					<td>${group.videoGroupID}</td>
	  				<td>${group.groupName}</td>
	  				<td>${group.addTime }</td>
	  				<td>编辑 删除</td>
 				</tr> 			
  			</c:forEach>
  		</c:if>
  	</table>
  	<p align="center">
  		共${pagination.totalPages}页&nbsp;&nbsp;&nbsp;&nbsp;
  		当前${pagination.curPage}页&nbsp;&nbsp;&nbsp;&nbsp;
  		共${pagination.totalRows}条记录&nbsp;&nbsp;&nbsp;&nbsp;
  		<!-- 当前页不是第一页,展示上一页 -->
  		<c:if test="${pagination.curPage!=1}">
	  		<a href="/video/listVideoGroupsServlet?curPage=${pagination.curPage-1}&groupName=${groupName}">上一页</a>
  		</c:if>
  		<!-- 当前页不是最后一页,展示下一页 -->
  		<c:if test="${pagination.curPage!=pagination.totalPages}">
	  		<a href="/video/listVideoGroupsServlet?curPage=${pagination.curPage+1}&groupName=${groupName}">下一页</a>
  		</c:if>
  	 </p>
</html>