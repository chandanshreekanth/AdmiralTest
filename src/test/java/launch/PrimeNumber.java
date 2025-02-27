package launch;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
	/*	Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		*/		
		int no=7;
		boolean flag = true;
		if(no<=1) 
		{
			flag=false;
		}
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
				
			}
		}
		if(flag==true)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
		}
		
	}
}
/*if(no<=1)
{
	flag=false;
}*/