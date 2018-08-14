package com.sxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxt.mapper.UserInfoMapper;
import com.sxt.model.UserInfo;
import com.sxt.service.UserInfoService;
@Service(value="userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	public int register(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoMapper.register(userInfo);
	}

	public UserInfo login(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoMapper.login(userInfo);
	}

}
