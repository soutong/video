package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.QuestionGroupsDao;
import com.sxt.video.model.QuestionGroups;

public class QuestionGroupsDaoImpl extends BaseDao implements QuestionGroupsDao {

	@Override
	public List<QuestionGroups> findAll() {
		String sql="select * from questiongroups ";
		List<QuestionGroups> list = new ArrayList<QuestionGroups>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				QuestionGroups qg = new QuestionGroups();
				qg.setGroupName(rs.getString("groupName"));
				qg.setAddTime(rs.getDate("addTime"));
				qg.setQuestionGroupID(rs.getInt("questionGroupID"));
				list.add(qg);
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
	public QuestionGroups findByID(int questionGroupID) {
		String sql="select * from questiongroups where questionGroupID="+questionGroupID;
		QuestionGroups qg=null;
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				qg=new QuestionGroups();
				qg.setQuestionGroupID(rs.getInt("questionGroupID"));
				qg.setAddTime(rs.getDate("addTime"));
				qg.setGroupName(rs.getString("groupName"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			this.closeAll();
		}
		return qg;
	}

}
