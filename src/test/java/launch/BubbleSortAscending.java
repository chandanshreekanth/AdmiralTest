package launch;

import java.util.Scanner;

public class BubbleSortAscending 
{
	public static void main(String[] args) 
	{
		   Scanner scanner = new Scanner(System.in);

	        // Prompt user for the number of elements
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        // Create an array to store user inputs
	        int[] a = new int[n];

	        // Input elements into the array
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
//		int[] a={8,3,10,50,110};
		
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
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		//System.out.println(a.length);
	}
}
