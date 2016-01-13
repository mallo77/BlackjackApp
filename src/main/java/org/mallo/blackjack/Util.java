package org.mallo.blackjack;


/**
 * Summary:
 * 	
 * This class will contains common utilities used by Blackjack application
 * 
 * @author Mathius Girik Allo
 */
public class Util
{
	/**
	 * This util method will be used to return an instance of Face for the specified value.
	 * 
	 * A null will be return if the specified input is not a valid face value. 
	 * 
	 * @param value
	 * @return
	 */
	public static Face getFace(String value) {
		
		for ( Face face : Face.values() ) {
			
			//ignore case
			if ( face.getSymbol().equalsIgnoreCase(value) ) {
				return face;
			}
		}
		
		return null;
	}
	
	
	
	/**
	 * This util method will be used to return an instance of Suit for the specified input.
	 * 
	 * A null will be returned if the specified input is not a valid suit.
	 * 
	 * @param input
	 * @return
	 */
	public static Suit getSuit(String input) {
		
		for ( Suit suit : Suit.values() ) {
			
			//ignore case
			if ( suit.getSymbol().equalsIgnoreCase(input) ) {
				return suit;
			}
		}
		
		return null;
	}
}
