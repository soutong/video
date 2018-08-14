package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.vo.AnswerInfosVo;

public interface AnswerInfosDao {
	public List<AnswerInfosVo> findByID(int questioninfosID);
}
