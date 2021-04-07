package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@Column(name="n_dossier_p")
	private String N_dossier_P;
	
	@Column(name="nom")
	private String Nom;
	
	@Column(name="prenom")
	private String Prenom;
	
	@Column(name="date_naissance")
	private String Date_Naissance;
	
	@Column(name="lieu_naissance")
	private String LieuNaissance;
	
	@Column(name="sexe")
	private String  Sexe;
	
	@Column(name="gouvernorat")
	private String Gouvernorat;
	
	@Column(name="adresse")
	private String Adresse;
	
	@Column(name="reperes")
	private String Reperes;
	
	@Column(name="tel")
	private String Tel;
	
	@Column(name="prenom_pere")
	private String PrenomPere;
	
	@Column(name="nom_mere")
	private String NomMere;
	
	@Column(name="prenom_mere")
	private String PrenomMere;
	
	@Column(name="nom_gmp")
	private String NomGMP;
	
	@Column(name="nom_gmm")
	private String NomGMM;
	
	@Column(name="age")
	private int Age;

	public Patient() {
	}

	public Patient(String nom, String prenom, String date_Naissance, String lieuNaissance, String sexe,
			String gouvernorat, String adresse, String reperes, String tel, String prenomPere, String nomMere,
			String prenomMere, String nomGMP, String nomGMM, int age) {
		Nom = nom;
		Prenom = prenom;
		Date_Naissance = date_Naissance;
		LieuNaissance = lieuNaissance;
		Sexe = sexe;
		Gouvernorat = gouvernorat;
		Adresse = adresse;
		Reperes = reperes;
		Tel = tel;
		PrenomPere = prenomPere;
		NomMere = nomMere;
		PrenomMere = prenomMere;
		NomGMP = nomGMP;
		NomGMM = nomGMM;
		Age = age;
	}

	public Patient(String n_dossier_P, String nom, String prenom, String date_Naissance, String lieuNaissance,
			String sexe, String gouvernorat, String adresse, String reperes, String tel, String prenomPere,
			String nomMere, String prenomMere, String nomGMP, String nomGMM, int age) {
		N_dossier_P = n_dossier_P;
		Nom = nom;
		Prenom = prenom;
		Date_Naissance = date_Naissance;
		LieuNaissance = lieuNaissance;
		Sexe = sexe;
		Gouvernorat = gouvernorat;
		Adresse = adresse;
		Reperes = reperes;
		Tel = tel;
		PrenomPere = prenomPere;
		NomMere = nomMere;
		PrenomMere = prenomMere;
		NomGMP = nomGMP;
		NomGMM = nomGMM;
		Age = age;
	}

	public String getN_dossier_P() {
		return N_dossier_P;
	}

	public void setN_dossier_P(String n_dossier_P) {
		N_dossier_P = n_dossier_P;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getDate_Naissance() {
		return Date_Naissance;
	}

	public void setDate_Naissance(String date_Naissance) {
		Date_Naissance = date_Naissance;
	}

	public String getLieuNaissance() {
		return LieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		LieuNaissance = lieuNaissance;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public String getGouvernorat() {
		return Gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		Gouvernorat = gouvernorat;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getReperes() {
		return Reperes;
	}

	public void setReperes(String reperes) {
		Reperes = reperes;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getPrenomPere() {
		return PrenomPere;
	}

	public void setPrenomPere(String prenomPere) {
		PrenomPere = prenomPere;
	}

	public String getNomMere() {
		return NomMere;
	}

	public void setNomMere(String nomMere) {
		NomMere = nomMere;
	}

	public String getPrenomMere() {
		return PrenomMere;
	}

	public void setPrenomMere(String prenomMere) {
		PrenomMere = prenomMere;
	}

	public String getNomGMP() {
		return NomGMP;
	}

	public void setNomGMP(String nomGMP) {
		NomGMP = nomGMP;
	}

	public String getNomGMM() {
		return NomGMM;
	}

	public void setNomGMM(String nomGMM) {
		NomGMM = nomGMM;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Patient [N_dossier_P=" + N_dossier_P + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Date_Naissance="
				+ Date_Naissance + ", LieuNaissance=" + LieuNaissance + ", Sexe=" + Sexe + ", Gouvernorat="
				+ Gouvernorat + ", Adresse=" + Adresse + ", Reperes=" + Reperes + ", Tel=" + Tel + ", PrenomPere="
				+ PrenomPere + ", NomMere=" + NomMere + ", PrenomMere=" + PrenomMere + ", NomGMP=" + NomGMP
				+ ", NomGMM=" + NomGMM + ", Age=" + Age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adresse == null) ? 0 : Adresse.hashCode());
		result = prime * result + Age;
		result = prime * result + ((Date_Naissance == null) ? 0 : Date_Naissance.hashCode());
		result = prime * result + ((Gouvernorat == null) ? 0 : Gouvernorat.hashCode());
		result = prime * result + ((LieuNaissance == null) ? 0 : LieuNaissance.hashCode());
		result = prime * result + ((N_dossier_P == null) ? 0 : N_dossier_P.hashCode());
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		result = prime * result + ((NomGMM == null) ? 0 : NomGMM.hashCode());
		result = prime * result + ((NomGMP == null) ? 0 : NomGMP.hashCode());
		result = prime * result + ((NomMere == null) ? 0 : NomMere.hashCode());
		result = prime * result + ((Prenom == null) ? 0 : Prenom.hashCode());
		result = prime * result + ((PrenomMere == null) ? 0 : PrenomMere.hashCode());
		result = prime * result + ((PrenomPere == null) ? 0 : PrenomPere.hashCode());
		result = prime * result + ((Reperes == null) ? 0 : Reperes.hashCode());
		result = prime * result + ((Sexe == null) ? 0 : Sexe.hashCode());
		result = prime * result + ((Tel == null) ? 0 : Tel.hashCode());
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
		if (Adresse == null) {
			if (other.Adresse != null)
				return false;
		} else if (!Adresse.equals(other.Adresse))
			return false;
		if (Age != other.Age)
			return false;
		if (Date_Naissance == null) {
			if (other.Date_Naissance != null)
				return false;
		} else if (!Date_Naissance.equals(other.Date_Naissance))
			return false;
		if (Gouvernorat == null) {
			if (other.Gouvernorat != null)
				return false;
		} else if (!Gouvernorat.equals(other.Gouvernorat))
			return false;
		if (LieuNaissance == null) {
			if (other.LieuNaissance != null)
				return false;
		} else if (!LieuNaissance.equals(other.LieuNaissance))
			return false;
		if (N_dossier_P == null) {
			if (other.N_dossier_P != null)
				return false;
		} else if (!N_dossier_P.equals(other.N_dossier_P))
			return false;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (NomGMM == null) {
			if (other.NomGMM != null)
				return false;
		} else if (!NomGMM.equals(other.NomGMM))
			return false;
		if (NomGMP == null) {
			if (other.NomGMP != null)
				return false;
		} else if (!NomGMP.equals(other.NomGMP))
			return false;
		if (NomMere == null) {
			if (other.NomMere != null)
				return false;
		} else if (!NomMere.equals(other.NomMere))
			return false;
		if (Prenom == null) {
			if (other.Prenom != null)
				return false;
		} else if (!Prenom.equals(other.Prenom))
			return false;
		if (PrenomMere == null) {
			if (other.PrenomMere != null)
				return false;
		} else if (!PrenomMere.equals(other.PrenomMere))
			return false;
		if (PrenomPere == null) {
			if (other.PrenomPere != null)
				return false;
		} else if (!PrenomPere.equals(other.PrenomPere))
			return false;
		if (Reperes == null) {
			if (other.Reperes != null)
				return false;
		} else if (!Reperes.equals(other.Reperes))
			return false;
		if (Sexe == null) {
			if (other.Sexe != null)
				return false;
		} else if (!Sexe.equals(other.Sexe))
			return false;
		if (Tel == null) {
			if (other.Tel != null)
				return false;
		} else if (!Tel.equals(other.Tel))
			return false;
		return true;
	}

	

	
	

}
