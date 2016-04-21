package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {

	@Test
	public void setStudentName(){
		User jBloggs = new Student();
		jBloggs.setName("Joe Bloggs");
		assertEquals("Joe Bloggs", jBloggs.getName() );
	}
	
	@Test
	public void setTutorName(){
		User tutor = new Tutor();
		tutor.setName("Liz Mallabon");
		assertEquals("Liz Mallabon", tutor.getName());
	}
	
	@Test 
	public void setChildOfUserEmail(){
		User tutor = new Tutor();
		tutor.setEmail("l.mallabon@traininglab.edu.uk");
		assertEquals("l.mallabon@traininglab.edu.uk", tutor.getEmail());
	}
	
	@Test
	public void printChildOfUserDetails(){
		User student = new Student();
		student.setName("Jenny Hicks");
		student.setEmail("j.hicks@hotmail.com");
		assertEquals("Details{Name: Jenny Hicks, Email: j.hicks@hotmail.com}", student.getDetails() );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
