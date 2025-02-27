package launch;

public class Hi 
{
	public static void main(String[] args) 
	{
		String s1="hiiii ";
		String s2="hii2 ";
		String s3="hiiii3 ";
		String s4="Return of hiiii";
		//System.out.println(s1.concat(s2).concat(s3).concat(s4));
		String ab="abcd123@#%^aABCD";
		for(int i = 0 ; i < ab.length() ; i++)
		{
			if(Character.isLowerCase(ab.charAt(i)))
			{
				System.out.print(ab.charAt(i));
			}
//			if(Character.isDigit(ab.charAt(i)))
//					{
//						System.out.print(ab.charAt(i));
//					}
		}
	}
}
