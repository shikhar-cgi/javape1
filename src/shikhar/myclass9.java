package shikhar;

import java.util.Scanner;

public class myclass9 {
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
        String s=myObj.nextLine();
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	n=n+s.charAt(i);
        }
        System.out.println("reverse string is " + n);

}
}