public class Student
{
	public static void main(String args[])
	{
		int phy =84, chem =78, maths =87, bio =82, comp =88;
		int sum =0;
		float perct;
		sum= phy+chem+maths+bio+comp;
		perct = ((float)sum/500)*100;
		System.out.println("The percentage obtained : "+perct);
		if(perct>50)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}
		
		