package org.mallo.blackjack;

import java.util.Scanner;

/**
 * 
 * @author Mathius Girik Allo
 */
public class App
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.format("****************************************************************\n" +
						  "* Welcome to Blackjack Apps :-) \n" + 
						  "* Here are the rules on how to play this game:\n" +	
						  "*\t1. You will need to enter 2 different cards.\n" +
						  "*\t2. A card will consist of a face value (i.e. 2-10, A, K, Q, J)\n" +
						  "*\t\t and a suit (i.e. S, C, D, H)\n" +
						  "*\t3. The input format is <a Face Value> space <a Suit>\n" +
						  "*\t\t i.e. \"10 S\" for 10 spades card\n" +
						  "****************************************************************\n");
	
		//To prompt user to enter the First Card 
		System.out.printf("Please enter your First Card: ");
		String firstInputVal  = sc.next();
		String firstInputSuit = sc.next();
		
		Face firstFace = Util.getFace(firstInputVal);
		Suit firstSuit = Util.getSuit(firstInputSuit);
		
		//To validate whether user entered valid face values
		if ( firstFace == null ) {
			System.out.printf("You have entered an invalid face value for First Card. "
					+ "The valid values are: %s\n", "2-10, A, K, Q or J");
			System.exit(1);
		}
		
		//To validate whether user entered valid suit values
		if ( firstSuit == null ) {
			System.out.printf("You have entered an invalid suit for First Card. "
					+ "The valid values are: %s\n", "S, C, D, or H");
			System.exit(1);
		}
		
		Card firstCard = new Card(firstFace, firstSuit);
		
		
		//To prompt user to enter the Second Card
		System.out.printf("Please enter your Second Card: ");
		String secondInputVal  = sc.next();
		String secondInputSuit = sc.next();
		
		Face secondFace = Util.getFace(secondInputVal);
		Suit secondSuit = Util.getSuit(secondInputSuit);
		
		//To validate whether user entered valid face values
		if ( secondFace == null ) {
			System.out.printf("You have entered an invalid face value for First Card. "
					+ "The valid values are: %s\n", "2-10, A, K, Q or J");
			System.exit(0);
		}
		
		//To validate whether user entered valid suit values
		if ( secondSuit == null ) {
			System.out.printf("You have entered an invalid suit for Second Card. "
					+ "The valid values are: %s\n", "S, C, D, or H");
			System.exit(0);
		}
				
		Card secondCard = new Card(secondFace, secondSuit);
		
		Blackjack blackjack = new Blackjack(firstCard, secondCard);
		System.out.printf("Your score is %d\n", blackjack.getScore());
		
		//close scanner
		sc.close();
	}
}
