package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.QuestionInfos;

public interface QuestionInfosService {
	public List<QuestionInfos> findByID(int questionGroupID);

}
