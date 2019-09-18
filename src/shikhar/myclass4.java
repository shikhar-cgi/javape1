package shikhar;

import java.util.Scanner;

public class myclass3 {
public static void main(String [] args)
{
	Scanner myObj = new Scanner(System.in);
	int a= myObj.nextInt();
	for(int i=1;i<=a;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(i);
		}
	}
}
}
