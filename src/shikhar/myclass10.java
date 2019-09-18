package shikhar;

import java.util.Scanner;

public class myclass10 {
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine();
		int n=myObj.nextInt();
		
		System.out.print(s);
		for(int i=0;i<n;i++)
		{
			for(int j=s.length()-n;j<s.length();j++)
			{
				System.out.print(s.charAt(j));
			}
		}
		
	}

}
