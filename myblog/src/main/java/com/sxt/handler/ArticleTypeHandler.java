package com.sxt.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.model.ArticleType;
import com.sxt.service.ArticleTypeService;

@Controller
@RequestMapping("articleType")
public class ArticleTypeHandler {
	@Autowired
	private  ArticleTypeService articleService;
	@RequestMapping("/list")
	public String list(Model model){
		List<ArticleType> articleTypeList = articleService.findAll();
		model.addAttribute("articleTypeList", articleTypeList);
		return "type_list";
	}
	@RequestMapping("/add")
	public String add(ArticleType articleType){
		int count = articleService.add(articleType);
		if(count >0){
			return "redirect:list.action";
		}
		return "error";
	}
	@RequestMapping("/delete")
	public String delete(int typeId){
		int count = articleService.delete(typeId);
		if(count >0){
			return "redirect:list.action";
		}
		return "error";
	}
	@RequestMapping("/update")
	public String update (ArticleType articleType){
		int count = articleService.update(articleType);
		if(count >0){
			return "redirect:list.action";
		}
		return "error";
	}
	@RequestMapping("/detail")
	public String detail(int typeId,Model model){
		ArticleType articleType = articleService.findById(typeId);
		if(articleType!=null){
			model.addAttribute("articleType", articleType);
			return "articleTypeUpdate";
		}
		return "error";
	}
}
