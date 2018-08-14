package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.service.TeacherInfosService;
import com.sxt.video.service.impl.TeacherInfosServiceImpl;
import com.sxt.video.vo.Pagenation;

public class ListTeacherServlet extends HttpServlet {

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
		
		String curPageStr = request.getParameter("curPage");
		int curPage=1;
		if(curPageStr!=null){
			 curPage=Integer.parseInt(curPageStr);
		}
		TeacherInfosService ti = new TeacherInfosServiceImpl();
		Pagenation pg = ti.findbyPagenation(curPage);
		request.setAttribute("pagination", pg);
		request.getRequestDispatcher("/back/teacher_list.jsp").forward(request, response);
	}
}
