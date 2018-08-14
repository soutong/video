<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>视频点播教学辅管理助系统</title>
<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="content">
	<div class="top">
    	<img src="images/img_03.gif" />
    </div>
    <div class="nav">
    	<div class="nav_left"></div>
    	<ul>
        	<li><a href="index.html">首页</a></li>
            <li><a href="video.html">视频空间</a></li>
            <li><a href="Question.html">在线问答</a></li>
            <li id="soso"><input name="" type="text" /></li>
            <li><input name="" type="button" value="确定" id="que"/></li>
        </ul>
        <div class="nav_right"></div>
    </div>
    <div style="margin-top:5px; float:left">
    	<img src="images/ggsrxx.jpg" />
    </div>
    <div class="main">
    	<div class="main_left">
        	<h1>
            	<ul>
               	  <li style="width:500px">问题分类</li>
                  <li style="width:130px">主题/文章</li>
                    <li>更新时间</li>
                </ul>
            </h1>
            <div class="main_left_1">
            	<table width="720" border="0">
            	  <c:forEach items="${list}" var="group">
	                  <tr>
	                    <td width="70" valign="middle"><a href="Question_list.html"><img src="images/que_11.gif" width="51" height="51" /></a></td>
	                    <td width="407"><a href="/video/listQuestionInfosServlet?questionGroupID=${group.questionGroupID}">${group.groupName}<br />专门为新手制作的专区包括上网软件</a></td>
	                    <td width="90" align="center" valign="middle"><span class="red">125</span>/1215</td>
	                    <td align="center" valign="middle">${group.addTime}</td>
	                  </tr>
            	  </c:forEach>
                 </table>
                <br />
		  </div>
        </div>
        <div class="main_right">
        	<div class="main_right_1">
                <h1>待解决问题<span class="gengduo"><a href="#">更多>></a></span></h1>
                <ul>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                     <br /><br />
                </ul>
               
            </div>
            <div class="main_right_1" style=" margin:5px 0 0 0;">
                <h1>已解决问题<span class="gengduo"><a href="#">更多>></a></span></h1>
                <ul>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <li>[java]吉娃中的类是不是很难弄时间？</li>
                    <br /><br />
                </ul>
            </div>
        </div>
    </div>
    <div class="footer">
    	<ul>
        	<li>
            	<a href="">简介</a>
                <a href="">最新动态</a>
                <a href="">用户协议</a>
                <a href="">广告服务</a>
                <a href="">商务合同</a>
            </li>
            <li>
            	Copyright(C) 2009 视频点播辅助系统
            </li>
            <li>
            	邮件：shipin@hotmail.com
            </li>
            <li>
            	未经本站同意，不得转载本站信息
                <br /><br />
            </li>
        </ul>
    </div>
   </div>
</body>
</html>