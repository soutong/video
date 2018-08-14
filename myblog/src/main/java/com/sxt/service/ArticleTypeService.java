package com.sxt.service;

import java.util.List;

import com.sxt.model.ArticleType;

public interface ArticleTypeService {
	public int add(ArticleType articleType);
	public int delete(int typeId);
	public int update(ArticleType articleType);
	public ArticleType findById(int typeId);
	public List<ArticleType> findAll();
}
