package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.VideoInfos;

public interface VideoInfosDao {
	public int add(VideoInfos videoInfos);
	
	public List<VideoInfos> findAll(int videoGroupID,String groupName);

	public List <VideoInfos> findAll(int videoGroupID,String groupName,int userID);
	
	public VideoInfos findByID(int videoInfoID);
};
