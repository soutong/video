package com.sxt.service;

import java.util.List;

import com.sxt.mapper.ArticleMapper;
import com.sxt.model.Article;

public interface ArticleService {
	public int add(Article article);
	public int delete(int articleId);
	public ArticleMapper  finById(int articleId);
	public int update(Article article);
	public List<Article> findAll();
	public List<Article> findByType(int typeId);
}
