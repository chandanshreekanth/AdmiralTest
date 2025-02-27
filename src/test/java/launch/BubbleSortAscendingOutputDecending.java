package launch;

public class BubbleSortAscendingOutputDecending 
{
	public static void main(String[] args) 
	{
		int[] a={8,3,10,100,50};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.println(a[k]);
		}
		
	}
}
