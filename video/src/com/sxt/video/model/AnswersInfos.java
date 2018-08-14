package com.sxt.video.model;

import java.util.Date;

public class AnswersInfos {
	private int answerInfoID;
	private int questionInfoID;
	private int userID;
	private String contents;
	private Date addTime;
	public int getAnswerInfoID() {
		return answerInfoID;
	}
	public void setAnswerInfoID(int answerInfoID) {
		this.answerInfoID = answerInfoID;
	}
	public int getQuestionInfoID() {
		return questionInfoID;
	}
	public void setQuestionInfoID(int questionInfoID) {
		this.questionInfoID = questionInfoID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	
}
