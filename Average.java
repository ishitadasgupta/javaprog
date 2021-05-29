public class Average
{
	public static void main(String args[])
	{
		double sum=0.0, avg=0.0;
		double[] num={20.5,62.4,58.7,31.5,42.8,62.4,78.3,89.1,94.2,64.5};
		for(int i=0;i<10;i++)
		{
			sum=sum+num[i];
		}
		avg=(double)sum/10;
		System.out.println("The average of the elements in the series is = " + avg);
	}
}