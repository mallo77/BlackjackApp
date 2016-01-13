package org.mallo.blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilJUnitTest 
{
	@Test
	public void getFaceTest() {
		//A valid Face values: 
		//2, 3, 4, 5, 6, 7, 8, 9, 10, A, K, Q or J
		
		assertNotNull(Util.getFace("2"));
		assertNotNull(Util.getFace("3"));
		assertNotNull(Util.getFace("4"));
		assertNotNull(Util.getFace("5"));
		assertNotNull(Util.getFace("6"));
		assertNotNull(Util.getFace("7"));
		assertNotNull(Util.getFace("8"));
		assertNotNull(Util.getFace("9"));
		assertNotNull(Util.getFace("10"));
		assertNotNull(Util.getFace("A"));
		assertNotNull(Util.getFace("K"));
		assertNotNull(Util.getFace("Q"));
		assertNotNull(Util.getFace("J"));
		
		assertNotNull(Util.getFace("a"));
		assertNotNull(Util.getFace("k"));
		assertNotNull(Util.getFace("q"));
		assertNotNull(Util.getFace("j"));
		
		assertNull(Util.getFace("1"));
		assertNull(Util.getFace("0"));
		assertNull(Util.getFace("-1"));
		assertNull(Util.getFace("Z"));
	}
	
	
	@Test
	public void getSuitTest() {
		//A valid suit values:
		//S, C, D, H
		
		assertNotNull(Util.getSuit("S"));
		assertNotNull(Util.getSuit("C"));
		assertNotNull(Util.getSuit("D"));
		assertNotNull(Util.getSuit("S"));
		
		assertNotNull(Util.getSuit("s"));
		assertNotNull(Util.getSuit("c"));
		assertNotNull(Util.getSuit("d"));
		assertNotNull(Util.getSuit("s"));
		
		assertNull(Util.getSuit("X"));		
		assertNull(Util.getSuit("x"));		
		assertNull(Util.getSuit("0"));		
	}
}