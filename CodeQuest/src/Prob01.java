import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prob01
	{
	public static void prob01() throws FileNotFoundException
		{
		Scanner file = new Scanner( new File( "prob01.txt" ) );
	    while(file.hasNext())
	    	{
	    	int number = file.nextInt();
	    	if (number%3==0 && number%7==0)
	    		{
	    		System.out.println("CODEQUEST");
	    		}
	    	else if(number%3==0)
	    		{
	    		System.out.println("CODE");
	    		}
	    	else if(number%7==0)
	    		{
	    		System.out.println("Quest");
	    		}
	    	else
	    		{
	    		System.out.println(number);
	    		}
	    	
	    	}
	      
		}

	}
