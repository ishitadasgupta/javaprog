public class DNAcomp
{
    public static void main (String[] args) 
    {
        String seq ="aagactAagtGgggTAgtaattggCGAagGcCcct";
        String useq = seq.toUpperCase();
        String exa = useq.replace('A','B');
        String exb = exa.replace('T','A');
        String ext = exb.replace('B','T');
        String exg = ext.replace('G','D');
        String exc = exg.replace('C','G');
        String exd = exc.replace('D','C');
        System.out.println("Original DNA sequence: "+seq);
        System.out.println("Complement DNA sequence : "+exd);
    }
}