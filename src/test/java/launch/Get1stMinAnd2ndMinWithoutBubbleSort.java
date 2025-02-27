package launch;

public class Get1stMinAnd2ndMinWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]	={1,6,4,9,8};
		int fmin=a[0];
		int smin=a[0];
//		int fmin=a.length;
//		int smin=a.length;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
				
			}
			else if(a[i]<smin || fmin==smin)
			{
				smin=a[i];
				
			}
		}
		System.out.println(fmin+"  "+smin);
		
	}
}
