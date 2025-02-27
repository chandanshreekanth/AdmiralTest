package launch;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
	
		String s = sc.nextLine();
		
		//String s = "12211";
		String rev="";
		for (int i=s.length()-1;i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
