package com.codeclan.al;

public abstract class User {

	private String name; 
	private String email;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getDetails(){
		String name = this.name;
		String email = this.email;
		return "Details{Name: "+name+", Email: "+email+"}";
	}
}
