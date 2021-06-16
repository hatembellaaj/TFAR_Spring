package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import tn.mdweb.dsi.tfar.enumeration.Atteint;
import tn.mdweb.dsi.tfar.enumeration.PlaceFraterie;
import tn.mdweb.dsi.tfar.enumeration.Sexe;
import tn.mdweb.dsi.tfar.enumeration.Decedes;

@Entity
@Table(name = "frere")
public class Frere {

	@EmbeddedId
	private FrereId frereId;

	@Column(name = "nom", length = 50)
	private String nom;

	@Column(name = "prenom", length = 50)
	private String prenom;

	@Column(name = "atteint", length = 5)
	@Enumerated(EnumType.STRING)
	private Atteint atteint;

	@Column(name = "place_fratrie", length = 12)
	@Enumerated(EnumType.STRING)
	private PlaceFraterie placeFratrie;

	@Column(name = "sexe", length = 4)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;

	@Column(name = "decedes", length = 5)
	@Enumerated(EnumType.STRING)
	private Decedes decedes;

	@Column(name = "age")
	private Long age;

	@ManyToOne(optional = false)
	@JoinColumn(name = "n_dossier_fiche", referencedColumnName = "n_dossier_fiche")
	private Fiche fiche;

	public Frere() {
	}

	public Frere(FrereId frereId, String nom, String prenom, Atteint atteint, PlaceFraterie placeFratrie, Sexe sexe,
			Decedes decedes, Long age, Fiche fiche) {
		this.frereId = frereId;
		this.nom = nom;
		this.prenom = prenom;
		this.atteint = atteint;
		this.placeFratrie = placeFratrie;
		this.sexe = sexe;
		this.decedes = decedes;
		this.age = age;
		this.fiche = fiche;
	}

	public FrereId getFrereId() {
		return frereId;
	}

	public void setFrereId(FrereId frereId) {
		this.frereId = frereId;
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

	public Atteint getAtteint() {
		return atteint;
	}

	public void setAtteint(Atteint atteint) {
		this.atteint = atteint;
	}

	public PlaceFraterie getPlaceFratrie() {
		return placeFratrie;
	}

	public void setPlaceFratrie(PlaceFraterie placeFratrie) {
		this.placeFratrie = placeFratrie;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Decedes getDecedes() {
		return decedes;
	}

	public void setDecedes(Decedes decedes) {
		this.decedes = decedes;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	@Override
	public String toString() {
		return "Frere [frereId=" + frereId + ", nom=" + nom + ", prenom=" + prenom + ", atteint=" + atteint
				+ ", placeFratrie=" + placeFratrie + ", sexe=" + sexe + ", decedes=" + decedes + ", age=" + age
				+ ", fiche=" + fiche + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((atteint == null) ? 0 : atteint.hashCode());
		result = prime * result + ((decedes == null) ? 0 : decedes.hashCode());
		result = prime * result + ((fiche == null) ? 0 : fiche.hashCode());
		result = prime * result + ((frereId == null) ? 0 : frereId.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((placeFratrie == null) ? 0 : placeFratrie.hashCode());
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
		Frere other = (Frere) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (atteint != other.atteint)
			return false;
		if (decedes != other.decedes)
			return false;
		if (fiche == null) {
			if (other.fiche != null)
				return false;
		} else if (!fiche.equals(other.fiche))
			return false;
		if (frereId == null) {
			if (other.frereId != null)
				return false;
		} else if (!frereId.equals(other.frereId))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (placeFratrie != other.placeFratrie)
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
