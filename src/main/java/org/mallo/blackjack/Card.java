package org.mallo.blackjack;

/**
 * Summary:
 * 
 * This class represents Card in Blackjack application
 * 
 * @author Mathius Girik Allo
 */
public class Card
{
	private Suit suit;
	private Face face;
	
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}
	
	public int getValue() {
		return face.getValue();
	}
	
	public String getSuit() {
		return suit.getSymbol();
	}
}
