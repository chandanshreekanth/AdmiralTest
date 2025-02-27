package launch;

import java.util.Scanner;

public class LoopingArrayBasedOnKey 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key:");
		int key = sc.nextInt(); 
		sc.close();
		int a[]={1,2,3,4,5};
//		for (int i = 0; i < key; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
