package launch;

public class StringReverseWithoutUsingLengthMethod
{
	public static void main(String[] args) 
	{
		String str="james";
		char[] s = str.toCharArray();
		int count=0;
		for (char c : s) 
		{
			count++;
		}
		for (int i =count-1;i >=0 ; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		
		
	}
}
