import java.util.Arrays;
public class Aminosort
{
	public static void main(String args[])
	{
		String[] amino={"Alanine","Arginine","Cysteine","Valine","Methionine","Asparagine","Histidine","Glutamine","Serine","Glutamic acid","Glycine","Tryptophan","Lysine","Tyrosine","Threonine","Proline","Phenylalanine","Leucine","Isoleucine","Asparagine"};
		System.out.println("The amino acids before sorting: " );
		System.out.println(Arrays.toString(amino));
		Arrays.sort(amino);
		System.out.println("The amino acids after sorting: ");
		System.out.println(Arrays.toString(amino));
	}
}
		
