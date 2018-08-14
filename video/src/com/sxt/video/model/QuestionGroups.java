package com.sxt.video.model;

import java.util.Date;

public class QuestionGroups {
	private int questionGroupID;
	private String groupName;
	private Date addTime;
	public int getQuestionGroupID() {
		return questionGroupID;
	}
	public void setQuestionGroupID(int questionGroupID) {
		this.questionGroupID = questionGroupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
}
