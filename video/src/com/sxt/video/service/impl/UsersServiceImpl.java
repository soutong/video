package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.UsersDao;
import com.sxt.video.dao.impl.UsersDaoImpl;
import com.sxt.video.model.Users;
import com.sxt.video.service.UsersService;
import com.sxt.video.utils.MD5Utils;

public class UsersServiceImpl implements UsersService {

	private	UsersDao usersDao=new UsersDaoImpl();
	@Override
	public Users login(String userName, String userPwd) {
		 String newUserPwd = MD5Utils.createMD5(userPwd);
		
		return usersDao.login(userName, newUserPwd) ;
	}
	@Override
	public int add(Users user) {
		String userPwd = user.getUserPwd();
		String newUserPwd = MD5Utils.createMD5(userPwd);
		user.setUserPwd(newUserPwd);
		return  usersDao.add(user);
		
	}
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersDao.findAll();
	}
	@Override
	public int updateState(int userID,int State) {
		// TODO Auto-generated method stub
		return usersDao.updateState(userID, State);
	}

}
