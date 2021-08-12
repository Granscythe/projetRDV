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
	private List<Patient> patients;
	
	public Patient() {
		super();
	}

	public Patient(Long id, int version, String numSecuriteSociale, List<Patient> patients) {
		super();
		this.id = id;
		this.version = version;
		this.numSecuriteSociale = numSecuriteSociale;
		this.patients = patients;
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

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
}
