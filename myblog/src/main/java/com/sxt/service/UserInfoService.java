package com.sxt.service;

import com.sxt.model.UserInfo;

public interface UserInfoService {
	public int register(UserInfo userInfo);
	public UserInfo login(UserInfo userInfo);
}
