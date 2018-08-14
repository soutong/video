package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.VideoInfos;

public interface VideoInfosService {
	public int add(VideoInfos videoInfos);
	public List<VideoInfos> findAll(int videoGroupID, String title);
	public List<VideoInfos> finadAll(int videoGroupID,String title,int userID);
	public VideoInfos findByID(int videoInfoID);
}
