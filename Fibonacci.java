public class Fibonacci
{
	public static void main(String args[])
	{
		long a=0,b=1,c=0;
		int n;
		System.out.println("The Fibonacci Series : ");
		System.out.print(a+",");
		System.out.print(b+",");
		for(n=0;n<=50;n++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
		    b=c;
			c++;
		}
		
		
	}
}