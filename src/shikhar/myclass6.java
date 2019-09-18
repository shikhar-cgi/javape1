package shikhar;

import java.util.Scanner;

public class myclass5 {
	public static void main(String [] args)
	{
	  	Scanner myObj = new Scanner(System.in);
	  	String s=myObj.nextLine();
	  	
	  	char a= s.charAt(0);
	  	int b=(int)a;
	  	if(b>=65 && b<=90)
	  	{
	  		System.out.println("Capital");
	  	}
	  	else if(b>=97 && b<=122)
	  	{
	  		System.out.println("Small");
	  	}
	  	else if(b>=48 && b<=57)
	  	{
	  		System.out.println("Digit");
	  	}
	  	else
	  	{
	  		System.out.println("Special symbol");
	  	}
	}
}
