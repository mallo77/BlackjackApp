package org.mallo.blackjack;


/**
 * 
 * @author Mathius Girik Allo
 */
public class Blackjack
{
	private Card firstCard;
	private Card secondCard;
	
	
	public Blackjack(Card firstCard, Card secondCard)
	{
		this.firstCard  = firstCard;
		this.secondCard = secondCard;
	}
	
	public int getScore() {
		return firstCard.getValue() + secondCard.getValue();
	}
}
