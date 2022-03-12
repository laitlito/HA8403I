package Planete;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Planete planete1 = new Planete();

		planete1.saisiePlanete(sc);
		System.out.println(planete1.toString());
		
	}
}