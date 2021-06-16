package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import tn.mdweb.dsi.tfar.enumeration.Mois;
import tn.mdweb.dsi.tfar.enumeration.Reponse;

@Entity
@Table(name = "androgene")
public class Androgene {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "mois", length = 15)
	@Enumerated(EnumType.STRING)
	private Mois mois;

	@Column(name = "reponse")
	@Enumerated(EnumType.STRING)
	private Reponse reponse;

	@ManyToOne(optional = false)
	@JoinColumn(name = "n_dossier_fiche", referencedColumnName = "n_dossier_fiche")
	private Fiche fiche;

	public Androgene() {
	}

	public Androgene(Long id, @NotNull Mois mois, Reponse reponse, Fiche fiche) {
		this.id = id;
		this.mois = mois;
		this.reponse = reponse;
		this.fiche = fiche;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mois getMois() {
		return mois;
	}

	public void setMois(Mois mois) {
		this.mois = mois;
	}

	public Reponse getReponse() {
		return reponse;
	}

	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	@Override
	public String toString() {
		return "Androgene [id=" + id + ", mois=" + mois + ", reponse=" + reponse + ", fiche=" + fiche + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fiche == null) ? 0 : fiche.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mois == null) ? 0 : mois.hashCode());
		result = prime * result + ((reponse == null) ? 0 : reponse.hashCode());
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
		Androgene other = (Androgene) obj;
		if (fiche == null) {
			if (other.fiche != null)
				return false;
		} else if (!fiche.equals(other.fiche))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mois != other.mois)
			return false;
		if (reponse != other.reponse)
			return false;
		return true;
	}

}
