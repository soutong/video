package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.model.Users;
import com.sxt.video.model.VideoGroups;
import com.sxt.video.model.VideoInfos;
import com.sxt.video.service.VideoGroupsService;
import com.sxt.video.service.VideoInfosService;
import com.sxt.video.service.impl.VideoGroupsServiceImpl;
import com.sxt.video.service.impl.VideoInfosServiceImpl;

public class ListVideoInfosServlet extends HttpServlet {
	

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
		
		String videoGroupIDStr = request.getParameter("videoGroupID");
		String title = request.getParameter("title");
		Users user = (Users)request.getSession().getAttribute("user");
		int videoGroupID=0;
		if(videoGroupIDStr!=null&&!"".equals(videoGroupIDStr)){
			
			videoGroupID=Integer.parseInt(videoGroupIDStr);
		
		}
		VideoInfosService vis = new VideoInfosServiceImpl();
		List<VideoInfos> videoList = vis.finadAll(videoGroupID, title, user.getUserID());
		VideoGroupsService vgs=new VideoGroupsServiceImpl();
		List<VideoGroups> groupList = vgs.findAll();
		
		request.setAttribute("videoList",videoList );
		request.setAttribute("groupList",groupList );
		request.setAttribute("title", title);
		request.setAttribute("user", user);
		request.setAttribute("videoGroupID", videoGroupID);
		request.getRequestDispatcher("/teacher/video_list.jsp").forward(request, response);
		}
	}
