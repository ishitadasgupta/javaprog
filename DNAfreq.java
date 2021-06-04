public class DNAfreq
{
  public static void main (String args[])
  {
    String seq = "aagactaagtggggtagtaattggcgaaggcccct";
    String useq = seq.toUpperCase ();
    int a = 0;
    int g = 0;
    int c = 0;
    int t = 0;
    float ap,gp,cp,tp;
    int max,min;
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
    ap = ((float)a / (a + g + c + t))*100;
    gp = ((float)g / (a + g + c + t))*100;
    cp = ((float)c / (a + g + c + t))*100;
    tp = ((float)t / (a + g + c + t))*100;
    max = Math.max(a,Math.max(g,Math.max(c, t)));
    min = Math.min(a,Math.min(g,Math.min(c, t)));
    System.out.println ("The DNA = " + seq);
    System.out.println ("Frequency of A = " + a);
    System.out.println ("Frequency of G = " + g);
    System.out.println ("Frequency of C = " + c);
    System.out.println ("Frequency of T = " + t);
    System.out.println ("A's Percentage in DNA : " + ap);
    System.out.println ("G's Percentage in DNA : " + gp);
    System.out.println ("C's Percentage in DNA : " + cp);
    System.out.println ("T's Percentage in DNA : " + tp);
    System.out.println ("The maximum base frequency is : "+ max);
    System.out.println ("The minimum base frequency is : "+ min);
  }
}
