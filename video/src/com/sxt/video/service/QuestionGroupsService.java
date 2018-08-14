package com.sxt.video.service;

import java.util.List;

import com.sxt.video.model.QuestionGroups;

public interface QuestionGroupsService {
	public List<QuestionGroups> findAll();
	public QuestionGroups findByID(int questionGroupID);
}
