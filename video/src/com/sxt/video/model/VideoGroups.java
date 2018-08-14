package com.sxt.video.model;

import java.io.Serializable;
import java.util.Date;

public class VideoGroups implements Serializable{
private int videoGroupID;
private String groupName;
private Date addTime;
public int getVideoGroupID() {
	return videoGroupID;
}
public void setVideoGroupID(int videoGroupID) {
	this.videoGroupID = videoGroupID;
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
