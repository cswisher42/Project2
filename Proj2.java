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
		String [] names = new String[4];
		int playerAmount = 0;
		
		final int row = 2;
		final int column = 5;
		
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
					
					System.out.println("Calculate the winner for 4 players here");
				} //end if 4 players
				else
				{
					System.out.println("Calculate the winner for 3 players here");
				} //end else if playerAmount = 3
			} //end if 3 players
			else
			{
				System.out.println("Calculate the winner for 2 players here");
			} //end else if playerAmount = 2
		} //end if players 2
	} //end main
} //end class