package shikhar;
import java.util.Scanner;
public class myclass2 {
public static void main(String [] args)
{
	Scanner myObj = new Scanner(System.in);
	int a= myObj.nextInt();
	if(a%2==0 && a>20 && a<30)
	{
		System.out.println("Jerry");
	}
	if(a%2!=0 && a>20 && a<30)
	{
		System.out.println("tom");
	}
	else
	{
		System.out.println("Nothing");
	}
}
}
