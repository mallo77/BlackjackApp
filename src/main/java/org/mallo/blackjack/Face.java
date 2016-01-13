package org.mallo.blackjack;


/**
 * Summary:
 * 
 * This enum is used to represent a valid suit in Blackjack application
 *  
 * @author Mathius Girik Allo
 */
public enum Face 
{
	Two("2", 2),
	Three("3", 3),
	Four("4", 4),
	Five("5", 5),
	Six("6", 6),
	Seven("7", 7),
	Eight("8", 8),
	Nine("9", 9),
	Ten("10", 10),
	As("A", 11),
	King("K", 10),
	Queen("Q", 10),
	Jack("J", 10);
	
	Face(String symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}
	

	private final String symbol;
	private final int value;

	public String getSymbol()
	{
		return symbol;
	}

	public int getValue()
	{
		return value;
	}
}
