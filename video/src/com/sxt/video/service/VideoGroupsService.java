package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.VideoGroups;
import com.sxt.video.vo.Pagenation;

public interface VideoGroupsService {
	public int add (VideoGroups videoGroups);
	public Pagenation findByName(int curPage,String groupName);
	public List<VideoGroups> findAll();
}
