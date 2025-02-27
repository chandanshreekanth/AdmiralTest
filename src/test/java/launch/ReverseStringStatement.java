package launch;

public class ReverseStringStatement
{
	public static void main(String[] args) 
	{
		
		String str="amigo's wondrala to welcome";
		String[] s = str.split(" ");
		for (int i=s.length-1;i>=0;i--) 
		{
			System.out.print(s[i]+" ");
		}
	}
}
