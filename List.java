public class List
{
	public static void main(String args[])
	{
		String amino[]={"Alanine","Arginine","Asparagine","Aspartic acid","Cysteine","Glutamine","Glutamic acid","Glycine","Histidine","Isoleucine","Leucine","Lysine","Methionine","Phenylalanine","Proline","Serine","Threonine","Tryptophan","Tyrosine","Valine"};
		long aminowt[]={89,174,132,133,121,146,147,75,155,131,131,146,149,165,115,105,119,204,181,117};
		System.out.println("The list of the amino acids with their molecular weight:");
		for(int i=0;i<20;i++)
		{
			System.out.println(amino[i]+" = "+aminowt[i]);
		}
	}
}
