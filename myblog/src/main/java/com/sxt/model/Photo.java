package com.sxt.model;

import java.sql.Date;

public class Photo {
	private int photoId;
	private String photoDesc;
	private String photoPath;
	private Date uploadTime;
	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
	public String getPhotoDesc() {
		return photoDesc;
	}
	public void setPhotoDesc(String photoDesc) {
		this.photoDesc = photoDesc;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	@Override
	public String toString() {
		return "Photo [photoId=" + photoId + ", photoDesc=" + photoDesc + ", photoPath=" + photoPath + "]";
	}
	
}
