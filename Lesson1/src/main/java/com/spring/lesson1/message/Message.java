package com.spring.lesson1.message;

public class Message {
	private String description;
	private String content;
	
	public Message(String description, String content) {
		this.description = description;
		this.content = content;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
