package launch;

public class SumOfNumbersFromString 
{
	public static void main(String[] args) 
	{
		String s="ab11bc22cd33";
		int num=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				sum=(sum*10)+(s.charAt(i)-48); 
				
			}
			else
			{
				num=num+sum;
				sum=0;
			}
		}
		System.out.println(num+sum);
	}
}
