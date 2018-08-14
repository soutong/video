package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.QuestionGroups;

public interface QuestionGroupsDao {
	public List<QuestionGroups> findAll();
	public QuestionGroups findByID(int questionGroupID);
}
