package Objet;
import java.util.Scanner;

public class Colis extends Objet{
	private String contenu;
	private float valeurDeclaree;
	private static float tarifAffranchissement=(float) 2 ;
	private float tarifRemboursement;
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
			if(getVolume() > 1/8)
				{
					tarif += 3;
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
					tarif = (float) (tarifRemboursement*0.1);
				}
			if(tauxRecommendation == 2)
				{
					tarif = (float) (tarifRemboursement*0.5);
				}
			return tarif;
		}
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public float getValeurDeclaree() {
		return valeurDeclaree;
	}
	public void setValeurDeclaree(float valeurDeclaree) {
		this.valeurDeclaree = valeurDeclaree;
	}
	public static float getTarifAffranchissement() {
		return tarifAffranchissement;
	}
	public static void setTarifAffranchissement(float tarifAffranchissement) {
		Colis.tarifAffranchissement = tarifAffranchissement;
	}
	public float getTarifRemboursement() {
		return tarifRemboursement;
	}
	public void setTarifRemboursement(float tarifRemboursement) {
		this.tarifRemboursement = tarifRemboursement;
	}
	public int getTauxRecommendation() {
		return tauxRecommendation;
	}
	public void setTauxRecommendation(float tauxRecommendation) {
		this.tauxRecommendation = (int) tauxRecommendation;
	}
	
	public void saisieColis(Scanner sc) {
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
	}
	
	public String toStringColis() {
		return "Colis " + getCodePostal() + "/" + getDestination() + "/" + getTauxRecommendation() + "/"+ getVolume() + "/" + getValeurDeclaree();
	}
	
}