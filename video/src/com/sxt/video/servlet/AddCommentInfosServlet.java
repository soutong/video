package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.model.CommentInfos;
import com.sxt.video.model.Users;
import com.sxt.video.service.CommentInfosService;
import com.sxt.video.service.impl.CommentInfosServiceImpl;

public class AddCommentInfosServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于get请求的乱码解决，先采用iso8859-1编码，再使用utf-8解码
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
		String contents = request.getParameter("contents");
		Users user=(Users)request.getSession().getAttribute("user");
		int userID = user.getUserID();
		String videoInfoIDStr = request.getParameter("videoInfoID");
		int videoInfoID=0;
		if(videoInfoIDStr!=null){
			videoInfoID=Integer.parseInt(videoInfoIDStr);
		}
		CommentInfos commentInfos = new CommentInfos();
		commentInfos.setContents(contents);
		commentInfos.setUserID(userID);
		commentInfos.setVideoInfoId(videoInfoID);
		
		CommentInfosService cis=new CommentInfosServiceImpl();
		int count = cis.add(commentInfos);
		if(count>0){
			request.getRequestDispatcher("/listVideoInfosByIDServlet").forward(request, response);
		}
	}
}
