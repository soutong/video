<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
 <body>
  	 <dl>
  	 	<dt>视频分类管理</dt>
  	 	<dd><a href="/video/listVideoGroupsServlet" target="right">查询视频分类</a></dd>
  	 	<dd><a href="/video/teacher/videogroups_add.jsp" target="right">添加视频分类</a></dd>
  	 </dl>
  	 <dl>
  	 	<dt>学生管理</dt>
  	 	<dd><a href="/video/listVideoInfosServlet" target="right">查询视频</a></dd>
  	 	<dd><a href="/video/listVideoGroupsAllServlet" target="right">添加视频</a></dd>
  	 </dl>
  	 <dl>
  	 	<dt>个人管理</dt>
  	 	<dd><a href="">编辑详细信息</a></dd>
  	 	<dd><a href="">修改密码</a></dd>
  	 </dl>
  	 <dl>
  	 	<dt>问题管理</dt>
  	 	<dd><a href="">查询问题</a></dd>
  	 </dl>
  	 <dl>
  	 	<dt>回复问题管理</dt>
  	 	<dd><a href="">查询回复问题</a></dd>
  	 </dl>
  </body>
</html>