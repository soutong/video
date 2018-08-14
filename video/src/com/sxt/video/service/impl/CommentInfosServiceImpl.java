package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.CommentInfosDao;
import com.sxt.video.dao.impl.CommentsInfosDaoImpl;
import com.sxt.video.model.CommentInfos;
import com.sxt.video.service.CommentInfosService;
import com.sxt.video.vo.CommentInfosVO;

public class CommentInfosServiceImpl implements CommentInfosService {

	private CommentInfosDao ci=new CommentsInfosDaoImpl();
	@Override
	public int add(CommentInfos commentInfos) {
		// TODO Auto-generated method stub
		return ci.add(commentInfos);
	}

	@Override
	public List<CommentInfosVO> findByVideoinfoID(int videoInfoID) {
		// TODO Auto-generated method stub
		return ci.findByVideoInfoID(videoInfoID);
	}

}
