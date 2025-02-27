package launch;

public class PR1 
{
	public static void main(String[] args) {


		int count=1;

		for (int i = 0; i < 100; i++) 
		{
			while(count<=10)
			{

				int n=i;
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
				if(flag)
				{
					System.out.println(n);
					count++;
				}
				break;
			}
		}
	}

}
