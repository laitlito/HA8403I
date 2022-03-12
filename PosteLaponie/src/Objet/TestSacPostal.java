package Objet;
import java.util.Scanner;

public class TestSacPostal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Objet o1 = new Objet(Origine.FRANCE, Destination.FRANCE, 47310, 30, 5, 2);
		//System.out.println(o1.toString());
		
		Objet o2 = new Objet(Origine.FINLANDE, Destination.FRANCE, 33000, 20, 3, 1);
		//System.out.println(o2.toString());
		
		Objet o3 = new Objet(Origine.JAPON, Destination.CHINE, 34000, 1, 10, 1);
		//System.out.println(o3.toString());
			
		SacPostal s = new SacPostal(50);
		
		System.out.println(s.toString());
		
		s.ajouterObjet(o1);
		System.out.println(s.toString());
		s.ajouterObjet(o2);
		s.ajouterObjet(o3);
		System.out.println(s.toString());
		s.nouveauSac();
		System.out.println(s.toString());
		
			
			
			
	}
}
