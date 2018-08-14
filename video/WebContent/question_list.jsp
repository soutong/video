<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
    <c:if test="${empty questionList }">
    <div class="main_left">
        	<h1>
				${questionGroup.groupName}
            </h1>
            <div class="main_left_1">
            	<dl class="que_list">
                	<dt><img src="images/wenhao.gif" /></dt>
                    <dd><a href="Question_con.html">暂时没有数据</a></dd>
                </dl>
               
               <p style="height:60px; float:left;">
               <br />
               <br />
				</p>
		  </div>
        </div>
    
    </c:if>
    
    <c:if test="${not empty questionList}">
    	<div class="main_left">
        	<h1>
				${questionGroup.groupName}
            </h1>
            <div class="main_left_1">
    <c:forEach items="${questionList}" var="question">
            	<dl class="que_list">
                	<dt><img src="images/wenhao.gif" /></dt>
                    <dd><a href="Question_con.html">${question.contents}</a></dd>
                </dl>
               
               <p style="height:60px; float:left;">
               <br />
               <br />
				</p>
       </c:forEach> 
		  </div>
        </div>
       </c:if>
        <div class="main_right">
        	<div class="main_right_1">
                <h1>待解决问题<span class="gengduo"><a href="#">更多>></a></span></h1>
                <ul>
                    <li>asp.net   建站用什么做界面 </li>
                    <li>VS2008編輯gridview獲取不到文本框的值</li>
                    <li>asp.net   Mvc   哪里有下载 </li>
                    <li>.net中页面和进程的问题 </li>
                    <li>FileUpLoad访问权限问题 </li>
                    <li>关于使用Lucene.Net的问题 </li>
                    <li>如何用上下键在gridview中切换行 </li>
                    <li>Js调用ActiveX的事件 </li>
                    <li>求Cookie的标准代码.... </li>
                    <li>使用UpdatePanel的问题  </li>
                    <li>关于TreeView自定义的问题</li>
                     <br /><br />
                </ul>
               
            </div>
            <div class="main_right_1" style=" margin:5px 0 0 0;">
                <h1>已解决问题<span class="gengduo"><a href="#">更多>></a></span></h1>
                <ul>
                    <li>如何让TreeView不刷 </li>
                    <li>取gridview上面的值 </li>
                    <li>asp.net   from提交在火狐里没有效果 </li>
                    <li>母版页的session问题！</li>
                    <li>input   每次刷新都要点击重试 </li>
                    <li>如何做asp.net架构师？</li>
                    <li>asp.net   分层架构 </li>
                    <li>哪本书编写购物网站比较好？ </li>
                    <li>怎么存放购物车？ </li>
                    <li>gridview怎么分页啊？ </li>
                    <li>CuteEditor使用问题 </li>
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
