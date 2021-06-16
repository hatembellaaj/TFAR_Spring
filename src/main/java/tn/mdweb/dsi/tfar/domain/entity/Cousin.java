package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import tn.mdweb.dsi.tfar.enumeration.PlaceCousin;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@Entity
@Table(name = "cousin")
public class Cousin {

	@EmbeddedId
	private CousinId cousinId;

	@Column(name = "nom", length = 50)
	private String nom;

	@Column(name = "prenom", length = 50)
	private String prenom;

	@Column(name = "place_cousin", length = 10)
	@Enumerated(EnumType.STRING)
	private PlaceCousin placeCousin;

	@Column(name = "sexe", length = 4)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;

	@ManyToOne(optional = false)
	@JoinColumn(name = "n_dossier_fiche", referencedColumnName = "n_dossier_fiche")
	private Fiche fiche;

	public Cousin() {
	}

	public Cousin(CousinId cousinId, String nom, String prenom, PlaceCousin placeCousin, Sexe sexe, Fiche fiche) {
		this.cousinId = cousinId;
		this.nom = nom;
		this.prenom = prenom;
		this.placeCousin = placeCousin;
		this.sexe = sexe;
		this.fiche = fiche;
	}

	public CousinId getCousinId() {
		return cousinId;
	}

	public void setCousinId(CousinId cousinId) {
		this.cousinId = cousinId;
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

	public PlaceCousin getPlaceCousin() {
		return placeCousin;
	}

	public void setPlaceCousin(PlaceCousin placeCousin) {
		this.placeCousin = placeCousin;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	@Override
	public String toString() {
		return "Cousin [cousinId=" + cousinId + ", nom=" + nom + ", prenom=" + prenom + ", placeCousin=" + placeCousin
				+ ", sexe=" + sexe + ", fiche=" + fiche + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cousinId == null) ? 0 : cousinId.hashCode());
		result = prime * result + ((fiche == null) ? 0 : fiche.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((placeCousin == null) ? 0 : placeCousin.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
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
		Cousin other = (Cousin) obj;
		if (cousinId == null) {
			if (other.cousinId != null)
				return false;
		} else if (!cousinId.equals(other.cousinId))
			return false;
		if (fiche == null) {
			if (other.fiche != null)
				return false;
		} else if (!fiche.equals(other.fiche))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (placeCousin != other.placeCousin)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (sexe != other.sexe)
			return false;
		return true;
	}

}
