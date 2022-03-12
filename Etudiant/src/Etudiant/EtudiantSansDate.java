package Etudiant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EtudiantSansDate {
	/* ATTRIBUTS */
	/* ========= */
	private String name; // nom de l'étudiant
	private int anneeNaissance; // année de naissance (au moins 5 ans avant la date courante)
	private int age; // age de l'étudiant (calculé à partir de année de naissance)
	private boolean codeIns; // true if première inscription, false si réinscription
	private Nationalite codePays; // français, étranger francophone, étranger non phrancophone
	private Examen examenMaths; // examen en mathématiques
	private Examen examenInformatique; // examen en informatique
	private Examen examenBiologie; // examen en biologie
	
	/* CONSTRUCTORS */
	/* ============ */
	// Constructeur par défaut
	public EtudiantSansDate() {
		name = "inconnu"; // valeur par défaut
		setAnneeNaissance(LocalDateTime.now().getYear() + 10);
		age = -1; // valeur par défaut
		codePays = Nationalite.INCONNU; // valeur par défaut
		examenMaths = new Examen(); // constructeur par défaut pour avoir une valeur par défaut
		examenInformatique = new Examen(); // idem
		examenBiologie = new Examen(); // idem
	}

	// Constructeur paramétré
	public EtudiantSansDate(String name, int anneeNaissance, boolean codeIns, Nationalite codePays) {
		this.name = name;
		setAnneeNaissance(anneeNaissance);
		this.codeIns = codeIns;
		this.codePays = codePays;
		examenMaths = new Examen(); // constructeur par défaut pour avoir une valeur par défaut
		examenInformatique = new Examen(); // idem
		examenBiologie = new Examen(); // idem
	}
	
	/* METHODS */
	/* ======= */
	// Getters & Setters
	// getter de name
	public String getName() {
		return name;
	}
	
	// setter de name
	public void setName(String name) {
		this.name = name;
	}
	
	// getter de age
	public int getAge() {
		return age;
	}
	
	// pas de setter de age, parce que age est calculé
	// lorsque l'utilisateur indique son année de naissance

	// getter de dateNaissance
	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	// setter de dateNaissance
	// puis calcul de age
	public void setAnneeNaissance(int anneeNaissance) {
		// récupérer l'année actuelle
		int year = LocalDate.now().getYear();
		
		if (anneeNaissance > 0 && year >= anneeNaissance + 5) {
			this.anneeNaissance = anneeNaissance;
			
			// soustraction entre l'année actuelle et l'année de naissance
			age = year - anneeNaissance;
		}
	}

	// getter de codeIns (ici on aurait dû trouver un meilleur nom pour notre attribut)
	public boolean isCodeIns() {
		return this.codeIns;
	}

	// setter de codeIns
	public void setCodeIns(boolean codeIns) {
		this.codeIns = codeIns;
	}

	// getter de codePays
	public Nationalite getCodePays() {
		return codePays;
	}

	// setter de codePays
	public void setCodePays(Nationalite codePays) {
		this.codePays = codePays;
	}

	// getter de Examen en mathématiques
	public Examen getExamenMaths() {
		return examenMaths;
	}

	// setter de Examen en mathématiques
	public void setExamenMaths(Examen examenMaths) {
		this.examenMaths = examenMaths;
	}

	// getter de Examen en informatique
	public Examen getExamenInformatique() {
		return examenInformatique;
	}

	// setter de Examen en informatique
	public void setExamenInformatique(Examen examenInformatique) {
		this.examenInformatique = examenInformatique;
	}

	// getter de Examen en biologie
	public Examen getExamenBiologie() {
		return examenBiologie;
	}

	// setter de Examen en biologie
	public void setExamenBiologie(Examen examenBiologie) {
		this.examenBiologie = examenBiologie;
	}
	
	// Saisie
	/*
	 * Saisie des notes pour tous les examens
	 * puis mis à jour des examens
	 */
	public void saisieNotes(Scanner scanner) {
		double maths = getNote(scanner, "Mathématiques");
		double info = getNote(scanner, "Informatique");
		double bio = getNote(scanner, "Biologie");
		miseAJourNotes(maths, info, bio);
	}
	
	// Méthode privée : Retourne la note d'une matière donnée
	private double getNote(Scanner scanner, String matiere) {
		return getDouble(scanner, "Veuillez saisir votre note en " + matiere);
	}
	
	// Méthode privée : mise à jours des notes de l'étudiant
	private void miseAJourNotes(double maths, double info, double bio) {
		examenMaths.setNote(maths);
		examenInformatique.setNote(info);
		examenBiologie.setNote(bio);
	}
	
	// Saisie tous les attributs d'un étudiant
	public void saisieAttributs(Scanner scanner) {
		System.out.println("Veuillez remplir vos informations :");
		name = getString(scanner, "Nom :");
		
		// Cette instruction est incomplète
		// dateNaissance = getLocalDate(scanner, "dd/MM/uuuu", "Date de naissance :");
		
		// (il faut recalculer l'attribut age)
		// il vaut mieux alors appeler la méthode
		// setDateNaissance() sur l'objet
		// retourné par la méthode getLocalDate()
		setAnneeNaissance(getInteger(scanner, "Année de naissance :"));
		codeIns = getBoolean(scanner, "C'est votre première inscription ?");
		codePays = getNationalite(scanner, "Nationalité :");
		
		examenMaths = getExamen(scanner, "Mathématiques");
		examenInformatique = getExamen(scanner, "Informatique");
		examenBiologie = getExamen(scanner, "Biologie");
	}
	
	/*
	 * Méthode privée : Affiche un message à l'utilisateur
	 * et retourne le string qu'il a saisit
	 */
	private String getString(Scanner scanner, String message) {
		System.out.println(message);
		System.out.println("Veuillez entrer un String :");
		String value = scanner.next();
		
		return value;
	}
	
	/*
	 * Méthode privée : Affiche un message à l'utilisateur
	 * et retourne l'entier qu'il a saisit
	 */
	private int getInteger(Scanner scanner, String message) {
		System.out.println(message);
		System.out.println("Veuillez entrer un entier :");
		int value = scanner.nextInt();
		
		return value;
	}
	
	/*
	 * Méthode privée : Affiche un message à l'utilisateur
	 * et retourne le réel qu'il a saisit
	 */
	private double getDouble(Scanner scanner, String message) {
		System.out.println(message);
		System.out.println("Veuillez entrer un réel :");
		double value = scanner.nextDouble();
		
		return value;
	}
	
	/*
	 * Méthode privée : Affiche un message à l'utilisateur
	 * et retourne le booléen qu'il a saisit
	 */
	private boolean getBoolean(Scanner scanner, String message) {
		System.out.println(message);
		System.out.println("Saisir 1 si vrai, 0 sinon");
		int intValue = scanner.nextInt(); 
		
		boolean value = (intValue == 1)? true : false;
		
		return value;
	}
	
	/*
	 * Méthode privée : Affiche un message à l'utilisateur
	 * et retourne la nationalité qu'il a saisit
	 */
	private Nationalite getNationalite(Scanner scanner, String message) {
		System.out.println(message);
		System.out.println("Veuillez saisir une des valeurs suivantes :");
		System.out.println("1. Français");
		System.out.println("2. Etranger francophone");
		System.out.println("3. Etranger non francophone");
		System.out.println();
		int value = scanner.nextInt();
		
		if (value == 1)
			return Nationalite.FRANCAIS;
		else if (value == 2)
			return Nationalite.ETRANGER_FRANCOPHONE;
		else if (value == 3)
			return Nationalite.ETRANGER_NON_FRANCOPHONE;
		else
			return Nationalite.INCONNU;
	}
	
	/*
	 * Méthode privée : Demande à l'utilisateur de saisir une note (réel)
	 * pour la matière passée en paramètre,
	 * puis crée une instance de la classe Examen
	 * avec la note saisie et la matière passée en paramètre
	 */
	private Examen getExamen(Scanner scanner, String matiere) {
		double note = getNote(scanner, matiere);
		return new Examen(note, matiere);
	}
	
	/*
	 * Retourne la moyenne des notes des examens
	 */
	public double moyenne() {
		return (examenMaths.getNote() 
				+ examenInformatique.getNote() 
				+ examenBiologie.getNote()) / 3 ;
	}
	
	/*
	 * Retourne la mention de l'étudiant
	 * "passable" si 10 <= moyenne <12
	 * "assez bien" si 12 <= moyenne < 14
	 * "bien" si 14 <= moyenne < 16
	 * "très bien" 16 <= très bien < 18
	 * "excellent" 18 <= moyenne < 20
	 */
	public String mention() {
		double moyenne = moyenne();
		String mention = "";
		
		if (0 <= moyenne && moyenne < 10)
			mention = "Echéc";
		else if (10 <= moyenne && moyenne < 12)
			mention = "Passable";
		else if (12 <= moyenne && moyenne < 14)
			mention = "Assez bien";
		else if (14 <= moyenne && moyenne < 16)
			mention = "Bien";
		else if (16 <= moyenne && moyenne < 18)
			mention = "Très bien";
		else
			mention = "Excellent";
		
		return mention;
	}
	
	/*
	 * Retourne la présentation suivante :
	 * Nom : <name>
	 * Moyenne : <moyenne()>
	 * Mention : <mention()>
	 * si l'étudiant est ajourné alors on affiche :
	 * Modules :
	 * 	(Matière : <matiere>, Note : <note>) pour chaque
	 * 	examen validé (dont la note est >= moyenne)
	 */
	public String ligneResultats() {
		double moyenne = moyenne();
		String mention = mention();
		String ligne = "Nom : " + name;
		ligne += "\nAge : " + age; // ligne = ligne + "nouvelle valeur"
		ligne += "\nMoyenne : " + moyenne;
		ligne += "\nMention : " + mention;
		if (moyenne >= 10) {
			ligne += "\nMatières :";
			if (examenMaths.getNote() >= 10)
				ligne += "\n\tMathématiques : " + examenMaths.getNote();
			if (examenInformatique.getNote() >= 10)
				ligne += "\n\tInformatique : " + examenInformatique.getNote();
			if (examenBiologie.getNote() >= 10)
				ligne += "\n\tBiologie : " + examenBiologie.getNote();
		}
		
		return ligne;
	}
	
	// toString
	@Override
	public String toString() {
		return ligneResultats();
	}
}