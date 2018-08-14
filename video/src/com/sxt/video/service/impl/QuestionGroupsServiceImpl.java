package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.QuestionGroupsDao;
import com.sxt.video.dao.impl.QuestionGroupsDaoImpl;
import com.sxt.video.model.QuestionGroups;
import com.sxt.video.service.QuestionGroupsService;

public class QuestionGroupsServiceImpl implements QuestionGroupsService {

	private QuestionGroupsDao qgd=new QuestionGroupsDaoImpl();
	@Override
	public List<QuestionGroups> findAll() {
		// TODO Auto-generated method stub
		return qgd.findAll();
	}

	@Override
	public QuestionGroups findByID(int questionGroupID) {
		// TODO Auto-generated method stub
		return qgd.findByID(questionGroupID);
	}

}
