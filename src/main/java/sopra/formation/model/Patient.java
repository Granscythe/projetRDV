package sopra.formation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Patient extends Personne{
	String numSecuriteSociale;
	@OneToMany(mappedBy="patient")
	private List<RDV> rdvs;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long id,  String mail, String mdp,String numSecuriteSociale, List<RDV> rdvs) {
		super(id, mail, mdp);
		this.numSecuriteSociale = numSecuriteSociale;
		this.rdvs = rdvs;
		// TODO Auto-generated constructor stub
	}

	public Patient(String numSecuriteSociale, List<RDV> rdvs) {
		this.numSecuriteSociale = numSecuriteSociale;
		this.rdvs = rdvs;
	}

	public String getNumSecuriteSociale() {
		return numSecuriteSociale;
	}

	public void setNumSecuriteSociale(String numSecuriteSociale) {
		this.numSecuriteSociale = numSecuriteSociale;
	}

	public List<RDV> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<RDV> rdvs) {
		this.rdvs = rdvs;
	}

	
}
