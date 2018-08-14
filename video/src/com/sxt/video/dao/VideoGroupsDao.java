package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.VideoGroups;

public interface VideoGroupsDao {
	public int add (VideoGroups videoGroups);
	public List<VideoGroups> findByName(int curPage,String groupName);
	public long findTotalRows(String groupName);
	public List<VideoGroups>  findAll();
}
