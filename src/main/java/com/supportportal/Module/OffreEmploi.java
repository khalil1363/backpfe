package com.supportportal.Module;

import java.sql.Date;

import javax.persistence.*;



@Entity
public class OffreEmploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffreEmploi;
    private String departement;
    private String jobTitre;
    private Date dateLancement;
    private int recrutement; 
    private String motifRecrutement;
    private String modeRecrutement; 
    private String status; 
    private Date dateEmbauche;
    private Double coutEmbauche; 
    private String duree; 
	public Long getIdOffreEmploi() {
		return idOffreEmploi;
	}
	public void setIdOffreEmploi(Long idOffreEmploi) {
		this.idOffreEmploi = idOffreEmploi;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getJobTitre() {
		return jobTitre;
	}
	public void setJobTitre(String jobTitre) {
		this.jobTitre = jobTitre;
	}
	public Date getDateLancement() {
		return dateLancement;
	}
	public void setDateLancement(Date dateLancement) {
		this.dateLancement = dateLancement;
	}
	public int getRecrutement() {
		return recrutement;
	}
	public void setRecrutement(int recrutement) {
		this.recrutement = recrutement;
	}
	public String getMotifRecrutement() {
		return motifRecrutement;
	}
	public void setMotifRecrutement(String motifRecrutement) {
		this.motifRecrutement = motifRecrutement;
	}
	public String getModeRecrutement() {
		return modeRecrutement;
	}
	public void setModeRecrutement(String modeRecrutement) {
		this.modeRecrutement = modeRecrutement;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Double getCoutEmbauche() {
		return coutEmbauche;
	}
	public void setCoutEmbauche(Double coutEmbauche) {
		this.coutEmbauche = coutEmbauche;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public OffreEmploi(Long idOffreEmploi, String departement, String jobTitre, Date dateLancement, int recrutement,
			String motifRecrutement, String modeRecrutement, String status, Date dateEmbauche, Double coutEmbauche,
			String duree) {
		super();
		this.idOffreEmploi = idOffreEmploi;
		this.departement = departement;
		this.jobTitre = jobTitre;
		this.dateLancement = dateLancement;
		this.recrutement = recrutement;
		this.motifRecrutement = motifRecrutement;
		this.modeRecrutement = modeRecrutement;
		this.status = status;
		this.dateEmbauche = dateEmbauche;
		this.coutEmbauche = coutEmbauche;
		this.duree = duree;
	}
	public OffreEmploi() {
		super();
		
	}

}