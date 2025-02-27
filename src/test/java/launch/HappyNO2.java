package launch;

public class HappyNO2 
{
	public static void main(String[] args) 
	{
		int no = 1199999999;
		int sum=sum(no);
		while(sum>9)
		{
			sum=sum(sum);
		}
		System.out.println(sum);
		
	}
	public static int sum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem = no%10;
			sum=sum+rem;
			no = no/10;
		}
		return sum;
	}
}
