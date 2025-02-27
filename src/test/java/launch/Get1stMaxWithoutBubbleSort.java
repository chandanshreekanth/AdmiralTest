package launch;

public class Get1stMaxWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a={30,10,20,50,80};
		int max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
		}
		System.out.println(max);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
