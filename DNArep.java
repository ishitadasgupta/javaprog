public class DNArep
{
  public static void main (String[]args)
  {
    String seq = "aagactaagatggggtagataattggcgaagagcccct";
    String useq = seq.toUpperCase ();
    String rep = "gat";
    String urep = rep.toUpperCase ();
    int count = 0;
    int j = 0;
    for (int i = 0; i < useq.length () - 2;)
      {
	if ((useq.charAt (i) == 'G') && (useq.charAt (i + 1) == 'A')
	    && (useq.charAt (i + 2) == 'T'))
	  {
	    count++;
	    j = 2;
	  }
	i++;
	i = i + j;
      }
    System.out.println ("DNA = " + seq);
    System.out.println ("Repeat sequence = " + rep);
    System.out.println ("Number of times the repeat has appeared = " + count);

  }
}