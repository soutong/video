package com.sxt.model;

import java.sql.Date;

public class MessageInfo {
	private int messageId;
	private String autor;
	private String messageContent;
	private Date messageTime;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Date getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}
	@Override
	public String toString() {
		return "MessageInfo [messageId=" + messageId + ", autor=" + autor + ", messageContent=" + messageContent
				+ ", messageTime=" + messageTime + "]";
	}
	
}
