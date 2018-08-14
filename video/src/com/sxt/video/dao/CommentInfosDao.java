package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.CommentInfos;
import com.sxt.video.vo.CommentInfosVO;

public interface CommentInfosDao {
	public int add(CommentInfos commentInfos);
	public List<CommentInfosVO> findByVideoInfoID(int videoInfoID);
}
