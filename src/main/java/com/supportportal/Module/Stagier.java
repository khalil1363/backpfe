package com.supportportal.Module;

import javax.persistence.*;

@Entity
public class Stagier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStagier;
    private String nomPrenom;
    private String institut;
    private String diplome;
    private String specialite;
    private String cin;
    private String tel;
	public Long getIdStagier() {
		return idStagier;
	}
	public void setIdStagier(Long idStagier) {
		this.idStagier = idStagier;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getInstitut() {
		return institut;
	}
	public void setInstitut(String institut) {
		this.institut = institut;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Stagier(Long idStagier, String nomPrenom, String institut, String diplome, String specialite, String cin,
			String tel) {
		super();
		this.idStagier = idStagier;
		this.nomPrenom = nomPrenom;
		this.institut = institut;
		this.diplome = diplome;
		this.specialite = specialite;
		this.cin = cin;
		this.tel = tel;
	}
	public Stagier() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}