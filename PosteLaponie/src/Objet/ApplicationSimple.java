package Objet;
import java.util.Scanner;
public class ApplicationSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lettre lettre1 = new Lettre();
		Colis colis1 = new Colis();
		ColisExpress colisexpress1 = new ColisExpress();
		
		System.out.println("Entrez le type d'objet : Lettre, Colis ou ColisExpress");
		switch(sc.nextLine()) 
		{
			case "Lettre" : 
				lettre1.saisieLettre(sc);
				System.out.println(lettre1.toStringLettre());
				break;
			
			case "Colis" : 
				colis1.saisieColis(sc);
				System.out.println(colis1.toStringColis());
				break;
			
			case "Colis Express" :
				colisexpress1.saisieColisExpress(sc);
				System.out.println(colisexpress1.toStringColisExpress());
				break;
		}
		
	}
}