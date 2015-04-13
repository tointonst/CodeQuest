import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Prob03 {
	
	public static void prob03() throws FileNotFoundException
	{
	Scanner file = new Scanner( new File( "prob03.txt" ) );
    while(file.hasNext())
    	{
    	String numbers = file.nextLine();
        String[] each = numbers.split(" ");
        ArrayList eachNumber = new ArrayList<>();
                   
        for (int w =0; w< each.length; w++)
          {
          int number = Integer.parseInt(each[w]);
          eachNumber.add(number);
          }
         Collections.sort(eachNumber);
         Collections.reverse(eachNumber);
         for(int j =0; j<eachNumber.size(); j= j+ 2)
           {
           System.out.print(eachNumber.get(j) + " ");
           }
        int start = eachNumber.size() -1;
        if(eachNumber.size()%2==1)
           {
           start--;
           }
        for(int w = start; w>0; w= w -2)
           {
           System.out.print(eachNumber.get(w) + " ");
           }
           System.out.println();
    	}
	}

}
