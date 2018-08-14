package com.sxt.video.model;

import java.util.Date;

public class CommentInfos {
	private int commentInfoID;
	private int videoInfoId;
	private int userID;
	private String contents;
	private Date addTime;
	public int getCommentInfoID() {
		return commentInfoID;
	}
	public void setCommentInfoID(int commentInfoID) {
		this.commentInfoID = commentInfoID;
	}
	public int getVideoInfoId() {
		return videoInfoId;
	}
	public void setVideoInfoId(int videoInfoId) {
		this.videoInfoId = videoInfoId;
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
