public class Facture
{
	public static void main(String args[])
	{
		String produit="Telephone";
		double prix=450;
		double quantite=5;
		
		System.out.println("Nom du produit : " + produit);
		System.out.println("Prix du produit : " + prix);
		System.out.println("Quantite commandee : " + quantite);
		System.out.println("Montant brut : " + prix * quantite);
		System.out.println("Montant TVA : " + (prix/5)*quantite);
		System.out.println("Montant Total : " + ((prix*quantite) + ((prix/5)*quantite)));
	}
}