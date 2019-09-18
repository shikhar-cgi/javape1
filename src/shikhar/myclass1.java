package shikhar;
import java.util.Scanner;
public class shikharssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int a= myObj.nextInt();
		int n=a;
		int b=0;
		int sum=0;
	    while(n>0)
	    {
	    	int q=n%10;
	    	b=b*10+q;
	    	n=n/10;
	    	if(q%2==0)
	    	{
	    		sum=sum+q;
	    	}
	    }
	   if(b==a && sum>25 )
	   {
		System.out.println(a + " is a pallindrome and sum of even number is greater than 25 " );   
	   }
	   if(b==a && sum<25 )
	   {
		System.out.println(a + " is a pallindrome and sum of even number is less than 25 " );   
	   }
	   if(b!=a)
	   {
		   System.out.println("Not a pallindrome");
	   }
	}

}
