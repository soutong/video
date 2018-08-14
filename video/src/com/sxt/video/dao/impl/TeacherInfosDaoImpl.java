package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.TeacherInfosDao;
import com.sxt.video.model.TeacherInfos;
import com.sxt.video.vo.Pagenation;


public class TeacherInfosDaoImpl extends BaseDao implements TeacherInfosDao {

	@Override
	public int add(TeacherInfos teacherInfos) {
		String sql="insert into teacherinfos (UserID,TeacherName,Gender,Birthday,Email,Major,JobTitle) values(?,?,?,?,?,?,?)";
		String arry[]={teacherInfos.getUserID()+"",teacherInfos.getTeacherName(),teacherInfos.getGender()+"",teacherInfos.getBirthday(),teacherInfos.getEmail(),teacherInfos.getMajor(),teacherInfos.getJobTitle()};
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<TeacherInfos> finbyPagenation(int curPage) {
		List<TeacherInfos> list=new ArrayList<TeacherInfos>();
		int start=(curPage-1)*Pagenation.PAGESIZE;
		String sql="select * from teacherinfos limit "+start+","+Pagenation.PAGESIZE;
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				TeacherInfos ti = new TeacherInfos();
				ti.setTeacherInfoID(rs.getInt("teacherInfoID"));
				ti.setUserID(rs.getInt("userID"));
				ti.setTeacherName(rs.getString("teacherName"));
				ti.setGender(rs.getInt("gender"));
				ti.setBirthday(rs.getString("birthday"));
				ti.setEmail(rs.getString("email"));
				ti.setMajor(rs.getString("major"));
				ti.setJobTitle(rs.getString("jobTitle"));
				list.add(ti);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return list;
	}

	@Override
	public long findTotalRows() {
		String sql="select count(*) as totalRows from teacherinfos";
		ResultSet rs = this.excuteQuery(sql, null);
		long totalRows=0;
		try {
			while(rs.next()){
				 totalRows=rs.getInt("totalRows");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return totalRows;
	}

}
