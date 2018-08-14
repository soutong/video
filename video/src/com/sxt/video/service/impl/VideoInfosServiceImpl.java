package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.VideoInfosDao;
import com.sxt.video.dao.impl.VideoInfosDaoImpl;
import com.sxt.video.model.VideoInfos;
import com.sxt.video.service.VideoInfosService;

public class VideoInfosServiceImpl implements VideoInfosService {
	private VideoInfosDao vid=new VideoInfosDaoImpl();
	@Override
	public int add(VideoInfos videoInfos) {
		// TODO Auto-generated method stub
		return vid.add(videoInfos);
	}

	@Override
	public List<VideoInfos> findAll(int videoGroupID, String groupName) {
		// TODO Auto-generated method stub
		return vid.findAll(videoGroupID, groupName);
	}

	@Override
	public List<VideoInfos> finadAll(int videoGroupID, String title, int userID) {
		// TODO Auto-generated method stub
		return vid.findAll(videoGroupID, title, userID);
	}

	@Override
	public VideoInfos findByID(int videoInfoID) {
		// TODO Auto-generated method stub
		return vid.findByID(videoInfoID);
	}

}
