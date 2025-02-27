package launch;

public class StringReverseWithoutUsingLengthMethodWithVariable 
{
	public static void main(String[] args) 
	{
		String str="james";
		String rev="";
		char[] s = str.toCharArray();
		int count=0;
		for (char c : s) 
		{
			count++;
		}
for (int i =count-1;i >=0 ; i--) 
			
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
}
}