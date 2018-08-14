<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


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
    <div class="video_main">
    	<div class="video_top">
        	<dl>
            	<dt><img src="images/shipinico_06.gif" /></dt>
                <dd>网页设计</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_15.gif" /></dt>
                <dd>操作系统</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_17.gif" /></dt>
                <dd>编程开发</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_08.gif" /></dt>
                <dd>平面设计</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_10.gif" /></dt>
                <dd>办公应用</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_12.gif" /></dt>
                <dd>flash课程</dd>
            </dl>
            <dl>
            	<dt><img src="images/shipinico_20.gif" /></dt>
                <dd>三维设计</dd>
            </dl>
        </div>

        <div class="video_con" style="width:100%">
        	<h1>视频播放 ${video.videoPath}</h1>
            <div class="con_2" style="width:100%">
			<div style="text-align:center">
	<div id="a1"></div>
	<script type="text/javascript" src="ckplayer/ckplayer.js" charset="utf-8"></script>
	<script type="text/javascript">
		var flashvars={
		    f:'${video.videoPath}',
		    c:0,
		    s:0,
		    i:'${video.videoImage}',
		    l:'temp/1.jpg|temp/2.jpg',
		    r:'http://www.zzsxt.cn|http://www.baidu.com',
		    t:'10|10',
		    d:'temp/3.jpg|temp/4.jpg',
		    u:'http://www.bjsxt.com|http://www.taobao.com'
		};
		var video=['upload/spring.mp4->video/mp4'];
		CKobject.embed('ckplayer/ckplayer.swf','a1','ckplayer_a1','600','400',false,flashvars,video);
		
		//跳过广告
		function ckadjump(){
// 			alert("请注册会员!");
			CKobject.getObjectById('ckplayer_a1').frontAdUnload();
		}
	</script>
				
			</div>
   <!-- 评论 -->			
   <c:if test="${empty list}">
   	<div class="question_con">暂无评论信息!</div>
   </c:if>
   <c:if test="${not empty list}">
   <c:forEach items="${list}" var="vo">
 <div class="question_con">
      <table width="100%" border="0" cellspacing="0" class="tab">
		  <tr>
		    <td width="188" bgcolor="#F2F7FD"><div class="bbs_left">
		        <p>${users.userName }</p>
		        <p><img src="${vo.userFace}" width="140" height="135"/></p>
		
		        <ul>
		          <li>姓名：<span>${vo.studentName}</span></li>
		          <li>性别：<span>
		          		<c:if test="${vo.gender==1}">男</c:if>
		          		<c:if test="${vo.gender==0}">女</c:if>
		          </span></li>
		          <li>回复：<span>315</span></li>
		          <li>来自：<span>${vo.academy }</span></li>
		          <br />
		          <br />
		          <br />
		        </ul>
		    </div>
		        </td>
		    <td valign="top"><div class="bbs_r1">
		        <p class="bbs_gd4">${vo.addTime }</p>
		    	</div>
		        <div class="bbs_nr">
		        	${vo.contents}
		        </div>
		        <div class="huifu">
		        	<h3> 我轻轻的走，正如我轻轻的来... </h3>
		            <div class="huifu2">
		            	<ul>
		                	<li>回 复</li>
		                    <li>引 用</li>
		                </ul>
		                <div style="float:right; padding:3px 25px 0 0;"><img src="images/con_17.gif" /></div>
		            </div>
		        </div>
		    </td>
		  </tr>
		</table>
      </div>
     </c:forEach> 
   </c:if>
 	  
	   <div class="tijiao_kuang">
	   <form action="/video/addCommentInfosServlet" method="post">
	   		<input type="hidden" name="videoInfoID" value="${video.videoInfoID}"/>
			<table>
	                <tr>
	                	<td width="80" align="right" valign="top">内容：</td>
	               	  <td><textarea name="contents" cols="35" rows="4" class="text"></textarea></td>
	                </tr>
	                <tr>
	                	<td width="80" align="right">&nbsp;</td>
	               	  <td><input name="" type="image" src="images/con_26.gif" /></td>
	                </tr>
	          </table>
            </form>
            <div style="float:right; margin:30px 65px 0 0">
            	<img src="images/con_22.gif" />
            </div>
            <br />
            <br />
      </div>
    </div>
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
</body>
</html>
