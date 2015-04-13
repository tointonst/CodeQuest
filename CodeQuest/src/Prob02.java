import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Prob02 {
	public static void prob02() throws FileNotFoundException
	{
	Scanner file = new Scanner( new File( "prob03.txt" ) );
	int counter =1;
    while(file.hasNext())
    	{
    	String hand = file.nextLine();
    	String[] cards = hand.split(" ");
    	
    	System.out.println("Hand " + counter);
    	for(int i=0; i<cards.length; i++)
    		{
    		String face = cards[i].substring(0,1);
    		String suit = cards[i].substring(1);
    		if(suit.equals("S")|| suit.equals("C"))
    			{
    			suit = "BLACK";
    			}
    		else
    			{
    			suit = "RED";
    			}
    		
    		
    		switch(face)
    			{
    			case "2":
    				{
    				System.out.println("2-" + suit);
    				break;
    				}
    			case "3":
					{
					System.out.println("3-" + suit);
					break;
					}
    			case "4":
					{
					System.out.println("4-" + suit);
					break;
					}
    			case "5":
					{
					System.out.println("5-" + suit);
					break;
					}
    			case "6":
					{
					System.out.println("6-" + suit);
					break;
					}
    			case "7":
					{
					System.out.println("7-" + suit);
					break;
					}	
    			case "8":
					{
					System.out.println("8-" + suit);
					break;
					}
    			case "9":
					{
						System.out.println("9-" + suit);
						break;
					}	
    			case "10":
					{
						System.out.println("10-" + suit);
						break;
					}	
    			case "A":
					{
						System.out.println("ACE-" + suit);
						break;
					}	
    			case "J":
					{
						System.out.println("JACK-" + suit);
						break;
					}	
    			case "Q":
					{
						System.out.println("QUEEN-" + suit);
						break;
					}	
    			case "K":
					{
						System.out.println("KING-" + suit);
						break;
					}	
    			}
    		}
    	counter++;
    	}
	}
}
