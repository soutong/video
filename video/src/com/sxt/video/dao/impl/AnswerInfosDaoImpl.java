package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.AnswerInfosDao;
import com.sxt.video.vo.AnswerInfosVo;

public class AnswerInfosDaoImpl extends BaseDao implements AnswerInfosDao {

	@Override
	public List<AnswerInfosVo> findByID(int questioninfosID) {
		String sql="SELECT questiongroups.`GroupName`,questioninfos.`Title`,questioninfos.`Contents`,users.`UserName`,users.`UserFace`,"
				+"teacherinfos.`TeacherName`,teacherinfos.`Gender`,teacherinfos.`Major`,answerinfos.`Contents` AS answercontents,answerinfos.`AddTime` "
				+"FROM questioninfos,questiongroups,users,teacherinfos,answerinfos "
				+"WHERE questioninfos.`QuestionInfoID`=answerinfos.`QuestionInfoID` "
				+"AND answerinfos.`UserID` = users.`UserID` "
				+"AND users.`UserID`=teacherinfos.`UserID`"
				+"AND questioninfos.`QuestionGroupID`=questiongroups.`QuestionGroupID`"+questioninfosID;
		
		List<AnswerInfosVo> list = new ArrayList<AnswerInfosVo>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				AnswerInfosVo av=new AnswerInfosVo();
				av.setAddTime(rs.getDate("addTime"));
				av.setAnswerContents(rs.getString("answerContents"));
				av.setContents(rs.getString("contents"));
				av.setGender(rs.getInt("gender"));
				av.setGroupName(rs.getString("groupName"));
				av.setMajor(rs.getString("major"));
				av.setTeacherName(rs.getString("teacherName"));
				av.setTitle(rs.getString("title"));
				av.setUserFace(rs.getString("userFace"));
				av.setUserName(rs.getString("userName"));
				list.add(av);
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
