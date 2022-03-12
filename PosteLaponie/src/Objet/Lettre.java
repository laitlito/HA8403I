package Objet;
import java.util.Scanner;

public class Lettre extends Objet{
	private String caractereUrgence;
	private static int tarifAffranchissement=(int) 0.5 ;
	private int tauxRecommendation;
	
	public float tarifAffranchissement()
		{
			float tarif = tarifAffranchissement;
			if(tauxRecommendation == 1)
				{
					tarif += 0.5;
				}
			if(tauxRecommendation == 2)
				{
					tarif += 1.5;
				}
			return tarif;
		}
	
	public float tarifRemboursement()
		{
			float tarif = 0;
			if(tauxRecommendation == 0)
				{
					tarif +=0;
				}
			if(tauxRecommendation == 1)
				{
					tarif += 1.5;
				}
			if(tauxRecommendation == 2)
				{
					tarif += 15;
				}
			return tarif;
	}

	public String getCaractereUrgence() {
		return caractereUrgence;
	}
	public void setCaractereUrgence(String caractereUrgence) {
		this.caractereUrgence = caractereUrgence;
	}
	public static float getTarifAffranchissement() {
		return tarifAffranchissement;
	}
	public static void setTarifAffranchissement(float tarifAffranchissement) {
		Lettre.tarifAffranchissement = (int) tarifAffranchissement;
	}
	public int getTauxRecommendation() {
		return tauxRecommendation;
	}
	public void setTauxRecommendation(float tauxRecommendation) {
		this.tauxRecommendation = (int) tauxRecommendation;
	}
	
	public void saisieLettre(Scanner sc) {
		System.out.println("Entrez le code postal : ");
		setCodePostal(sc.nextInt());
		System.out.println("Entrez la destination : ");
		setDestination(Destination.valueOf(sc.next()));
		System.out.println("Entrez le taux de recommendation : ");
		setTauxRecommendation(sc.nextInt());
		System.out.println("Entrez le caractère d'urgence : ");
		this.setCaractereUrgence(sc.next());
	}
	
	public String toStringLettre() {
		return "Lettre " + getCodePostal() + "/" + getDestination() + "/" + getTauxRecommendation() + "/" + getCaractereUrgence();
	}
	
}