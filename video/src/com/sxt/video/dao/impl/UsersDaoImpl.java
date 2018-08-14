package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.UsersDao;
import com.sxt.video.model.Users;

public class UsersDaoImpl  extends BaseDao implements UsersDao {

	@Override
	public Users login(String userName, String userPwd) {
		String sql="select * from users where UserName=? and UserPwd=?";
		String arry[]={userName,userPwd};
		ResultSet rs = this.excuteQuery(sql, arry);
		Users user=new Users();
		try {
			while(rs.next()){
				user.setUserID(rs.getInt("userID"));
				user.setUserName(rs.getString("userName"));
				user.setUserPwd(rs.getString("userPwd"));
				user.setUserFace(rs.getString("userFace"));
				user.setPwdQuestion(rs.getString("pwdQuestion"));
				user.setQuestionAnswer(rs.getString("questionAnswer"));
				user.setUserGroup(rs.getInt("userGroup"));
				user.setState(rs.getInt("state"));
				user.setScores(rs.getInt("scores"));
				user.setAddTime(rs.getDate("addTime"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		
		return user;
	}

	@Override
	public int add(Users user) {
		String sql="insert users (UserName,UserPwd,UserFace,PwdQuestion,QuestionAnswer,UserGroup,State,Scores,AddTime) values(?,?,?,?,?,?,1,0,NOW())";
		String arry[]={user.getUserName(),user.getUserPwd(),user.getUserFace(),user.getPwdQuestion(),user.getQuestionAnswer(),user.getUserGroup()+""};
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<Users> findAll() {
		String sql="select * from users";
		List<Users> list=new ArrayList<Users>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				Users user = new Users();
				user.setUserID(rs.getInt("userID"));
				user.setUserName(rs.getString("userName"));
				user.setUserPwd(rs.getString("userPwd"));
				user.setUserFace(rs.getString("userFace"));
				user.setPwdQuestion(rs.getString("pwdQuestion"));
				user.setQuestionAnswer(rs.getString("questionAnswer"));
				user.setUserGroup(rs.getInt("userGroup"));
				user.setState(rs.getInt("state"));
				user.setScores(rs.getInt("scores"));
				user.setAddTime(rs.getDate("addTime"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			this.closeAll();
		}
		return list;
	}

	@Override
	public int updateState(int userID, int State) {
		String sql="update users set State=? where userID=?";
		String arry[]={State+"",userID+""};
		return this.excuteUpdate(sql, arry);
		
	}

}
