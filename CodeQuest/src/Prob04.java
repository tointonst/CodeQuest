import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prob04
	{
	public static void prob04() throws FileNotFoundException
		{
		Scanner file = new Scanner( new File( "prob04.txt" ) );
	    while(file.hasNext())
	    	{
	    	String line = file.nextLine();
	    	String[] words = line.split(" ");
	    	String newWord ="";
	    	for(int i=0; i< words.length;i++)
	    		{
	    		if(words[i].charAt(0) =='a' || words[i].charAt(0) =='e' || words[i].charAt(0) =='i' || words[i].charAt(0) =='o' || words[i].charAt(0) =='u')
	    			{
	    			newWord = words[i] + "yay";
	    			}
	    		else
	    			{
	    			for(int j = 1; j<words[i].length();j++)
	    				{	
	    				if(words[i].charAt(j) =='a' || words[i].charAt(j) =='e' || words[i].charAt(j) =='i' || words[i].charAt(j) =='o' || words[i].charAt(j) =='u')
		    				{
	    					newWord = words[i].substring(j) + words[i].substring(0,j) + "ay";
		    				}
	    				else
	    					{
	    					
	    					}
	    				}
	    			}
	    		System.out.print(newWord + " ");
	    		}
	    	System.out.println();
	    	}
		}
	}
