package launch;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		String str="input javaa pytho"; 
		String[] s = str.split(" ");
		
	
		System.out.println(str.length());
		
		System.out.println(s.length);
		//s[0]=welcome s[1]=to s[2]=testyantra
		for (int i = 0; i < s.length; i++) 
		{
			
			String str1=s[i];
			for (int j = str1.length()-1;j>=0;j--) 
			{
				String rev="";
				rev=rev+str1.charAt(j);
				System.out.print(rev);
//				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
