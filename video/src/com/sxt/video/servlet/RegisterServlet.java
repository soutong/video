package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.sxt.video.model.Users;
import com.sxt.video.service.UsersService;
import com.sxt.video.service.impl.UsersServiceImpl;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		
		String path="E:/upload";
		SmartUpload smartUpload=new SmartUpload();
		String fileName=null;
		//获取上传的文件
		//2.初始化SmartUpload对象
		smartUpload.initialize(this.getServletConfig(), request, response);
		//3.调用upload()方法进行上传
		try {
			smartUpload.upload();
			//4.将文件保存到指定的路径
			smartUpload.save(path);
			
		} catch (SmartUploadException e) {
			fileName=smartUpload.getFiles().getFile(0).getFileName();
			e.printStackTrace();
		}
		String facePath=path+"/"+fileName;
		//获取表单元素的值
//		String userName = request.getParameter("userName");
//		System.out.println(userName+"---");
		Request req = smartUpload.getRequest();
		String userName = req.getParameter("userName");
		String userPwd = req.getParameter("userPwd");
		String pwdQuestion = req.getParameter("pwdQuestion");
		String questionAnswer = req.getParameter("questionAnswer");
		String userGroup = req.getParameter("userGroup");
		Users user=new Users();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setPwdQuestion(pwdQuestion);
		user.setQuestionAnswer(questionAnswer);
		user.setUserGroup(Integer.parseInt(userGroup));
		user.setUserFace(facePath);
		UsersService usersService=new UsersServiceImpl();
		int count = usersService.add(user);
		if(count>0){
			response.sendRedirect("/video/success.jsp");
		}
	}
}
