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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	String numSecuriteSociale;
	@OneToMany(mappedBy="patient")
	private List<RDV> RDVS;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long id, int version, String mail, String mdp) {
		super(id, version, mail, mdp);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNumSecuriteSociale() {
		return numSecuriteSociale;
	}

	public void setNumSecuriteSociale(String numSecuriteSociale) {
		this.numSecuriteSociale = numSecuriteSociale;
	}

	public List<RDV> getRDVS() {
		return RDVS;
	}

	public void setRDVS(List<RDV> rDVS) {
		RDVS = rDVS;
	}


}
