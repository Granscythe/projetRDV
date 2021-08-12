package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Praticien extends Personne{

	
	private List<Specialite> specialites = new ArrayList<Specialite>();
	
	@OneToMany(mappedBy = "praticien")
	private List<Motif> motifs = new ArrayList<Motif>();
			
	@OneToMany(mappedBy = "praticien")
	private List<RDV> rdvs = new ArrayList<RDV>();
	


	@OneToMany(mappedBy = "praticien")
	private List<CreneauPraticien> creneauPraticien = new ArrayList<CreneauPraticien>();
	
	@OneToMany(mappedBy = "praticien")
	private List<PraticienLieu> praticienLieu = new ArrayList<PraticienLieu>();

	public Praticien() {
		super();
		
	}

	public Praticien(Long id, int version, String mail, String mdp) {
		super(id, version, mail, mdp);
		
	}

	public Praticien(Long id, int version, String mail, String mdp, List<Specialite> specialites, List<Motif> motifs, List<RDV> rdvs,
			List<CreneauPraticien> creneauPraticien, List<PraticienLieu> praticienLieu) {
		super(id, version, mail, mdp);
		this.specialites = specialites;
		this.motifs = motifs;
		this.rdvs = rdvs;
		this.creneauPraticien = creneauPraticien;
		this.praticienLieu = praticienLieu;
	}

	public List<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public List<Motif> getMotifs() {
		return motifs;
	}

	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}

	public List<RDV> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<RDV> rdvs) {
		this.rdvs = rdvs;
	}

	public List<CreneauPraticien> getCreneauPraticien() {
		return creneauPraticien;
	}

	public void setCreneauPraticien(List<CreneauPraticien> creneauPraticien) {
		this.creneauPraticien = creneauPraticien;
	}

	public List<PraticienLieu> getPraticienLieu() {
		return praticienLieu;
	}

	public void setPraticienLieu(List<PraticienLieu> praticienLieu) {
		this.praticienLieu = praticienLieu;
	}

	@Override
	public String toString() {
		return "Praticien [motifs=" + motifs + ", rdvs=" + rdvs + "]";
	}

	
		
}
