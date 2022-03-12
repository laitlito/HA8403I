package Planete;
import java.lang.Math;
import java.util.Scanner;

public class Planete {
	private NomPlanete nom;
	private double poids;
	private double rayon;
	private static double constanteGravitationnelle = 6.67300*Math.pow(10, -11);
	private boolean atteri;
	
	
	public Planete() {
		super();
	}

	public Planete(NomPlanete nom, double poids, double rayon, boolean atteri) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.rayon = rayon;
		this.atteri = atteri;
	}

	
	public NomPlanete getNom() {
		return nom;
	}
	public void setNom(NomPlanete nom) {
		this.nom = nom;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public static double getConstanteGravitationnelle() {
		return constanteGravitationnelle;
	}
	public static void setConstanteGravitationnelle(double constanteGravitationnelle) {
		Planete.constanteGravitationnelle = constanteGravitationnelle;
	}
	public boolean isAtteri() {
		return atteri;
	}
	public void setAtteri(boolean atteri) {
		this.atteri = atteri;
	}
	
	public int gravite(double constanteGravitationelle, double poids, double rayon){
		int gravite = (int) Math.ceil((constanteGravitationelle*poids)/(1000*Math.pow(rayon, 2)));
		return gravite;
	}
	
	public void saisiePlanete(Scanner sc) {
		System.out.println("Entrez le nom de la planète : ");
		setNom(NomPlanete.valueOf(sc.next()));
		System.out.println("Entrez le poids en kilogrammes de la planète : ");
		setPoids(sc.nextDouble());
		System.out.println("Entrez le rayon en kilomètres de la planète : ");
		setRayon(sc.nextDouble());
		System.out.println("À-t-on déjà atteri sur cette planète ? ");
		setAtteri(sc.nextBoolean());
	}
	
	public String toString() {
		return "La planète "+getNom()+" dont le poids est "+getPoids()+" et le rayon est "+getRayon()+" a pour constante gravitationnelle "+getConstanteGravitationnelle()+", nous avons déjà atteri dessus : "+isAtteri();
	}
	
}
