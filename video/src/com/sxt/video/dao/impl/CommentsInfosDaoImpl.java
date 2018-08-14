package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.CommentInfosDao;
import com.sxt.video.model.CommentInfos;
import com.sxt.video.vo.CommentInfosVO;

public class CommentsInfosDaoImpl extends BaseDao implements CommentInfosDao {

	@Override
	public int add(CommentInfos commentInfos) {
		String sql="insert into commentinfos (videoInfoID,userID,contents,addTime) values(?,?,?,now())";
		String arry[]={commentInfos.getVideoInfoId()+"",commentInfos.getUserID()+"",commentInfos.getContents()};
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<CommentInfosVO> findByVideoInfoID(int videoInfoID) {
		String sql="SELECT users.`UserID`, users.`UserFace`,studentinfos.`StudentName`,studentinfos.`Gender`,studentinfos.`Academy`,commentinfos.`Contents`,commentinfos.`AddTime` FROM  users, commentinfos, studentinfos WHERE users.`UserID`=studentinfos.`UserID` AND users.`UserID`=commentinfos.`UserID`  AND  commentinfos.`VideoInfoID`="+videoInfoID;
		ArrayList<CommentInfosVO> list=new ArrayList<CommentInfosVO>();
		ResultSet rs = this.excuteQuery(sql, null);
		
		try {
			while(rs.next()){
				CommentInfosVO cv=new CommentInfosVO();
				cv.setUserFace(rs.getString("userFace"));
				cv.setAcademy(rs.getString("academy"));
				cv.setAddTime(rs.getDate("addTime"));
				cv.setContents(rs.getString("contents"));
				cv.setGender(rs.getInt("gender"));
				cv.setStudentName(rs.getString("studentName"));
				cv.setUserID(rs.getInt("userID"));
				list.add(cv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	


}
