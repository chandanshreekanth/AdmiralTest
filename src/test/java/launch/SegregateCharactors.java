package launch;

import java.util.Scanner;

public class SegregateCharactors 
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		String s = sc.nextLine();
		
		
		String s = "chan1234dan#$%";
		String aph = " ";
		String no = " "; 
		String spl = " ";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&& s.charAt(i)<='Z')
				
			{
				aph=aph+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				no=no+s.charAt(i);
			}
			else 
			{
				spl=spl+s.charAt(i);
			}
		}
		System.out.println(aph+no+spl);
		
	}
}
