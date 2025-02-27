package launch;

public class BubbleSortFirstMinimum 
{
	public static void main(String[] args) 
	{
	int[] a={8,3,10,100,50};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		System.out.println(a[a.length-1]);
	}
}
