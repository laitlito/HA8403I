package Additifs;

import java.util.Scanner;

public class AdditifNaturel extends Additif{
	private String produitNaturel;
	private TypeOrigine origine;
	
	public AdditifNaturel() {
		super();
	}

	public AdditifNaturel(String produitNaturel, TypeOrigine origine) {
		super();
		this.produitNaturel = produitNaturel;
		this.origine = origine;
	}

	public String getProduitNaturel() {
		return produitNaturel;
	}
	public void setProduitNaturel(String porduitNaturel) {
		this.produitNaturel = porduitNaturel;
	}
	public TypeOrigine getOrigine() {
		return origine;
	}
	public void setOrigine(TypeOrigine origine) {
		this.origine = origine;
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
		System.out.println("De quel produit est-il extrait : ");
		setProduitNaturel(sc.next());
		System.out.println("De quel origine vient-il : ");
		setOrigine(TypeOrigine.valueOf(sc.next()));
	}
	
	public TypeRegime regime() {
		if(getOrigine()==TypeOrigine.animal) {
			return TypeRegime.général;
		}
		else if(getOrigine()==TypeOrigine.sousProduitAnimal) {
			return TypeRegime.végétarien;
		}
		else if(getOrigine()==TypeOrigine.végétal) {
			return TypeRegime.végétalien;
		}
		else 
			return TypeRegime.végétalien;
	}

	public String toStringNaturel() {
		return "AdditifNaturel [produitNaturel=" + produitNaturel + ", origine=" + origine + "]";
	}
	
	
	
}
