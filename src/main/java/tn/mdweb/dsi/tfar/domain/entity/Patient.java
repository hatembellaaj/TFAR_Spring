package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@Entity
@Table(name = "patient")
public class Patient {

	@EmbeddedId
	private PatientId patientId;

	@Column(name = "nom", length = 50)
	private String nom;

	@Column(name = "prenom", length = 50)
	private String prenom;

	@Column(name = "sexe", length = 4)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;

	@Column(name = "date_naissance")
	private String dateNaissance;

	@Column(name = "lieu_naissance")
	private String lieuNaissance;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "reperes")
	private String reperes;

	@Column(name = "gouvernorat")
	@Enumerated(EnumType.STRING)
	private Gouvernorat gouvernorat;

	@Column(name = "tel")
	private String tel;

	@Column(name = "prenom_pere")
	private String prenomPere;

	@Column(name = "nom_mere")
	private String nomMere;

	@Column(name = "prenom_mere")
	private String prenomMere;

	@Column(name = "nom_gmp")
	private String nomGmp;

	@Column(name = "nom_gmm")
	private String nomGmm;

	@Column(name = "age")
	private int age;

	public Patient() {
	}

	public Patient(PatientId patientId, String nom, String prenom, Sexe sexe, String dateNaissance,
			String lieuNaissance, String adresse, String reperes, Gouvernorat gouvernorat, String tel,
			String prenomPere, String nomMere, String prenomMere, String nomGmp, String nomGmm, int age) {
		this.patientId = patientId;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.adresse = adresse;
		this.reperes = reperes;
		this.gouvernorat = gouvernorat;
		this.tel = tel;
		this.prenomPere = prenomPere;
		this.nomMere = nomMere;
		this.prenomMere = prenomMere;
		this.nomGmp = nomGmp;
		this.nomGmm = nomGmm;
		this.age = age;
	}

	public PatientId getPatientId() {
		return patientId;
	}

	public void setPatientId(PatientId patientId) {
		this.patientId = patientId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getReperes() {
		return reperes;
	}

	public void setReperes(String reperes) {
		this.reperes = reperes;
	}

	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPrenomPere() {
		return prenomPere;
	}

	public void setPrenomPere(String prenomPere) {
		this.prenomPere = prenomPere;
	}

	public String getNomMere() {
		return nomMere;
	}

	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}

	public String getPrenomMere() {
		return prenomMere;
	}

	public void setPrenomMere(String prenomMere) {
		this.prenomMere = prenomMere;
	}

	public String getNomGmp() {
		return nomGmp;
	}

	public void setNomGmp(String nomGmp) {
		this.nomGmp = nomGmp;
	}

	public String getNomGmm() {
		return nomGmm;
	}

	public void setNomGmm(String nomGmm) {
		this.nomGmm = nomGmm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
				+ ", dateNaissance=" + dateNaissance + ", lieuNaissance=" + lieuNaissance + ", adresse=" + adresse
				+ ", reperes=" + reperes + ", gouvernorat=" + gouvernorat + ", tel=" + tel + ", prenomPere="
				+ prenomPere + ", nomMere=" + nomMere + ", prenomMere=" + prenomMere + ", nomGmp=" + nomGmp
				+ ", nomGmm=" + nomGmm + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + age;
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((gouvernorat == null) ? 0 : gouvernorat.hashCode());
		result = prime * result + ((lieuNaissance == null) ? 0 : lieuNaissance.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((nomGmm == null) ? 0 : nomGmm.hashCode());
		result = prime * result + ((nomGmp == null) ? 0 : nomGmp.hashCode());
		result = prime * result + ((nomMere == null) ? 0 : nomMere.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((prenomMere == null) ? 0 : prenomMere.hashCode());
		result = prime * result + ((prenomPere == null) ? 0 : prenomPere.hashCode());
		result = prime * result + ((reperes == null) ? 0 : reperes.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (age != other.age)
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (gouvernorat != other.gouvernorat)
			return false;
		if (lieuNaissance == null) {
			if (other.lieuNaissance != null)
				return false;
		} else if (!lieuNaissance.equals(other.lieuNaissance))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (nomGmm == null) {
			if (other.nomGmm != null)
				return false;
		} else if (!nomGmm.equals(other.nomGmm))
			return false;
		if (nomGmp == null) {
			if (other.nomGmp != null)
				return false;
		} else if (!nomGmp.equals(other.nomGmp))
			return false;
		if (nomMere == null) {
			if (other.nomMere != null)
				return false;
		} else if (!nomMere.equals(other.nomMere))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (prenomMere == null) {
			if (other.prenomMere != null)
				return false;
		} else if (!prenomMere.equals(other.prenomMere))
			return false;
		if (prenomPere == null) {
			if (other.prenomPere != null)
				return false;
		} else if (!prenomPere.equals(other.prenomPere))
			return false;
		if (reperes == null) {
			if (other.reperes != null)
				return false;
		} else if (!reperes.equals(other.reperes))
			return false;
		if (sexe != other.sexe)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}

}
