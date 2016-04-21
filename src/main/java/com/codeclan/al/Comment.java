package com.codeclan.al;

public class Comment {

	private String author;
	private String text;
	
	public Comment(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
}
