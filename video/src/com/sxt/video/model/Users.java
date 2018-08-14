package com.sxt.video.model;

import java.util.Date;

public class Users {
private int userID;
private String userName;
private String userPwd;
private String userFace;
private String pwdQuestion;
private String questionAnswer;
private int userGroup;
private int state;
private int scores;
private Date addTime;
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
@Override
public String toString() {
	return "Users [userID=" + userID + ", userName=" + userName + ", userPwd=" + userPwd + ", userFace=" + userFace
			+ ", pwdQuestion=" + pwdQuestion + ", questionAnswer=" + questionAnswer + ", userGroup=" + userGroup
			+ ", state=" + state + ", scores=" + scores + ", addTime=" + addTime + "]";
}
public String getUserFace() {
	return userFace;
}
public void setUserFace(String userFace) {
	this.userFace = userFace;
}
public String getPwdQuestion() {
	return pwdQuestion;
}
public void setPwdQuestion(String pwdQuestion) {
	this.pwdQuestion = pwdQuestion;
}
public String getQuestionAnswer() {
	return questionAnswer;
}
public void setQuestionAnswer(String questionAnswer) {
	this.questionAnswer = questionAnswer;
}
public int getUserGroup() {
	return userGroup;
}
public void setUserGroup(int userGroup) {
	this.userGroup = userGroup;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public int getScores() {
	return scores;
}
public void setScores(int scores) {
	this.scores = scores;
}
public Date getAddTime() {
	return addTime;
}
public void setAddTime(Date addTime) {
	this.addTime = addTime;
}

}
