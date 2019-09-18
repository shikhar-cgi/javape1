package shikhar;

import java.util.Scanner;

public class myclass6 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		int a= myObj.nextInt();
	int sum=0;
	int n=a;
	int c=0;
	int q=0;
	int z;
	int temp;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	int b[];
	b=new int[100]; 
	n=a;
	while(n>0)
	{   
		z=n%10;
		n=n/10;
		b[q++]=z;
	}
	for(int i=0;i<q;i++)
	{
		for(int j=i;j<q;j++)
		{
			if(b[j]>b[i])
			{
				temp=b[i] ;
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	for(int i=0;i<q;i++)
	{
			
		  System.out.print(b[i]);
		  if(b[i]%2==0)
		  {
			  sum=sum+b[i];
		  }
		
	}
	System.out.println();
	System.out.print("sum of even number is" + sum);
	System.out.println();
	if(sum<15)
	{
	System.out.print("False");}
	else
	{
		System.out.print("True");
	}
	}
	

}
