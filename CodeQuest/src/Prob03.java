import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prob03 {
	
	public static void prob03() throws FileNotFoundException
	{
	Scanner file = new Scanner( new File( "prob03.txt" ) );
    while(file.hasNext())
    	{
    	String line = file.nextLine();
    	String[] words = line.split(" ");
    	String newWord ="";
    	for(int i=0; i< words.length;i++)
    		{
    		
    		}
    	}
	}

}
