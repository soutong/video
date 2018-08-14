package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.video.model.QuestionGroups;
import com.sxt.video.model.QuestionInfos;
import com.sxt.video.service.QuestionGroupsService;
import com.sxt.video.service.impl.QuestionGroupsServiceImpl;
import com.sxt.video.service.impl.QuestionInfosServiceImpl;
import com.sxt.video.service.impl.VideoInfosServiceImpl;

public class ListQuestionInfosServlet extends HttpServlet {

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
		String questionGroupIDStr = request.getParameter("questionGroupID");
		int questionGroupID=Integer.parseInt(questionGroupIDStr);
		QuestionInfosServiceImpl qis = new QuestionInfosServiceImpl();
		List<QuestionInfos> questionInfosList = qis.findByID(questionGroupID);
		request.setAttribute("questionList", questionInfosList);
		QuestionGroupsService qgs = new QuestionGroupsServiceImpl();
		QuestionGroups questionGroups = qgs.findByID(questionGroupID);
		request.setAttribute("questionGroup", questionGroups);
		request.getRequestDispatcher("/question_list.jsp").forward(request, response);
	}
}