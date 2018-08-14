package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxt.video.model.Users;
import com.sxt.video.service.UsersService;
import com.sxt.video.service.impl.UsersServiceImpl;

public class LoginServlet extends HttpServlet {

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
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		UsersService usersService=new UsersServiceImpl();
		Users users = usersService.login(userName, userPwd);
		HttpSession session = request.getSession();
		if(users!=null){
			session.setAttribute("user", users);
			if(users.getState()==0&&users.getUserGroup()==1){
			response.sendRedirect("/video/back/main.jsp");
			}else if(users.getState()==0&&users.getUserGroup()==2){
				response.sendRedirect("/video/teacher/main.jsp");
			}else if(users.getState()==0&&users.getUserGroup()==3){
				response.sendRedirect("/video/listIndexServlet");
			}else {
				session.setAttribute("msg", "该用户状态不正确，请联系管理员");
				response.sendRedirect("/video/index.html");
			}
		}else{
			session.setAttribute("msg", "该用户账号或者密码错误");
			response.sendRedirect("/video/index.html");
			
		}
		
	}
}
