package Additifs;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Additif a = new Additif();
		Additif an = new AdditifNaturel();
		Additif as = new AdditifSynthese();
		
		a.saisie(sc);
		System.out.println(a.toString());
		
		an.saisie(sc);
		System.out.println(an.toString());
		
		as.saisie(sc);
		System.out.println(as.toString());
	}
}
