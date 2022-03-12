package Etudiant;
import java.util.Scanner;

public class TestPromotion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Etudiant e1 = new Etudiant("Marie", 1998, Nationalite.FRANCAIS,18, 18, 18);
		System.out.println(e1.toString());
		
		Etudiant e2 = new Etudiant("Jeanne", 1998, Nationalite.FRANCAIS,14, 9, 16);
		System.out.println(e2.toString());
		
		Etudiant e3 = new Etudiant("Sylvie", 1998, Nationalite.FRANCAIS,7, 9, 10);
		System.out.println(e3.toString());
		
		Etudiant e4 = new Etudiant("Esther", 1998, Nationalite.FRANCAIS,7, 9, 5);
		System.out.println(e4.toString());
		
		
		Etudiant e5 = new Etudiant("Astrid", 1998, Nationalite.FRANCAIS,10, 10, 0);
		System.out.println(e5.toString());
		
		Etudiant e6 = new Etudiant("Mohamed", 1998, Nationalite.ETRANGER_NON_FRANCOPHONE,18, 18, 18);
		System.out.println(e6.toString());
		
		Etudiant e7 = new Etudiant("Bjorg", 1998, Nationalite.ETRANGER_NON_FRANCOPHONE,18, 18, 18);
		System.out.println(e7.toString());
		
		
		Promotion p = new Promotion("groupe PEIP",2022);
		p.inscrire(e1);
		p.inscrire(e2);
		p.inscrire(e3);
		p.inscrire(e4);
		p.inscrire(e5);
		p.inscrire(e6);
		p.inscrire(e7);
		System.out.println(p.moyenneGenerale());
		p.afficheResultats();
		System.out.println(p.recherche(sc.next()));
		System.out.println(p.etuEtrangerNomFranco());
		System.out.println(p.majors());
	}
	
		
}