package com.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxt.mapper.ArticleTypeMapper;
import com.sxt.model.ArticleType;
import com.sxt.service.ArticleTypeService;
@Service("articleTypeService")
public class ArticleTypeServiceImpl implements ArticleTypeService {
	@Autowired
	private ArticleTypeMapper articleTypeMapper;
	public int add(ArticleType articleType) {
		// TODO Auto-generated method stub
		return  articleTypeMapper.add(articleType);
	}

	public int delete(int typeId) {
		// TODO Auto-generated method stub
		return  articleTypeMapper.delete(typeId);
	}

	public int update(ArticleType articleType) {
		// TODO Auto-generated method stub
		return  articleTypeMapper.update(articleType);
	}

	public ArticleType findById(int typeId) {
		// TODO Auto-generated method stub
		return  articleTypeMapper.findById(typeId);
	}

	public List<ArticleType> findAll() {
		// TODO Auto-generated method stub
		return  articleTypeMapper.findAll();
	}
}
