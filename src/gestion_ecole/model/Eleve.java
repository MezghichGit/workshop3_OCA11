package gestion_ecole.model;

import java.util.Date;
import java.util.Objects;

public class Eleve {
	
	String nom; //null
	String prenom;
	int age; //0
	Date dateNaissance; //null
	double poids; //0.0
	double taille;
	String observation;
	
	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateNaissance=" + dateNaissance
				+ ", poids=" + poids + ", taille=" + taille + ", observation=" + observation + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Eleve other = (Eleve) obj;
		return 
				this.age == other.age && Objects.equals(this.nom, other.nom) && Objects.equals(this.prenom, other.prenom);
	}



	public Eleve(String nom, String prenom, int age, Date dateNaissance, double poids, double taille,
			String observation) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateNaissance = dateNaissance;
		this.poids = poids;
		this.taille = taille;
		this.observation = observation;
	}
	

}
