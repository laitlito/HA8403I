package Etudiant;

public class Etudiant {
	private String nom;
	private int dateNaissance;
	private Nationalite nationalite;
	private float note1,note2,note3;
	
	
	public Etudiant(String nom, int dateNaissance, Nationalite nationalite, float note1, float note2, float note3) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public Nationalite getNationalite() {
		return nationalite;
	}


	public void setNationalite(Nationalite nationalite) {
		this.nationalite = nationalite;
	}


	public float getNote1() {
		return note1;
	}


	public void setNote1(float note1) {
		this.note1 = note1;
	}


	public float getNote2() {
		return note2;
	}


	public void setNote2(float note2) {
		this.note2 = note2;
	}


	public float getNote3() {
		return note3;
	}


	public void setNote3(float note3) {
		this.note3 = note3;
	}
	
	public float moyenne() {
		return (note1+note2+note3)/3;
	}


	public String toString() {
		return "Etudiant [nom=" + nom + ", dateNaissance=" + dateNaissance + ", nationalite=" + nationalite + ", note1="
				+ note1 + ", note2=" + note2 + ", note3=" + note3 + "]";
	}
	
	
	
	
}