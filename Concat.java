public class Concat
{
	public static void main(String args[])
	{
		String dna1="AGTCTCGGA";
		String dna2="CTTGCATG";
		System.out.println("The DNA sequences are : "+dna1+ " and "+dna2);
		dna2=dna1.concat(dna2);
		System.out.println("The sequences after concatenation :"+dna2);
	}
}

	