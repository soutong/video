package com.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxt.mapper.ArticleMapper;
import com.sxt.model.Article;
import com.sxt.model.ArticleType;
import com.sxt.service.ArticleService;
@Service(value="articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	public int add(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.add(article);
	}

	public int delete(int articleId) {
		// TODO Auto-generated method stub
		return articleMapper.delete(articleId);
	}

	public ArticleMapper finById(int articleId) {
		// TODO Auto-generated method stub
		return articleMapper.finById(articleId);
	}

	public int update(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.update(article);
	}

	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return articleMapper.findAll();
	}

	public List<Article> findByType(int typeId) {
		// TODO Auto-generated method stub
		return articleMapper.findByType(typeId);
	}
}
