package Etudiant;
import java.util.ArrayList;
import java.util.Collections;

public class Promotion {
	private String nom;
	private int annee;
	private ArrayList<Etudiant> promotion = new ArrayList<>();

	public Promotion(String nom, int annee) {
		super();
		this.nom = nom;
		this.annee = annee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public ArrayList<Etudiant> getPromotion() {
		return (ArrayList<Etudiant>) Collections.unmodifiableList(promotion);
	}
	public Etudiant iemeEtudiant(int i) {
		if(i<0 || i>=promotion.size()) {
			System.out.println("Le nombre d'étudiant est soit négatif soit trop grand. ");
			return null;
		}
		return promotion.get(i);
	}
	public int nombreEtudiant() {
		return promotion.size();

	}
	public void inscrire(Etudiant e) {
		promotion.add(e);
	}
	public float moyenneGenerale() {
		float noteTotale = 0;
		for(Etudiant e : promotion) {
			noteTotale += e.moyenne();
		}
		return noteTotale/promotion.size();
	}
	public void afficheResultats() {
		for(Etudiant e : promotion) {
			System.out.println(e.getNom()+" a obtenu "+e.moyenne());
		}
	}
	public Etudiant recherche(String nom) {
		Etudiant e1 = null;
		for(Etudiant e : promotion) {
			if(e.getNom().equals(nom))
			{
				e1=e;
			}
		}
		if(e1==null) {
			System.out.println("Aucun étudiant du nom de "+ nom + " n'a été trouvé.");
		}
		return e1;
	}
	public ArrayList<Etudiant> admis() {
		ArrayList<Etudiant> a = new ArrayList<>();
		for (Etudiant e : promotion) {
			if(e.moyenne()>=10) {
				a.add(e);
			}
		}
		return a;
	}
	public ArrayList<Etudiant> etuEtrangerNomFranco() {
		ArrayList<Etudiant> a = new ArrayList<>();
		for (Etudiant e : promotion) {
			if(e.getNationalite()==Nationalite.ETRANGER_NON_FRANCOPHONE) {
				a.add(e);
			}
		}
		return a;
	}
	
	public ArrayList<Etudiant> majors(){
		float moyenneMax=0;
		ArrayList<Etudiant> major = new ArrayList<>();
		for(Etudiant e : promotion) {
			if(moyenneMax<e.moyenne()) {
				moyenneMax=e.moyenne();
			}
		}
		for(Etudiant e : promotion) {
			if(moyenneMax==e.moyenne()) {
				major.add(e);
			}
		}
		return major;
	}
	
	
}