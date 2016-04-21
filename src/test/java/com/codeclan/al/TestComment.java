package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;


public class TestComment {

	@Test
	public void testInitializedWithAuthor(){
		Comment comment = new Comment("Liz Mallabon");
		assertEquals("Liz Mallabon", comment.getAuthor());
	}
	
	@Test
	public void testAddText(){
		Comment comment = new Comment("Liz Mallabon");
		comment.setText("Used TDD to develop code, well done");
		assertEquals("Used TDD to develop code, well done", comment.getText());
	}
}
