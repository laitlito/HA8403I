package Additifs;

import java.util.Scanner;

public class AdditifSynthese extends Additif{
	private String strategie;

	public AdditifSynthese() {
		super();
	}

	public AdditifSynthese(String strategie) {
		super();
		this.strategie = strategie;
	}

	public String getStrategie() {
		return strategie;
	}
	public void setStrategie(String strategie) {
		this.strategie = strategie;
	}

	public void saisie(Scanner sc) {
		System.out.println("Entrez le nom de l'additif : ");
		setNom(sc.next());
		System.out.println("Entrez le code : ");
		setCode(sc.next());
		System.out.println("Entrez la fonction de l'additif : ");
		setFonction(TypeFonction.valueOf(sc.next()));
		System.out.println("L'additif est-il autorisé en France : ");
		setAutorise(sc.nextBoolean());
		System.out.println("Entrez la stratégie : ");
		setStrategie(sc.next());
	}
	
	public TypeRegime regime() {
		return TypeRegime.général;
	}

	public String toString() {
		return "AdditifSynthese [strategie=" + strategie + "]";
	}
	
	
	
}
