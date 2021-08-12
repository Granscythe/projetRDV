package sopra.formation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@DiscriminatorValue("CreneauUnitaire")
public class CreneauPraticien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Version
	private int version;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date de debut praticien")
	private Date dtDebutPraticien;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date de fin praticien")
	private Date dtFinPraticien;
	
	
	@ManyToOne
	@JoinColumn(name="Lieux")
	private Lieu lieu;
	
	@ManyToOne
	@JoinColumn(name="Praticien")
	private Praticien praticien;
	
	@OneToMany(mappedBy = "CreneauPraticien")
	private CreneauUnitaire creneauUnitaire;

	
	
	public CreneauPraticien() {
		super();
	}


	public CreneauPraticien(Long id, int version, Date dtDebutPraticien, Date dtFinPraticien, Lieu lieu,
			Praticien praticien, CreneauUnitaire creneauUnitaire) {
		this.id = id;
		this.version = version;
		this.dtDebutPraticien = dtDebutPraticien;
		this.dtFinPraticien = dtFinPraticien;
		this.lieu = lieu;
		this.praticien = praticien;
		this.creneauUnitaire = creneauUnitaire;
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


	public Date getDtDebutPraticien() {
		return dtDebutPraticien;
	}


	public void setDtDebutPraticien(Date dtDebutPraticien) {
		this.dtDebutPraticien = dtDebutPraticien;
	}


	public Date getDtFinPraticien() {
		return dtFinPraticien;
	}


	public void setDtFinPraticien(Date dtFinPraticien) {
		this.dtFinPraticien = dtFinPraticien;
	}


	public Lieu getLieu() {
		return lieu;
	}


	public void setLieux(Lieu lieu) {
		this.lieu = lieu;
	}


	public Praticien getPraticien() {
		return praticien;
	}


	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}


	public CreneauUnitaire getCreneauUnitaire() {
		return creneauUnitaire;
	}


	public void setCreneauUnitaire(CreneauUnitaire creneauUnitaire) {
		this.creneauUnitaire = creneauUnitaire;
	}


	@Override
	public String toString() {
		return "CreneauPraticien [id=" + id + ", version=" + version + ", dtDebutPraticien=" + dtDebutPraticien
				+ ", dtFinPraticien=" + dtFinPraticien + ", creneauUnitaire=" + creneauUnitaire + "]";
	}
		
}
