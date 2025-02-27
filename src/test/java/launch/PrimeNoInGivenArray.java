package launch;

public class PrimeNoInGivenArray 
{
	public static void main(String[] args) 
	{
		int a[]={2,3,5,7,9,11,15,19};
		
		for (int i = 0; i < a.length; i++) 
		{
			int n=a[i];
			//int no=1;
			boolean flag = true;
			if(n<=1)
			{
				flag=false;
			}
			
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					flag=false;
					break;
					
				}
			}
			if(flag==true)
			{
				System.out.println("prime no is:"+n);
			}
			/*else
			{
				System.out.println("not prime no");
			}*/
		}
	}
}
