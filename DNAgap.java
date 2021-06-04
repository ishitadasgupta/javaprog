public class DNAgap
{
	public static void main(String[] args)
	{
	String seq = "aagactaag---tgg-ggt--agtaa-----ttgg-cg--aa--ggcccct----";
    String useq = seq.toUpperCase();
    int l = useq.length();
    int g = 0;
    float gp;
    int max,min;
    for (int i = 0; i < l; i++)
      {
	if ((useq.charAt (i) == '-')||(useq.charAt(i) == ' '))
	  {
	    g++;
	  }
      }
    gp = ((float)g / l)*100;
    System.out.println ("The DNA = " + seq);
    System.out.println ("Total number of gaps present = " + g);
    System.out.println ("Percentage of gaps present = " + gp);
	}
}
