package com.codeclan.al;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Project {

	private String name;
	private String submissionDate;
	private String grade;
	private HashMap comments;
	
	
	public Project(){
		HashMap comments = new HashMap(10);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSubmissionDate(String day, String month, String year){
		String date = day + "/" + month + "/" + year;
		submissionDate = date;
	}
	
	public String getSubmissionDate(){
		return submissionDate;
	}
	//if this setGrade is public, this will mean students will be able to setGrade. How to guard
	//against this?
	public void setGrade(double score){
	  if(score<=100 && score>=90){
		  grade = "A+";
	  }
	  else if (score<=89 && score>=80){
		  grade = "A";
	  }
	  else if (score<=79 && score>=75){
		  grade = "B+";
	  }
	  else if (score<=74 && score>=70){
		  grade = "B";
	  }
	  else if (score<=69 && score>=60){
		  grade = "C";
	  }
	  else if (score<=59 && score>=0){
		  grade = "F";
	  }
			
	}
	
	public String getGrade(){
		return grade;
	}
	
//	public void addComment(String author, String comment){
//		comments.put(author, comment);
//	}
	
//	public String getAllComments(){
//		Set allCommentsAndAuthors = comments.entrySet();
//		Iterator i = allCommentsAndAuthors.iterator();
//		
//		while(i.hasNext()){
//			Map.Entry me = (Map.Entry)i.next();
//		}
//	}
	
}







