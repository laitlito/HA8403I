package Additifs;
import java.util.Scanner;

public class Additif {
	private String nom;
	private String code;
	private TypeFonction fonction;
	private boolean autorise;

	public Additif() {
		super();
	}

	public Additif(String nom, String code, TypeFonction fonction, boolean autorise) {
		super();
		this.nom = nom;
		this.code = code;
		this.fonction = fonction;
		this.autorise = autorise;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public TypeFonction getFonction() {
		return fonction;
	}
	public void setFonction(TypeFonction fonction) {
		this.fonction = fonction;
	}
	public boolean isAutorise() {
		return autorise;
	}
	public void setAutorise(boolean autorise) {
		this.autorise = autorise;
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
	}

	public String toString() {
		return "Additif [nom=" + nom + ", code=" + code + ", fonction=" + fonction + ", autorise=" + autorise + "]";
	}
	
	
	
	
}
