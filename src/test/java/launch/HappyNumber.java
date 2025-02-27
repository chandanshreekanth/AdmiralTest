package launch;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		int n=56812362;
		int sum=0;
		while(n>0)
		{
			int dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
	//	System.out.println(sum);
		while(sum>9)
		{
			n=sum;
			sum=0;
			while(n>0)
			{
				int dig=n%10;
				sum=sum+dig;
				n=n/10;
			}
		}
		System.out.println(sum);	
	}
}
