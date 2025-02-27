 package launch;

import java.util.LinkedHashSet;

public class PrintVowelsWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String s="testyantra";
		//System.out.println(s);
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) 
		{
			//System.out.print(s.charAt(i));
			set.add(s.charAt(i)); 
			
		}
		System.out.print(set);
		int count=0;
		for (Character ch : set) 
		{
			if (ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u') 
			{
				count++;
				System.out.print(ch);
			}
		}
		System.out.println("="+count);
	}
}
