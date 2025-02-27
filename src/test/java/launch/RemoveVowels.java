package launch;

public class RemoveVowels 
{
	public static void main(String[] args) 
	{
		String c="ChAndanuu";
		String s1=c.toLowerCase();
		char[] s2=s1.toCharArray();
		for (int i = 0; i < s2.length; i++) 
		{
			if(s2[i]=='a'|| s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u')
			{
				System.out.println(s2[i]);
			}
		} 
	}
}
