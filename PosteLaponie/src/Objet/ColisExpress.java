package Objet;
import java.util.Scanner;

public class ColisExpress extends Colis{
	private static int nombreColisExpress;
	private static float tarifAffranchissement= 30;
	private boolean emballageLapon = false;
	
	public float tarifAffranchissement()
		{
			float tarif = tarifAffranchissement;
			if(emballageLapon)
				{
					tarif += 3;
				}
			return tarif;
	}
	
	public float tauxRecommendation()
		{
			float tarif = 0;
			if(getTauxRecommendation() == 0)
				{
					tarif +=0;
				}
			if(getTauxRecommendation() == 1)
				{
					tarif = (float) (tarif*0.1);
				}
			if(getTauxRecommendation() == 2)
				{
					tarif = (float) (tarif*0.5);
				}
			else 
				{
					System.out.println("Erreur le taux de recommendation doit être 0,1 ou 2.");
				}
			return tarif;
		}

	public static int getNombreColisExpress() {
		return nombreColisExpress;
	}
	public static void setNombreColisExpress(int nombreColisExpress) {
		ColisExpress.nombreColisExpress = nombreColisExpress;
	}
	public static float getTarifAffranchissement() {
		return tarifAffranchissement;
	}
	public static void setTarifAffranchissement(float tarifAffranchissement) {
		ColisExpress.tarifAffranchissement = tarifAffranchissement;
	}
	public boolean isEmballageLapon() {
		return emballageLapon;
	}
	public void setEmballageLapon(boolean emballageLapon) {
		this.emballageLapon = emballageLapon;
	}

	public void saisieColisExpress(Scanner sc)
	{
		System.out.println("Entrez le code postal : ");
		setCodePostal(sc.nextInt());
		System.out.println("Entrez la destination : ");
		setDestination(Destination.valueOf(sc.next()));
		System.out.println("Entrez le taux de recommendation : ");
		setTauxRecommendation(sc.nextInt());
		System.out.println("Entrez le volume : ");
		setVolume(sc.nextFloat());
		System.out.println("Entrez la valeur declarée : ");
		setValeurDeclaree(sc.nextFloat());
		System.out.println("Entrez le poids : ");
		setPoids(sc.nextFloat());
	}
	
	public String toStringColisExpress() {
		return "Colis Express " + getCodePostal() + "/" + getDestination() + "/" + getTauxRecommendation() + "/"+ getVolume() + "/" + getValeurDeclaree() + "/" + getPoids();
	}
}