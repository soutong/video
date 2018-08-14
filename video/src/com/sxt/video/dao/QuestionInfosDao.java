package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.QuestionInfos;

public interface QuestionInfosDao {
	public List<QuestionInfos> findByID(int questionGroupID);
}
