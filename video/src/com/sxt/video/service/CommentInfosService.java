package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.CommentInfos;
import com.sxt.video.vo.CommentInfosVO;

public interface CommentInfosService {
	public int add(CommentInfos commentInfos);
	public List<CommentInfosVO> findByVideoinfoID(int videoInfoID);
}
