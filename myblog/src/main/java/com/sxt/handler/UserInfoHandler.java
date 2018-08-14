package com.sxt.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.model.UserInfo;
import com.sxt.service.UserInfoService;

@Controller
public class UserInfoHandler {
	@Autowired
	private UserInfoService userInfoService;
	@RequestMapping("/register")
	public String register(UserInfo userInfo){
		int count = userInfoService.register(userInfo);
		if(count>0){
			return "login";
		}
		return "register";
	}
	@RequestMapping("/login")
	public String login(UserInfo userInfo,HttpSession session){
		UserInfo userInfo2 = userInfoService.login(userInfo);
		if(userInfo2!=null){
			session.setAttribute("userInfo", userInfo2);
			return "index";
		}
		return "login";
		
	}
}
