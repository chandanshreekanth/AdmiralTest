package launch;

public class FibonacciSeriesRange
{
	public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2+" ");
		for (int i = 0; i < 25; i++) 
		{
			fib3=fib2+fib1;
			fib1=fib2;
			fib2=fib3;
			if(fib3<25)
			{
				System.out.print(fib3+" ");
				
			}
			else
			{
				break;
			}
			
			
		}
	//	System.out.println(fib3);
	}
}
