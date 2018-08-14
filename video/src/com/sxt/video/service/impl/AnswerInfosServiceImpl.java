package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.AnswerInfosDao;
import com.sxt.video.dao.impl.AnswerInfosDaoImpl;
import com.sxt.video.service.AnswerInfosService;
import com.sxt.video.vo.AnswerInfosVo;

public class AnswerInfosServiceImpl implements AnswerInfosService {
	
	private AnswerInfosDao aid=new AnswerInfosDaoImpl();
	@Override
	public List<AnswerInfosVo> findByID(int questioninfosID) {
		// TODO Auto-generated method stub
		return aid.findByID(questioninfosID);
	}

}
