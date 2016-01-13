package org.mallo.blackjack;

/**
 * Summary:
 * 
 * This enum is used to represent a valid suit in Blackjack application
 * 
 * @author Mathius Girik Allo
 */
public enum Suit 
{
	SPADE("S", "Spades"),
	CLUB("C", "Clubs"),
	DIAMOND("D", "Diamonds"),
	HEART("H", "Hearts");
	
	Suit(String symbol, String name)
	{
		this.symbol = symbol;
		this.name   = name;
	}
	
	private final String symbol;
	private final String name;
	
	public String getSymbol()
	{
		return symbol;
	}

	public String getName()
	{
		return name;
	}
}
