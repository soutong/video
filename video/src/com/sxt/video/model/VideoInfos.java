package com.sxt.video.model;

import java.util.Date;

public class VideoInfos {
	private int videoInfoID;
	private int videoGroupID;
	private int userID;
	private String title;
	private String videoImage;
	private double duration;
	private String videoPath;
	private String description;
	private Date addTime;
	private int isDeleted;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	private String tag1;
	private String tag2;
	private String tag3;
	private String tag4;
	private String tag5;
	public int getVideoInfoID() {
		return videoInfoID;
	}
	public void setVideoInfoID(int videoInfoID) {
		this.videoInfoID = videoInfoID;
	}
	public int getVideoGroupID() {
		return videoGroupID;
	}
	public void setVideoGroupID(int videoGroupID) {
		this.videoGroupID = videoGroupID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	public String getVideoImage() {
		return videoImage;
	}
	public void setVideoImage(String videoImage) {
		this.videoImage = videoImage;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
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
	public VideoInfos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VideoInfos(int videoGroupID, int userID, String title, String videoImage, double duration, String videoPath,
			String description, String tag1, String tag2, String tag3, String tag4, String tag5) {
		super();
		this.videoGroupID = videoGroupID;
		this.userID = userID;
		this.title = title;
		this.videoImage = videoImage;
		this.duration = duration;
		this.videoPath = videoPath;
		this.description = description;
		this.tag1 = tag1;
		this.tag2 = tag2;
		this.tag3 = tag3;
		this.tag4 = tag4;
		this.tag5 = tag5;
	}
	
	
}
