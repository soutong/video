package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.model.TeacherInfos;
import com.sxt.video.service.TeacherInfosService;
import com.sxt.video.service.UsersService;
import com.sxt.video.service.impl.TeacherInfosServiceImpl;
import com.sxt.video.service.impl.UsersServiceImpl;

public class AddTeacherServlet extends HttpServlet {

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
		String userIDstr = request.getParameter("userID");
		String teacherName=request.getParameter("teacherName");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		String email = request.getParameter("email");
		String major = request.getParameter("major");
		String jobTitle = request.getParameter("jobTitle");
		
		TeacherInfos ti = new TeacherInfos();
		ti.setUserID(Integer.parseInt(userIDstr));
		ti.setTeacherName(teacherName);
		ti.setGender(Integer.parseInt(gender));
		ti.setBirthday(birthday);
		ti.setEmail(email);
		ti.setMajor(major);
		ti.setJobTitle(jobTitle);
		TeacherInfosService tis=new TeacherInfosServiceImpl();
		int count = tis.add(ti);
		UsersService us=new UsersServiceImpl();
		int count2=us.updateState(Integer.parseInt(userIDstr), 0);
		if(count==1&&count2==1){
			response.sendRedirect("/video/back/welcom.jsp");
			}
	}
}
