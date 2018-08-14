package com.sxt.model;

public class Friend {
	private int friendId;
	private String friendName;
	private String friendSex;
	private String qq;
	private String blog;
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getFriendSex() {
		return friendSex;
	}
	public void setFriendSex(String friendSex) {
		this.friendSex = friendSex;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", friendName=" + friendName + ", friendSex=" + friendSex + ", qq=" + qq
				+ ", blog=" + blog + "]";
	}
	
}
