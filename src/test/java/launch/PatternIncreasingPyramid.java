package launch;

public class PatternIncreasingPyramid 
{
	public static void main(String[] args) 
	{
		int n=5;
		char count = 'a';
		for (int i = 1; i <= n; i++) 
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			
			
			System.out.println();
		}
	}
}
