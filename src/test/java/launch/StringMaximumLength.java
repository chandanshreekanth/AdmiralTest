package launch;

public class StringMaximumLength 
{
	public static void main(String[] args)
	{
	  String str[]={"a","ab","abc","chan","apple","mango"};
	  String max = str[0];
	  for (int i = 0; i < str.length; i++) 
	  {
		if (max.length()<str[i].length()) 
		{
			max=str[i]; 
			System.out.println("max is ="+max);
		}
	  }
	for (int i = 0; i < str.length; i++) 
	{
		if (max.length()==str[i].length()) 
		{
			System.out.println(str[i]);
		}
	}
	}
}
