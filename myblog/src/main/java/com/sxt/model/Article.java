package com.sxt.model;

public class Article {
	private int articleId;
	private String articleTitle;
	private String articleFrom;
	private String articleDesc;
	private String articleContent;
	private int typeId;
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleFrom() {
		return articleFrom;
	}
	public void setArticleFrom(String articleFrom) {
		this.articleFrom = articleFrom;
	}
	public String getArticleDesc() {
		return articleDesc;
	}
	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleFrom=" + articleFrom
				+ ", articleDesc=" + articleDesc + ", articleContent=" + articleContent + ", typeId=" + typeId + "]";
	}
	
	
}
