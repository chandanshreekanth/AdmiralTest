package launch;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfWordInReverseOrder 
{
	public static void main(String[] args) 
	{
		
			String s="tester";
			LinkedHashSet<Character> sh=new LinkedHashSet<>();
			for (int i = 0; i < s.length(); i++) 
			{
				sh.add(s.charAt(i));
			
			}
			
			System.out.println(sh);
			
			for (Character ch : sh) 
			{
			
				for (int i=s.length()-1;i>0;i--) 
				{
					if (ch==s.charAt(i)) 
					{
						System.out.println(ch+"="+(i+1));
						break;
						
					}
				}
			}
}
}
