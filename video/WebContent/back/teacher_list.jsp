<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<table align="center" width="800" border="1">
  		<caption>教师基本信息列表</caption>
  		<tr>
  				<td>编号</td>
  				<td>姓名</td>
  				<td>性别</td>
  				<td>生日</td>
  				<td>专业</td>
  				<td>职称</td>
  				<td>操作</td>
  		</tr>
  		<c:if test="${empty pagination.list}">
  			<tr>
  				<td colspan="7">暂无数据!</td>
  			</tr>
  		</c:if>
  		<c:if test="${not empty pagination.list}">
  			<c:forEach items="${pagination.list}" var="teacher">
 				<tr>
 					<td>${teacher.teacherInfoID}</td>
	  				<td>${teacher.teacherName}</td>
	  				<td>
	  					<c:if test="${teacher.gender==0}">女</c:if>
	  					<c:if test="${teacher.gender==1}">男</c:if>
	  				</td>
	  				<td>${teacher.birthday }</td>
	  				<td>${teacher.major }</td>
	  				<td>${teacher.jobTitle }</td>
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
	  		<a href="listTeacherServlet?curPage=${pagination.curPage-1}">上一页</a>
  		</c:if>
  		<!-- 当前页不是最后一页,展示下一页 -->
  		<c:if test="${pagination.curPage!=pagination.totalPages}">
	  		<a href="listTeacherServlet?curPage=${pagination.curPage+1}">下一页</a>
  		</c:if>
  	 </p>
  </body>
</html>