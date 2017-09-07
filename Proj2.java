/*
*
************************************************************************************************************************************************
************************************************************************************************************************************************
*/
import java.util.*;

public class Proj2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		int playerAmount = 0;
		
		final int row = 2;
		final int column = 5;
		
		String bestHandName1, bestHandName2, bestHandName3, bestHandName4;
		
		Random r = new Random();
		
		int [][] hand1 = { {2, 5, 6, 6, 3},
						   {0, 0, 1, 0, 0} };				   
		String [] cards1 = new String [5];
		String [] suits1 = new String [5];
						   
		int [][] hand2 = { {r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2},
						   {r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4)} };
		String [] cards2 = new String [5];
		String [] suits2 = new String [5];						
						   
		int [][] hand3 = { {r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2},
						   {r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4)} };	
		String [] cards3 = new String [5];
		String [] suits3 = new String [5];
						   
		int [][] hand4 = { {r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2},
						   {r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4)} };
		String [] cards4 = new String [5];
		String [] suits4 = new String [5];
		
		String [] names = new String[4];
		
		do
		{
			System.out.print("Enter the amount of player (2-4): ");
			playerAmount = Integer.parseInt(s.nextLine());
			
			if(!(playerAmount >= 2 && playerAmount <= 4))
				System.out.println("Invalid");
			
		}while(!(playerAmount >= 2 && playerAmount <= 4));
		
		for(int i = 0; i < playerAmount; i++)
		{
			System.out.print("Enter the name for player " + (i+1) + ": ");
			names[i] = s.nextLine(); 
		}
		
		if(playerAmount >= 2)
		{
			System.out.println();
		
			System.out.println(names[0].toUpperCase().substring(names[0].lastIndexOf(" ")+1, names[0].length()) + ", " + names[0].toUpperCase().substring(0,names[0].lastIndexOf(" ")));
		
			for(int i = 0; i < column; i++)
			{	
				int tempCard = hand1[0][i];
				int tempSuit = hand1[1][i];
			
				switch (tempCard)
				{
					case 11:
						cards1[i] = "Jack";
						break;
					case 12:
						cards1[i] = "Queen";
						break;
					case 13:
						cards1[i] = "King";
						break;
					case 14:
						cards1[i] = "Ace";
						break;
					default:
						cards1[i] = Integer.toString(tempCard); 
				}
			
				switch (tempSuit)
				{
					case 0:
						suits1[i] = "Spades";
						break;
					case 1:
						suits1[i] = "Clubs";
						break;
					case 2:
						suits1[i] = "Hearts";
						break;
					case 3:
						suits1[i] = "Diamonds";
				}
			
				System.out.println("\t" + cards1[i] + " of " + suits1[i]);
			} //end for hand1
			
			bestHandName1 = bestHand(hand1);
			
			System.out.println();
			System.out.println("Best hand: " + bestHandName1);
			System.out.println();
			System.out.println();

			System.out.println(names[1].toUpperCase().substring(names[1].lastIndexOf(" ")+1, names[1].length()) + ", " + names[1].toUpperCase().substring(0,names[1].lastIndexOf(" ")));
		
			for(int i = 0; i < column; i++)
			{	
				int tempCard = hand2[0][i];
				int tempSuit = hand2[1][i];
			
				switch (tempCard)
				{
					case 11:
						cards2[i] = "Jack";
						break;
					case 12:
						cards2[i] = "Queen";
						break;
					case 13:
						cards2[i] = "King";
						break;
					case 14:
						cards2[i] = "Ace";
						break;
					default:
						cards2[i] = Integer.toString(tempCard); 
				}	
			
				switch (tempSuit)
				{
					case 0:
						suits2[i] = "Spades";
						break;
					case 1:
						suits2[i] = "Clubs";
						break;
					case 2:
						suits2[i] = "Hearts";
						break;
					case 3:
						suits2[i] = "Diamonds";
				}
			
				System.out.println("\t" + cards2[i] + " of " + suits2[i]);
			} //end for hand2
			
			bestHandName2 = bestHand(hand2);
			
			System.out.println();
			System.out.println("Best hand: " + bestHandName2);
			System.out.println();
			
			if(playerAmount >= 3)
			{
				System.out.println();
		
				System.out.println(names[2].toUpperCase().substring(names[2].lastIndexOf(" ")+1, names[2].length()) + ", " + names[2].toUpperCase().substring(0,names[2].lastIndexOf(" ")));
		
				for(int i = 0; i < column; i++)
				{	
					int tempCard = hand3[0][i];
					int tempSuit = hand3[1][i];
			
					switch (tempCard)
						{
						case 11:
							cards3[i] = "Jack";
							break;
						case 12:
							cards3[i] = "Queen";
							break;
						case 13:
							cards3[i] = "King";
							break;
						case 14:
							cards3[i] = "Ace";
							break;
						default:
							cards3[i] = Integer.toString(tempCard); 
					}
			
					switch (tempSuit)
					{
						case 0:
							suits3[i] = "Spades";
							break;
						case 1:
							suits3[i] = "Clubs";
							break;
						case 2:
							suits3[i] = "Hearts";
							break;
						case 3:
							suits3[i] = "Diamonds";
					}
			
					System.out.println("\t" + cards3[i] + " of " + suits3[i]);
				} //end for hand3
				
				bestHandName3 = bestHand(hand3);
			
				System.out.println();
				System.out.println("Best hand: " + bestHandName3);
				System.out.println();
				
				if(playerAmount == 4)
				{
					System.out.println();
		
					System.out.println(names[3].toUpperCase().substring(names[3].lastIndexOf(" ")+1, names[3].length()) + ", " + names[3].toUpperCase().substring(0,names[3].lastIndexOf(" ")));
		
					for(int i = 0; i < column; i++)
					{	
						int tempCard = hand4[0][i];
						int tempSuit = hand4[1][i];
			
						switch (tempCard)
							{
							case 11:
								cards4[i] = "Jack";
								break;
							case 12:
								cards4[i] = "Queen";
								break;
							case 13:
								cards4[i] = "King";
								break;
							case 14:
								cards4[i] = "Ace";
								break;
							default:
								cards4[i] = Integer.toString(tempCard); 
						}
					
						switch (tempSuit)
						{
							case 0:
								suits4[i] = "Spades";
								break;
							case 1:
								suits4[i] = "Clubs";
								break;
							case 2:
								suits4[i] = "Hearts";
								break;
							case 3:
								suits4[i] = "Diamonds";
						}
			
						System.out.println("\t" + cards4[i] + " of " + suits4[i]);
					} //end for hand4
					
					bestHandName4 = bestHand(hand4);
			
					System.out.println();
					System.out.println("Best hand: " + bestHandName4);
					System.out.println();
					System.out.println();
					System.out.println("Calculate the winner for 4 players here");
				} //end if 4 players
				else
				{
					System.out.println();
					System.out.println("Calculate the winner for 3 players here");
				} //end else if playerAmount = 3
			} //end if 3 players
			else
			{
				System.out.println();
				System.out.println("Calculate the winner for 2 players here");
			} //end else if playerAmount = 2
		} //end if players 2
	} //end main
	
	public static String bestHand (int [][] hand)
	{
		int [] cards = new int [5];
		int [] suits = new int [5];
		
		Boolean flush = false;
		Boolean straight = false;
		
		for(int i = 0; i < 5; i++)
		{
			cards[i] = hand[0][i];
		}
		
		for(int k = 0; k < 5; k++)
		{
			suits[k] = hand[1][k];
		}
		
		Arrays.sort(cards);
		Arrays.sort(suits);
		
		if(suits[0] == suits[1] && suits[0] == suits[2] && suits[0] == suits[3] && suits[0] == suits[4])
		{
			flush = true;
			System.out.println("Flush True");
		}
		
		if((cards[0] == cards[1] - 1) && (cards[0] == cards[2] - 2) && (cards[0] == cards[3] - 3) && (cards[0] == cards[4] - 4) || 
		(cards[0] == 2 && cards[1] == 3 && cards[2] == 4 && cards[3] == 5 && cards[4] == 14))
		{
			straight = true;
			System.out.println("Straight True");
		}
		
		if(flush && straight)
			return "Straight Flush";
		
		else if((cards[0] == cards[1] && cards[0] == cards[2] && cards[0] == cards[3]) || 
		(cards[1] == cards[2] && cards[1] == cards[3] && cards[1] == cards[4]))
			return "Four of a Kind \t(if all five cards are the same, the hand will be considered to be four of a kind)";
			
		else if((cards[0] == cards[1] && cards[0] == cards[2] && cards[3] == cards[4]) || 
		(cards[2] == cards[3] && cards[2] == cards[4] && cards[0] == cards[1]))
			return "Full House";
			
		else if(flush)
			return "Flush";
		
		else if(straight)
			return "Straight";
		
		else if((cards[0] == cards[1] && cards[0] == cards[2]) ||
		(cards[1] == cards[2] && cards[1] == cards[3]) ||
		(cards[2] == cards[3] && cards[2] == cards[4]))
			return "Three of a Kind";
			
		else if((cards[0] == cards[1] && cards[2] == cards[3]) ||
		(cards[1] == cards[2] && cards[3] == cards[4]))
			return "Two Pair";
			
		else if((cards[0] == cards[1]) || (cards[1] == cards[2]) || (cards[2] == cards[3]) || (cards[3] == cards[4]))
			return "Pair";
			
		else
			return "High Card";
	}
} //end class