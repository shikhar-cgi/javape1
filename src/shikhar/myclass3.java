package shikhar;

import java.util.Scanner;

public class myclass8 {
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine();
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='u' || c=='i' || c=='o')
		{
		 System.out.println(c + " Vowel");	
		}
		else
		{
			System.out.println(c + " consonent");
		}
		}
	}

}
