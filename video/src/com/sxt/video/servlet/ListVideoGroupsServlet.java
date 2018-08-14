package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.service.VideoGroupsService;
import com.sxt.video.service.impl.VideoGroupsServiceImpl;
import com.sxt.video.vo.Pagenation;

public class ListVideoGroupsServlet extends HttpServlet {

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
		String curPageStr=request.getParameter("curPage");
		String groupName=request.getParameter("groupName");
		String op = request.getParameter("op");
		if(groupName!=null&&!"post".equals(op)){
			groupName = new String(groupName.getBytes("iso-8859-1"),"UTF-8");
			
		}
		int curPage=1;
		if(curPageStr!=null){
			curPage=Integer.parseInt(curPageStr);
		}
		VideoGroupsService vgs=new VideoGroupsServiceImpl();
		Pagenation pagination = vgs.findByName(curPage, groupName);
		request.setAttribute("pagination",pagination);
		request.setAttribute("groupName", groupName);
		request.getRequestDispatcher("/teacher/videogroups_list.jsp").forward(request, response);
		
		}
}
