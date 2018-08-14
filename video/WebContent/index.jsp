<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            <li><a href="/video/listQuestionGroupsServlet">在线问答</a></li>
            <li id="soso"><input name="" type="text" /></li>
            <li><input name="" type="button" value="确定" id="que"/></li>
        </ul>
        <div class="nav_right"></div>
    </div>
    <div class="main">
		<div class="m">    	
            <div class="m1">
              <object id="bcastr4" data="swf/xixi.swf?xml=xml/lanren.xml" type="application/x-shockwave-flash" width="293" height="165">
                <param name="movie" value="swf/xixi.swf?xml=xml/lanren.xml" />
              </object>
            </div>
            <div class="m2">
            	<h1>热门视频</h1>
                <dl>
                	<dt><a href="video_info.html"><img src="images/09.gif" /></a></dt>
                    <dd><a href="video_info.html">java面向对象程序设计</a></dd>
                    <dd>主讲：孙二娘老师</dd>
                    <dd>讲座次数：1000次</dd>
                </dl>
                <ul>
                	<li><a href="video_info.html">asp.net　Web开发高级应用</a></li>
                    <li><a href="video_info.html">java编程思想</a></li>
                    <li><a href="video_info.html">人体解剖学</a></li>
                    <li><a href="video_info.html">历史，听我回忆</a></li>
                    <li><a href="video_info.html">Linq最新讲解</a></li>
                    <li><a href="video_info.html">ＳＳＨ框架讲解</a></li>
                    <li><a href="video_info.html">会计学原理</a></li>
                    <li><a href="video_info.html">一堂课改变一生</a></li>
                    <li><a href="video_info.html">小时候的故事很多……很多……</a></li>
                    <li><a href="video_info.html">羽毛球技巧</a></li>
                </ul>
            </div>
</div>
        <div class="a">
        	<div class="a1">
        	<c:forEach items="${groupList}" var="group">
                <a href="#">${group.groupName}</a>
             </c:forEach> 
            </div>
            <div class="a2">
            	<h1>整套学习</h1>
                <div class="a2_con">
                <c:forEach items="${videoList}" var="video">
                	<dl>
                    	<dt><a href="/video/listVideoInfosByIDServlet?videoInfoID=${video.videoInfoID}"><img src="${video.videoImage}" height="75" with="120"/></a></dt>
                        <dd>名称：<a href="/video/listVideoInfosByIDServlet?videoInfoID=${video.videoInfoID}">${video.title}</a></dd>
                        <dd>整套包括：${video.description}</dd>
                        <dd>浏览次数：284121人</dd>
                    </dl>
                 </c:forEach>
                </div>
            </div>
        </div>    
        <div class="i">
        	<div class="i1">
        	<c:if test="${user!=null }">
        	欢迎你，${user.userName }
        	
        	<a href="/video/logoutServlet">注销</a>
        	</c:if>
        	<c:if test="${user==null }">
        	
        	<form action="/video/loginServlet" method="post">
            	<table width="100%" border="0">
                  <tr>
                    <td>账号：</td>
                    <td><label>
                      <input type="text" name="userName" id="textfield" />
                    </label></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>密码：</td>
                    <td><input type="text" name="userPwd" id="textfield2" /></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>
                    	<label>
                      	<input type="radio" name="radio" id="radio" value="radio" />
                    	学生
                    	<input type="radio" name="radio" id="radio" value="radio" />
                        教师
                        </label>	
                    </td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><input name="" type="image" src="images/img_17.gif" /></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr><td colspan="2"><input type="submit" value="登录"><td></td></tr>
                </table>
                </form>
                </c:if>
            </div>
            <div class="i2">
            <h1>活跃用户榜</h1>
            	<div class="i2_user">
                <dl>
                	<dt>1</dt>
                    <dd style="padding:3px; width:40px; height:42px; border:1px solid #eaeaea"><img src="images/01-40.jpg" /></dd>
                    <dd>用户：fulaoshi</dd>
                    <dd>积分：1725</dd>
                </dl>
                <dl>
                	<dt>2</dt>
                    <dd style="padding:3px; width:40px; height:42px; border:1px solid #eaeaea"><img src="images/02-40.jpg" /></dd>
                    <dd>用户：limeteor</dd>
                    <dd>积分：1400</dd>
                </dl>
                <dl>
                	<dt>3</dt>
                    <dd style="padding:3px; width:40px; height:42px; border:1px solid #eaeaea"><img src="images/03-40.jpg" /></dd>
                    <dd>用户：十年</dd>
                    <dd>积分：1302</dd>
                </dl>
                <dl>
                	<dt>4</dt>
                    <dd style="padding:3px; width:40px; height:42px; border:1px solid #eaeaea"><img src="images/04-40.jpg" /></dd>
                    <dd>用户：小小流星</dd>
                    <dd>积分：1210</dd>
                </dl>
                 <dl>
                	<dt>5</dt>
                    <dd style="padding:3px; width:40px; height:42px; border:1px solid #eaeaea"><img src="images/05-40.jpg" /></dd>
                    <dd>用户：laoda</dd>
                    <dd>积分：800</dd>
                </dl>
                </div>
            </div>
        </div>
 </div>
 <div class="main">
        <div class="new_void">
        	<h1>最新视频</h1>
            <div class="void_list">
            <c:forEach items="${videoList}" var="video">
        	<dl>
            	<dt><a href="video_info.html"><img src="${video.videoImage }" /></a></dt>
                <dd><a href="video_info.html">${video.title }</a></dd>
                <dd>学习人数：2145</dd>
            </dl>
           </c:forEach>
            </div>
        </div>
        <div class="huati">
        	<h1>热门话题</h1>
            <ul>
            	<li><a href="Question_con.html">我们为什么选择Silverlight？</a></li>
                <li><a href="Question_con.html">需要用linqtosql实现多条件查找和排序？</a></li>
                <li><a href="Question_con.html">VS2010使用问题</a></li>
                <li><a href="Question_con.html">ADO.net与Linq的关联</a></li>
                <li><a href="Question_con.html">有多少人要用VSTS做软件测试啊</a></li>
                <li><a href="Question_con.html">SQL Server 负载均衡 集群</a></li>
                <li><a href="Question_con.html">SOS，链接服务器</a></li>
                <li><a href="Question_con.html">asp.net中利用ashx实现图片防盗链</a></li>
                <li><a href="Question_con.html">java获得cookie问题</a></li>
                <li><a href="Question_con.html">jsp页面打印</a></li>
                <li><a href="Question_con.html">请问j2se和j2ee的绘图底层是用什么实现的？</a></li>
            </ul>
        </div>
        </div>
        <div class="main">
      <div class="new_tiwen">
       	<h1>最新提问</h1>
      	<table width="100%" border="0">
  <tr>
    <td>标题</td>
    <td>提问者</td>
    <td>回复/查看</td>
  </tr>
  <tr>
    <td><a href="Question_con.html">页面怎么显示EXCEL表格 ？</a></td>
    <td>limeteor</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
  <tr>
    <td><a href="Question_con.html">asp.net用正则表达式替换html标签</a></td>
    <td>gamboll</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
  <tr>
    <td><a href="Question_con.html"> 关于课上老师讲的MVC中control如何控制跳转的问题</a></td>
    <td>liuapmmy</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">发个关于datalist嵌套的贴子</a></td>
    <td>fylald</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">jboss 4.0 报java.lang.ClassCastException的问题</a></td>
    <td>nabor</td>
    <td><span class="lan">125</span>/1256</td>
  </tr> <tr>
    <td><a href="Question_con.html">java怎么样监听系统进程? </a></td>
    <td>mcr8150 </td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">ASP.NET不简单,做网站更不简单</a></td>
    <td>xdong</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">asp.net中缓存总结</a></td>
    <td>红海达哥</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">gridview进行数据绑定，并以表格的形式显示出来</a></td>
    <td>q001</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
   <tr>
    <td><a href="Question_con.html">让UserControl 成为 Asp.Net ajax 控件</a></td>
    <td> 呆呆小白</td>
    <td><span class="lan">125</span>/1256</td>
  </tr>
</table>
  
      </div>
       <div class="huati">
        	<h1>最新评论</h1>
            <ul>
            	<li><a href="Question_con.html">java   新手   触发事件</a></li>
                <li><a href="Question_con.html">ASP.NET的母版页是做什么？</a></li>
                <li><a href="Question_con.html">新手必须了解的ASP.NET语句</a></li>
                <li><a href="Question_con.html">ASP.net 处理Excel导出框架</a></li>
                <li><a href="Question_con.html">JLabel显示图片的名称问题</a></li>
                <li><a href="Question_con.html">有关CMS+BLOG+BBS三合一系统</a></li>
                <li><a href="Question_con.html">Silverlight 3把多点触摸带进Web世界</a></li>
                <li><a href="Question_con.html">ASP.NET页面刷新方法总结</a></li>
                <li><a href="Question_con.html">关于jtree节点的展开</a></li>
                <li><a href="Question_con.html">页面间如何传一个对象 如（list） </a></li>
                <li><a href="Question_con.html">java   Swing中屏蔽系统热键</a></li>
            </ul>
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
