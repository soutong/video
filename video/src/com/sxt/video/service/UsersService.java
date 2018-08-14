package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.Users;

public interface UsersService {
	public Users login(String userName,String userPwd);
	public int add(Users user);
	public List<Users> findAll();
	public int updateState(int userID,int State);
}
