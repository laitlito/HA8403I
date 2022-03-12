package Objet;


public class Objet{
	private Origine origine;
	private Destination destination;
	private int codePostal;
	private float poids;
	private float volume;
	private int tauxRecommendation;
	
	public Objet() {
		super();
	}

	public Objet(Origine origine, Destination destination, int codePostal, float poids, float volume, int tauxRecommendation) 
	{
		super();
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codePostal;
		this.poids = poids;
		this.volume = volume;
		this.tauxRecommendation = tauxRecommendation;
	}

	public Origine getOrigine() {
		return origine;
	}
	public void setOrigine(Origine origine) {
		this.origine = origine;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public int getTauxRecommendation() {
		return tauxRecommendation;
	}


	public String toString() {
		return "Objet [origine=" + origine + ", destination=" + destination + ", codePostal=" + codePostal + ", poids="
				+ poids + ", volume=" + volume + ", tauxRecommendation=" + tauxRecommendation + "]";
	}

	
	
	
	
}
