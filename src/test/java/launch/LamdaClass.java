package launch;

public class LamdaClass 
{
/*	public static void main(String[] args) 
	{
		LamdaFuntion lam=new LamdaFuntion()
				{

					@Override
					public void m1() 
					{
						System.out.println("implimented using object");
						
					}
			
				};
				lam.m1();
	}*/
	public static void main(String[] args) 
	{
		LamdaFuntion lm=()->
		{
			System.out.println("implimented using LamdaFuntion");
		};
		lm.m1();
	}
}
