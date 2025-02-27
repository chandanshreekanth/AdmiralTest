package launch;

public class StringMinimumLength 
{
	public static void main(String[] args)
	{
	  String str[]={"abbb","cnn","abc","bb","chan","apple","mango"};
	  String min = str[0];
	  for (int i = 0; i < str.length; i++) 
	  {
		if (min.length()>str[i].length()) 
		{
			min=str[i]; 
		}
	  }
	for (int i = 0; i < str.length; i++) 
	{
		if (min.length()==str[i].length()) 
		{
			System.out.println(str[i]);
		}
	}
	}
}
