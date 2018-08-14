package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.QuestionInfosDao;
import com.sxt.video.model.QuestionInfos;

public class QuestionInfosDaoImpl extends BaseDao implements QuestionInfosDao {

	@Override
	public List<QuestionInfos> findByID(int questionGroupID) {
		String sql="select * from questioninfos where questiongroupID="+questionGroupID;
		List<QuestionInfos> list =new ArrayList<QuestionInfos>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				QuestionInfos qi = new QuestionInfos ();
				qi.setAddTime(rs.getDate("addTime"));
				qi.setContents(rs.getString("contents"));
				qi.setIsDeleted(rs.getInt("isDeleted"));
				qi.setQuestionGroupID(rs.getInt("questionGroupID"));
				qi.setQuestionInfoID(rs.getInt("questionInfoID"));
				qi.setTag1(rs.getString("tag1"));
				qi.setTag2(rs.getString("tag2"));
				qi.setTag3(rs.getString("tag3"));
				qi.setTag4(rs.getString("tag4"));
				qi.setTag5(rs.getString("tag5"));
				qi.setTitle(rs.getString("title"));
				qi.setUserID(rs.getInt("userID"));
				list.add(qi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			this.closeAll();
		}
		return list;
	}

}
