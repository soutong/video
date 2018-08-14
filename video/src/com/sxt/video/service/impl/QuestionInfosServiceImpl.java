package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.QuestionInfosDao;
import com.sxt.video.dao.impl.QuestionInfosDaoImpl;
import com.sxt.video.model.QuestionInfos;
import com.sxt.video.service.QuestionInfosService;

public class QuestionInfosServiceImpl implements QuestionInfosService {
	
	private QuestionInfosDao qid=new QuestionInfosDaoImpl();
	@Override
	public List<QuestionInfos> findByID(int questionGroupID) {
		// TODO Auto-generated method stub
		return qid.findByID(questionGroupID);
	}

}
