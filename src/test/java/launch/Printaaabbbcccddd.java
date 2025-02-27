package launch;

import java.util.LinkedHashSet;

public class Printaaabbbcccddd
{
	public static void main(String[] args) 
	{
		String str = "abcdaebcdaebcd";
		char[] s = str.toCharArray();
		LinkedHashSet<Character> l = new LinkedHashSet<>();
		for (int i = 0; i < s.length; i++) 
		{
			l.add(s[i]);
		}
		for (Character ch : l) 
		{
			for (int i = 0; i < s.length; i++) 
			{
				if(ch==s[i])
				{
					System.out.print(ch);
				}
			}
			System.out.print(",");
		}
	}
}
