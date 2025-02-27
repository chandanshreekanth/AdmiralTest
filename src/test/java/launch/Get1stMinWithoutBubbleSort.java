package launch;

public class Get1stMinWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a={30,10,20,50,40};
		int min =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				
			}
		}
		System.out.println(min);
	}
}
