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
		StringBuilder sb = new StringBuilder();
		
		int playerAmount = 0;
		
		final int row = 2;
		final int column = 5;
		
		String bestHandName1, bestHandName2, bestHandName3, bestHandName4;
		
		Random r = new Random();
		
		int [][] hand1 = { {r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2, r.nextInt(13)+2},
						   {r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4), r.nextInt(4)} };				   
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
			System.out.print("Enter the amount of players (2-4): ");
			playerAmount = Integer.parseInt(s.nextLine());
			
			if(!(playerAmount >= 2 && playerAmount <= 4))
				System.out.println("Invalid\n");
			
		}while(!(playerAmount >= 2 && playerAmount <= 4));
		
		System.out.println();
		
		for(int i = 0; i < playerAmount; i++)
		{
			System.out.print("Enter the name for player " + (i+1) + ": ");
			names[i] = s.nextLine().toUpperCase(); 
		}
		
		if(playerAmount >= 2)
		{
			System.out.println();
			
			sb.append((names[0].substring((names[0].indexOf(" ")+1), names[0].length())));
			sb.append(", ");
			sb.append((names[0].substring(0, names[0].indexOf(" "))));
			System.out.println(sb);
			sb.setLength(0);
		
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

			sb.append((names[1].substring((names[1].indexOf(" ")+1), names[1].length())));
			sb.append(", ");
			sb.append((names[1].substring(0, names[1].indexOf(" "))));
			System.out.println(sb);
			sb.setLength(0);
		
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
		
				sb.append((names[2].substring((names[2].indexOf(" ")+1), names[2].length())));
				sb.append(", ");
				sb.append((names[2].substring(0, names[2].indexOf(" "))));
				System.out.println(sb);
				sb.setLength(0);
		
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
		
					sb.append((names[3].substring((names[3].indexOf(" ")+1), names[3].length())));
					sb.append(", ");
					sb.append((names[3].substring(0, names[3].indexOf(" "))));
					System.out.println(sb);
					sb.setLength(0);
		
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
					
					if((winner(bestHandName1, hand1) > winner(bestHandName2, hand2)) && (winner(bestHandName1, hand1) > winner(bestHandName3, hand3)) && (winner(bestHandName1, hand1) > winner(bestHandName4, hand4)))
					{
						sb.append(names[0].toUpperCase().substring(names[0].lastIndexOf(" ")+1, names[0].length()) + ", " + names[0].toUpperCase().substring(0,names[0].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else if((winner(bestHandName2, hand2) > winner(bestHandName1, hand1)) && (winner(bestHandName2, hand2) > winner(bestHandName3, hand3)) && (winner(bestHandName2, hand2) > winner(bestHandName4, hand4)))
					{
						sb.append(names[1].toUpperCase().substring(names[1].lastIndexOf(" ")+1, names[1].length()) + ", " + names[1].toUpperCase().substring(0,names[1].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else if((winner(bestHandName3, hand3) > winner(bestHandName1, hand1)) && (winner(bestHandName3, hand3) > winner(bestHandName2, hand2)) && (winner(bestHandName3, hand3) > winner(bestHandName4, hand4)))
					{
						sb.append(names[2].toUpperCase().substring(names[2].lastIndexOf(" ")+1, names[2].length()) + ", " + names[2].toUpperCase().substring(0,names[2].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else if((winner(bestHandName4, hand4) > winner(bestHandName1, hand1)) && (winner(bestHandName4, hand4) > winner(bestHandName2, hand2)) && (winner(bestHandName4, hand4) > winner(bestHandName3, hand3)))
					{
						sb.append(names[3].toUpperCase().substring(names[3].lastIndexOf(" ")+1, names[3].length()) + ", " + names[3].toUpperCase().substring(0,names[3].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else
						System.out.println("It is a tie");
					
				} //end if 4 players
				else
				{
					System.out.println();
					if((winner(bestHandName1, hand1) > winner(bestHandName2, hand2)) && (winner(bestHandName1, hand1) > winner(bestHandName3, hand3)))
					{
						sb.append(names[0].toUpperCase().substring(names[0].lastIndexOf(" ")+1, names[0].length()) + ", " + names[0].toUpperCase().substring(0,names[0].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else if((winner(bestHandName2, hand2) > winner(bestHandName1, hand1)) && (winner(bestHandName2, hand2) > winner(bestHandName3, hand3)))
					{
						sb.append(names[1].toUpperCase().substring(names[1].lastIndexOf(" ")+1, names[1].length()) + ", " + names[1].toUpperCase().substring(0,names[1].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else if((winner(bestHandName3, hand3) > winner(bestHandName1, hand1)) && (winner(bestHandName3, hand3) > winner(bestHandName2, hand2)))
					{
						sb.append(names[2].toUpperCase().substring(names[2].lastIndexOf(" ")+1, names[2].length()) + ", " + names[2].toUpperCase().substring(0,names[2].lastIndexOf(" ")));
						System.out.println(sb + " Wins!");
						sb.setLength(0);
					}
					else
						System.out.println("It is a tie");
				} //end else if playerAmount = 3
			} //end if 3 players
			else //Calculate the winner for 2 players here
			{
				System.out.println();
				
				if(winner(bestHandName1, hand1) == winner(bestHandName2, hand2))
					System.out.println("It is a tie.");
				else if(winner(bestHandName1, hand1) > winner(bestHandName2, hand2))
				{
					sb.append(names[0].toUpperCase().substring(names[0].lastIndexOf(" ")+1, names[0].length()) + ", " + names[0].toUpperCase().substring(0,names[0].lastIndexOf(" ")));
					System.out.println(sb + " Wins!");
					sb.setLength(0);
				}
				else
				{
					sb.append(names[1].toUpperCase().substring(names[1].lastIndexOf(" ")+1, names[1].length()) + ", " + names[1].toUpperCase().substring(0,names[1].lastIndexOf(" ")));
					System.out.println(sb + " Wins!");
					sb.setLength(0);
				}
				
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
		}
		
		if((cards[0] == cards[1] - 1) && (cards[0] == cards[2] - 2) && (cards[0] == cards[3] - 3) && (cards[0] == cards[4] - 4) || 
		(cards[0] == 2 && cards[1] == 3 && cards[2] == 4 && cards[3] == 5 && cards[4] == 14))
		{
			straight = true;
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
			
		else if((cards[0] == cards[1] && cards[2] == cards[3]) || (cards[0] == cards[1] && cards[3] == cards[4]) ||
		(cards[1] == cards[2] && cards[3] == cards[4]))
			return "Two Pair";
			
		else if((cards[0] == cards[1]) || (cards[1] == cards[2]) || (cards[2] == cards[3]) || (cards[3] == cards[4]))
			return "Pair";
			
		else
			return "High Card";
	} //end bestHand
	
	public static int winner (String hand, int [][] cards)
	{
		int points;
		int [] list = new int [5];
		
		for(int i = 0; i < 5; i++)
		{
			list[i] = cards[0][i];
		}
		
		Arrays.sort(list);
		
		switch(hand)
		{
			case "Straight Flush":
				points = 22;
				break;
			
			case "Four of a Kind \t(if all five cards are the same, the hand will be considered to be four of a kind)":
				points = 21;
				break;
				
			case "Full House":
				points = 20;
				break;
				
			case "Flush":
				points = 19;
				break;
			
			case "Straight":
				points = 18;
				break;
				
			case "Three of a Kind":
				points = 17;
				break;
			
			case "Two Pair":
				points = 16;
				break;
				
			case "Pair":
				points = 15;
				break;
				
			default:
				points = list[4];
		}
		
		return points;
	} //end winner
} //end class