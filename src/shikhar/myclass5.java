package shikhar;

import java.util.Scanner;

public class myclass4 {

	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine();
		int a=0; 
		int sum=0;
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			try
			{
			a=Integer.parseInt(arr[i]);
			}
			catch(Exception e)
			{
				System.out.println("Invalid integer");
				return;
			}
			sum=sum+a;
		}
		System.out.println(sum);
	}
	
}
