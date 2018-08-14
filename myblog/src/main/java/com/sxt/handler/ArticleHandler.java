package com.sxt.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.mapper.ArticleMapper;
import com.sxt.model.Article;
import com.sxt.model.ArticleType;
import com.sxt.service.ArticleService;
import com.sxt.service.ArticleTypeService;

@Controller
@RequestMapping("/article")
public class ArticleHandler {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ArticleTypeService articleTypeService;
	@RequestMapping("/articleTypeList")
	public String list(Model model){
		List<ArticleType> articleTypeList = articleTypeService.findAll();
		model.addAttribute("articleTypeList", articleTypeList);
		return "article_add";
}
	@RequestMapping("/add")
	public String add(Article article){
		int count = articleService.add(article);
		if(count>0){
			return "redirect:/article/list.action?typeId=0";
		}
		return "error";
	}
	@RequestMapping("/list")
	public String findAll(Model model,int typeId){
		List<Article> articleList = articleService.findByType(typeId);
		model.addAttribute("articleList",articleList);
		return "article_list";
	}
}
