package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;


public class TestProject {

	@Test
	public void testSetName(){
		Project rubyProject = new Project();
		rubyProject.setName("Ruby Independent Project");
		assertEquals("Ruby Independent Project", rubyProject.getName());
	}
	
	@Test
	public void testSetSubmissionDate(){
		Project rubyProject = new Project();
		rubyProject.setSubmissionDate("27", "04", "2016");
		assertEquals("27/04/2016", rubyProject.getSubmissionDate());
	}
	
	@Test
	public void testSetGrade(){
		Project rubyProject = new Project();
		rubyProject.setGrade(23.98);
		assertEquals("F", rubyProject.getGrade());
	}
	
//	@Test//Instead of storing comments as author/comment in a HashMap: could create a comment object which has
//	//author and comment properties, attache Get and Set comment and author methods and then store these comment objects
//	//in an ArrayList collection in the Project class. Would then be able to go over the arraylist using a for loop instead of using iterators and
//	//sets. 
//	//Also, if you try to add a value to a HashMap which has the same key as a different value already in the HashMap
//	//, it will override the existing key/value pair, even though values are different.
//	public void testAddComment(){
//		Project rubyProject = new Project();
//		rubyProject.addComment("L.Mallabon", "A well constructed program with good use of TDD to develop code");
//		assertEquals("A well constructed program with good use of TDD to develop code", rubyProject.getAllComments());
//	}
}








