package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.model.StudentInfos;
import com.sxt.video.service.UsersService;
import com.sxt.video.service.impl.StudentInfosServiceImpl;
import com.sxt.video.service.impl.UsersServiceImpl;

public class AddStudentServlet extends HttpServlet {

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
		String userIDStr = request.getParameter("userID");
		String studentName = request.getParameter("studentName");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		String[] interests = request.getParameterValues("interests");
		String qq = request.getParameter("qq");
		String msn = request.getParameter("msn");
		String email = request.getParameter("email");
		String academy = request.getParameter("academy");
		String major = request.getParameter("major");
		String interest=Arrays.toString(interests);
		
		StudentInfos si = new StudentInfos();
		si.setAcademy(academy);
		si.setBirthday(birthday);
		si.setEmail(email);
		si.setGender(Integer.parseInt(gender));
		si.setInterests(interest);
		si.setMajor(major);
		si.setMsn(msn);
		si.setQq(Integer.parseInt(qq));
		si.setStudentName(studentName);
		si.setUserID(Integer.parseInt(userIDStr));
		
		StudentInfosServiceImpl sis = new StudentInfosServiceImpl();
		int count = sis.add(si);
		UsersService us=new UsersServiceImpl();
		int count2=us.updateState(Integer.parseInt(userIDStr), 0);
		if(count==1&&count2==1){
			response.sendRedirect("/video/back/welcom.jsp");
			}
	}
}
