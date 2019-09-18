package shikhar;

import java.util.Scanner;

public class myclass7 {
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
      System.out.println("Guess Number between 1 to 50");
      int a;
		while((a=myObj.nextInt())!=45)
		{
			if(a>45)
			{
				System.out.println("Guess Number is greater than number");
			}
			if(a<45)
			{
				System.out.println("Guess Number is smaller than number");
			}
			if(a==45)
			{
 			System.out.println("Guess Number matches the number");
			    
			}
		}
		if(a==45)
		{
			System.out.println("Guess Number matches the number");
		    
		}
	}
}
