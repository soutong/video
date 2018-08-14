package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.VideoInfosDao;
import com.sxt.video.model.VideoInfos;

public class VideoInfosDaoImpl  extends BaseDao implements VideoInfosDao {

	@Override
	public int add(VideoInfos videoInfos) {
		String sql="insert into videoinfos (VideoGroupID,UserID,Title,VideoImage,Duration,VideoPath,Description,AddTime,IsDeleted,Tag1,Tag2,Tag3,Tag4,Tag5)values(?,?,?,?,?,?,?,now(),0,?,?,?,?,?)";
		String arry[]={videoInfos.getVideoGroupID()+"",videoInfos.getUserID()+"",videoInfos.getTitle(),videoInfos.getVideoImage(),videoInfos.getDuration()+"",videoInfos.getVideoPath(),videoInfos.getDescription(),videoInfos.getTag1(),videoInfos.getTag2(),videoInfos.getTag3(),videoInfos.getTag4(),videoInfos.getTag5()};
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<VideoInfos> findAll(int videoGroupID, String groupName) {
		String sql="select * from videoInfos where 1=1";
		if(videoGroupID!=0){
			sql+="and videoGroupID ="+videoGroupID;
		}
		if(groupName!=null&&!"".equals(groupName)){
			sql+="and groupName like '%"+groupName+"%'";
		}
		ResultSet rs = this.excuteQuery(sql, null);
		List<VideoInfos> list = new ArrayList<VideoInfos>();
		try {
			while (rs.next()){
				VideoInfos vi = new VideoInfos();
				vi.setAddTime(rs.getDate("addTime"));
				vi.setDescription(rs.getString("description"));
				vi.setDuration(rs.getDouble("duration"));
				vi.setIsDeleted(rs.getInt("isDeleted"));
				vi.setTag1(rs.getString("tag1"));
				vi.setTag1(rs.getString("tag2"));
				vi.setTag1(rs.getString("tag3"));
				vi.setTag1(rs.getString("tag4"));
				vi.setTag1(rs.getString("tag5"));
				vi.setTitle(rs.getString("title"));
				vi.setUserID(rs.getInt("userID"));
				vi.setVideoGroupID(rs.getInt("videoGroupID"));
				vi.setVideoImage(rs.getString("videoImage"));
				vi.setVideoInfoID(rs.getInt("videoInfoID"));
				vi.setVideoPath(rs.getString("videoPath"));
				list.add(vi);
				
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
	public List<VideoInfos> findAll(int videoGroupID, String title, int userID) {
		String sql="select * from videoInfos where 1=1 and userID="+userID;
		if(videoGroupID!=0){
			sql+=" and videoGroupID ="+videoGroupID;
		}
		if(title!=null&&!"".equals(title)){
			sql+=" and title like '%"+title+"%'";
		}
		ResultSet rs = this.excuteQuery(sql, null);
		List<VideoInfos> list = new ArrayList<VideoInfos>();
		try {
			while (rs.next()){
				VideoInfos vi = new VideoInfos();
				vi.setAddTime(rs.getDate("addTime"));
				vi.setDescription(rs.getString("description"));
				vi.setDuration(rs.getDouble("duration"));
				vi.setIsDeleted(rs.getInt("isDeleted"));
				vi.setTag1(rs.getString("tag1"));
				vi.setTag1(rs.getString("tag2"));
				vi.setTag1(rs.getString("tag3"));
				vi.setTag1(rs.getString("tag4"));
				vi.setTag1(rs.getString("tag5"));
				vi.setTitle(rs.getString("title"));
				vi.setUserID(rs.getInt("userID"));
				vi.setVideoGroupID(rs.getInt("videoGroupID"));
				vi.setVideoImage(rs.getString("videoImage"));
				vi.setVideoInfoID(rs.getInt("videoInfoID"));
				vi.setVideoPath(rs.getString("videoPath"));
				list.add(vi);
				
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
	public VideoInfos findByID(int videoInfoID) {
		String sql="select * from videoInfos where 1=1 and videoInfoID="+videoInfoID;
		
		ResultSet rs = this.excuteQuery(sql, null);
		VideoInfos vi=null;
		try {
			while (rs.next()){
				vi = new VideoInfos();
				vi.setAddTime(rs.getDate("addTime"));
				vi.setDescription(rs.getString("description"));
				vi.setDuration(rs.getDouble("duration"));
				vi.setIsDeleted(rs.getInt("isDeleted"));
				vi.setTag1(rs.getString("tag1"));
				vi.setTag1(rs.getString("tag2"));
				vi.setTag1(rs.getString("tag3"));
				vi.setTag1(rs.getString("tag4"));
				vi.setTag1(rs.getString("tag5"));
				vi.setTitle(rs.getString("title"));
				vi.setUserID(rs.getInt("userID"));
				vi.setVideoGroupID(rs.getInt("videoGroupID"));
				vi.setVideoImage(rs.getString("videoImage"));
				vi.setVideoInfoID(rs.getInt("videoInfoID"));
				vi.setVideoPath(rs.getString("videoPath"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return vi;
	}

}
