package com.sxt.video.model;

import java.util.Date;

public class QuestionInfos {
	private int questionInfoID;
	private int questionGroupID;
	private int userID;
	private String title;
	private String contents;
	private Date addTime;
	private int isDeleted;
	private String tag1;
	private String tag2;
	private String tag3;
	private String tag4;
	private String tag5;
	public int getQuestionInfoID() {
		return questionInfoID;
	}
	public void setQuestionInfoID(int questionInfoID) {
		this.questionInfoID = questionInfoID;
	}
	public int getQuestionGroupID() {
		return questionGroupID;
	}
	public void setQuestionGroupID(int questionGroupID) {
		this.questionGroupID = questionGroupID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getTag1() {
		return tag1;
	}
	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}
	public String getTag2() {
		return tag2;
	}
	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}
	public String getTag3() {
		return tag3;
	}
	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}
	public String getTag4() {
		return tag4;
	}
	public void setTag4(String tag4) {
		this.tag4 = tag4;
	}
	public String getTag5() {
		return tag5;
	}
	public void setTag5(String tag5) {
		this.tag5 = tag5;
	}
	
}
