package com.sxt.video.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.video.dao.VideoGroupsDao;
import com.sxt.video.model.VideoGroups;
import com.sxt.video.vo.Pagenation;

public class VideoGroupsDaoImpl extends BaseDao implements VideoGroupsDao {

	@Override
	public int add(VideoGroups videoGroups) {
		String sql="insert into videogroups (GroupName,AddTime)values(?,now())";
		String arry[]={videoGroups.getGroupName()};
		
		return this.excuteUpdate(sql, arry);
	}

	@Override
	public List<VideoGroups> findByName(int curPage,String groupName) {
		int start=0;
		if(curPage>0){
			start=(curPage-1)*Pagenation.PAGESIZE;
		}
		String sql;
		if(groupName!=null&&!groupName.equals("")){
			sql="SELECT * FROM videogroups  WHERE groupName LIKE '%"+groupName+"%' LIMIT "+start+","+Pagenation.PAGESIZE;
		}else{
			sql="SELECT * FROM videogroups   LIMIT "+start+","+Pagenation.PAGESIZE;
		}
		List<VideoGroups> list=new ArrayList<VideoGroups>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				VideoGroups vg=new VideoGroups();
				vg.setVideoGroupID(rs.getInt("videoGroupID"));
				vg.setGroupName(rs.getString("groupName"));
				vg.setAddTime(rs.getDate("addTime"));
				list.add(vg);
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
	public long findTotalRows(String groupName) {
		String sql="select count(*) as totalRows from videoGroups ";
		if(groupName!=null&&!groupName.equals("")){
			sql+="where groupName like '%"+groupName+"%'";
		}
		int totalRows=0;
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				 totalRows = rs.getInt("totalRows");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return totalRows;
	}

	@Override
	public List<VideoGroups> findAll() {
		String sql="select * from videogroups ";
		List<VideoGroups> list = new ArrayList<VideoGroups>();
		ResultSet rs = this.excuteQuery(sql, null);
		try {
			while(rs.next()){
				VideoGroups vg=new VideoGroups();
				vg.setVideoGroupID(rs.getInt("videoGroupID"));
				vg.setGroupName(rs.getString("groupName"));
				vg.setAddTime(rs.getDate("addTime"));
				list.add(vg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return list;
	}

	}


