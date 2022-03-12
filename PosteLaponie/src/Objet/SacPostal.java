package Objet;

import java.util.ArrayList;
import java.util.Collections;

public class SacPostal {
	private double capaciteSac=50;
	private ArrayList<Objet> sac = new ArrayList<>();

	public SacPostal(double capaciteSac) {
		super();
		this.capaciteSac = capaciteSac;
	}

	public double getCapaciteSac() {
		return capaciteSac;
	}
	public void setCapaciteSac(double capaciteSac) {
		this.capaciteSac = capaciteSac;
	}
	public ArrayList<Objet> getSac() {
		return (ArrayList<Objet>) Collections.unmodifiableList(sac);
	}

	public void ajouterObjet(Objet o) {
		if(o.getVolume()<getCapaciteSac()-0.05) {
			sac.add(o);
			setCapaciteSac(getCapaciteSac()-o.getVolume());
		}
		else
			System.out.println("L'objet est trop volumineux pour entrer dans le sac");
	}

	public ArrayList<Objet> nouveauSac(){    //marche pas
		int code=0;
		ArrayList<Objet> on = new ArrayList<>();
		for(Objet o : sac) {
			if(code<o.getCodePostal()) {
				code=o.getCodePostal();			
			}
		}
		for(Objet o : sac) {
			if(code == o.getCodePostal()) {
				on.add(o);
			}
		}
		return on;	
	}

	public String toString1() {
		return "SacPostal [capaciteSac=" + getCapaciteSac()+ " ]";
	}

	@Override
	public String toString() {
		return "SacPostal [capaciteSac=" + capaciteSac + ", sac=" + sac ;
	}
	
	

	
	



}
