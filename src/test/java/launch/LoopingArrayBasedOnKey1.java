package launch;

import java.util.Scanner;

public class LoopingArrayBasedOnKey1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key:");
		int key = sc.nextInt();
		sc.close();
		int a[]={1,2,3,4,5};
		for (int i = 0; i < key; i++) 
		{
			int temp=a[0];
			for (int j = 0; j < a.length-1; j++) 
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
