package launch;

public class PrintSumInString 
{
	public static void main(String[] args) 
	{
		String s="ab0c12dc12";
		int sum=0;
		 
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				//System.out.println(s.charAt(i));
				int n=s.charAt(i)-48;
				System.out.println(n);
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}	
