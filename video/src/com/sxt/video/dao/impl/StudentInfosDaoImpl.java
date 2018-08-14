package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.StudentInfosDao;
import com.sxt.video.model.StudentInfos;
import com.sxt.video.vo.Pagenation;


public class StudentInfosDaoImpl extends BaseDao implements StudentInfosDao {

	@Override
	public int add(StudentInfos studentInfos) {
		String sql="insert into studentInfos (UserID,StudentName,Gender,Birthday,Interests,QQ,MSN,Email,Academy,Major) values(?,?,?,?,?,?,?,?,?,?)";
		String arry[]={studentInfos.getUserID()+"",studentInfos.getStudentName(),studentInfos.getGender()+"",studentInfos.getBirthday(),studentInfos.getInterests(),studentInfos.getQq()+"",studentInfos.getMsn(),studentInfos.getEmail(),studentInfos.getAcademy(),studentInfos.getMajor()};
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<StudentInfos> finbyPagenation(int curPage) {
		List<StudentInfos> list=new ArrayList<StudentInfos>();
		int start=(curPage-1)*Pagenation.PAGESIZE;
		String sql="select * from studentinfos limit "+start+","+Pagenation.PAGESIZE;
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				StudentInfos si = new StudentInfos();
				si.setAcademy(rs.getString("academy"));
				si.setBirthday(rs.getString("birthday"));
				si.setEmail(rs.getString("email"));
				si.setGender(rs.getInt("gender"));
				si.setInterests(rs.getString("interests"));
				si.setMajor(rs.getString("major"));
				si.setMsn(rs.getString("msn"));
				si.setQq(rs.getInt("qq"));
				si.setStudentInfoID(rs.getInt("studentInfoID"));
				si.setStudentName(rs.getString("studentName"));
				si.setUserID(rs.getInt("userID"));
				list.add(si);
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
		String sql="select count(*) as totalRows from studentinfos";
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
