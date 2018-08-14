package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.VideoGroupsDao;
import com.sxt.video.dao.impl.VideoGroupsDaoImpl;
import com.sxt.video.model.VideoGroups;
import com.sxt.video.service.VideoGroupsService;
import com.sxt.video.vo.Pagenation;

public class VideoGroupsServiceImpl implements VideoGroupsService {
	private VideoGroupsDao vid=new VideoGroupsDaoImpl();
	@Override
	public int add(VideoGroups videoGroups) {
		// TODO Auto-generated method stub
		return vid.add(videoGroups);
	}

	@Override
	public Pagenation findByName(int curPage, String groupName) {
		Pagenation pg = new Pagenation();
		int totalRows = (int)vid.findTotalRows(groupName);
		int totalPages=1;
		if(totalRows!=0){
			 totalPages=totalRows%pg.PAGESIZE==0?totalRows/pg.PAGESIZE:totalRows/pg.PAGESIZE+1;
		}
		List<VideoGroups> list = vid.findByName(curPage, groupName);
		pg.setList(list);
		pg.setCurPage(curPage);
		pg.setTotalPages(totalPages);
		pg.setTotalRows(totalRows);
		
		
		return pg;
	}

	@Override
	public List<VideoGroups> findAll() {
		// TODO Auto-generated method stub
		return vid.findAll();
	}

}
