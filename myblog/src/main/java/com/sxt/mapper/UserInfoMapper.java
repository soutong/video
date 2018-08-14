package com.sxt.mapper;

import com.sxt.model.UserInfo;

public interface UserInfoMapper {
	public int register(UserInfo userInfo);
	public UserInfo login(UserInfo userInfo);
		
	
}
