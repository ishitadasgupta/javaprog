public class GCcount
{
  public static void main (String args[])
  {
    String seq = "aagactaagtggggtagtaattggcgaaggcccct";
    String useq = seq.toUpperCase ();
    int a = 0;
    int g = 0;
    int c = 0;
    int t = 0;
    float p;
    for (int i = 0; i < useq.length (); i++)
      {
	if (useq.charAt (i) == 'A')
	  {
	    a++;
	  }
	else if (useq.charAt (i) == 'G')
	  {
	    g++;
	  }
	else if (useq.charAt (i) == 'C')
	  {
	    c++;
	  }
	else if (useq.charAt (i) == 'T')
	  {
	    t++;
	  }
      }
    p = ((float)(g + c) / (a + g + c + t))*100;
    System.out.println ("The DNA = " + seq);
    System.out.println ("A's count = " + a);
    System.out.println ("G's count = " + g);
    System.out.println ("C's count = " + c);
    System.out.println ("T's count = " + t);
    System.out.println ("GC Percentage of DNA : " + p);
  }
}
