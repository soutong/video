package com.sxt.video.service;

import java.util.List;

import com.sxt.video.vo.AnswerInfosVo;

public interface AnswerInfosService {
	public List<AnswerInfosVo> findByID(int questioninfosID);
}
