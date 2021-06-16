package tn.mdweb.dsi.tfar.domain.entity;

import java.util.Date;

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

import tn.mdweb.dsi.tfar.enumeration.AgentPortant;
import tn.mdweb.dsi.tfar.enumeration.IR;
import tn.mdweb.dsi.tfar.enumeration.Instabilite;
import tn.mdweb.dsi.tfar.enumeration.Lymphocytes;

@Entity
@Table(name = "cytogenetique")
public class Cytogenetique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "n_etude_cyto")
	private Long nEtudeCyto;

	@Column(name = "lymphocytes", length = 10)
	@Enumerated(EnumType.STRING)
	private Lymphocytes lymphocytes;

	@Column(name = "date_sang")
	private Date dateSang;

	@Column(name = "agent_portant", length = 5)
	@Enumerated(EnumType.STRING)
	private AgentPortant agentPortant;

	@Column(name = "instabilite", length = 5)
	@Enumerated(EnumType.STRING)
	private Instabilite instabilite;

	@Column(name = "instabilite_pourcentage")
	private Double instabilitePourcentage;

	@Column(name = "ir", length = 5)
	@Enumerated(EnumType.STRING)
	private IR ir;

	@Column(name = "ir_pourcentage")
	private Double irPourcentage;

	@Column(name = "moelle")
	private String moelle;

	@Column(name = "date_moelle")
	private Date dateMoelle;

	@Column(name = "resultat_moelle")
	private String resultatMoelle;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_laboratoire", referencedColumnName = "id")
	private Laboratoire laboratoire;

	@ManyToOne(optional = false)
	@JoinColumn(name = "n_dossier_fiche", referencedColumnName = "n_dossier_fiche")
	private Fiche fiche;

	public Cytogenetique() {
	}

	public Cytogenetique(Long nEtudeCyto, Lymphocytes lymphocytes, Date dateSang, AgentPortant agentPortant,
			Instabilite instabilite, Double instabilitePourcentage, IR ir, Double irPourcentage, String moelle,
			Date dateMoelle, String resultatMoelle, Laboratoire laboratoire, Fiche fiche) {
		this.nEtudeCyto = nEtudeCyto;
		this.lymphocytes = lymphocytes;
		this.dateSang = dateSang;
		this.agentPortant = agentPortant;
		this.instabilite = instabilite;
		this.instabilitePourcentage = instabilitePourcentage;
		this.ir = ir;
		this.irPourcentage = irPourcentage;
		this.moelle = moelle;
		this.dateMoelle = dateMoelle;
		this.resultatMoelle = resultatMoelle;
		this.laboratoire = laboratoire;
		this.fiche = fiche;
	}

	public Long getnEtudeCyto() {
		return nEtudeCyto;
	}

	public void setnEtudeCyto(Long nEtudeCyto) {
		this.nEtudeCyto = nEtudeCyto;
	}

	public Lymphocytes getLymphocytes() {
		return lymphocytes;
	}

	public void setLymphocytes(Lymphocytes lymphocytes) {
		this.lymphocytes = lymphocytes;
	}

	public Date getDateSang() {
		return dateSang;
	}

	public void setDateSang(Date dateSang) {
		this.dateSang = dateSang;
	}

	public AgentPortant getAgentPortant() {
		return agentPortant;
	}

	public void setAgentPortant(AgentPortant agentPortant) {
		this.agentPortant = agentPortant;
	}

	public Instabilite getInstabilite() {
		return instabilite;
	}

	public void setInstabilite(Instabilite instabilite) {
		this.instabilite = instabilite;
	}

	public Double getInstabilitePourcentage() {
		return instabilitePourcentage;
	}

	public void setInstabilitePourcentage(Double instabilitePourcentage) {
		this.instabilitePourcentage = instabilitePourcentage;
	}

	public IR getIr() {
		return ir;
	}

	public void setIr(IR ir) {
		this.ir = ir;
	}

	public Double getIrPourcentage() {
		return irPourcentage;
	}

	public void setIrPourcentage(Double irPourcentage) {
		this.irPourcentage = irPourcentage;
	}

	public String getMoelle() {
		return moelle;
	}

	public void setMoelle(String moelle) {
		this.moelle = moelle;
	}

	public Date getDateMoelle() {
		return dateMoelle;
	}

	public void setDateMoelle(Date dateMoelle) {
		this.dateMoelle = dateMoelle;
	}

	public String getResultatMoelle() {
		return resultatMoelle;
	}

	public void setResultatMoelle(String resultatMoelle) {
		this.resultatMoelle = resultatMoelle;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	@Override
	public String toString() {
		return "Cytogenetique [nEtudeCyto=" + nEtudeCyto + ", lymphocytes=" + lymphocytes + ", dateSang=" + dateSang
				+ ", agentPortant=" + agentPortant + ", instabilite=" + instabilite + ", instabilitePourcentage="
				+ instabilitePourcentage + ", ir=" + ir + ", irPourcentage=" + irPourcentage + ", moelle=" + moelle
				+ ", dateMoelle=" + dateMoelle + ", resultatMoelle=" + resultatMoelle + ", laboratoire=" + laboratoire
				+ ", fiche=" + fiche + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentPortant == null) ? 0 : agentPortant.hashCode());
		result = prime * result + ((dateMoelle == null) ? 0 : dateMoelle.hashCode());
		result = prime * result + ((dateSang == null) ? 0 : dateSang.hashCode());
		result = prime * result + ((fiche == null) ? 0 : fiche.hashCode());
		result = prime * result + ((instabilite == null) ? 0 : instabilite.hashCode());
		result = prime * result + ((instabilitePourcentage == null) ? 0 : instabilitePourcentage.hashCode());
		result = prime * result + ((ir == null) ? 0 : ir.hashCode());
		result = prime * result + ((irPourcentage == null) ? 0 : irPourcentage.hashCode());
		result = prime * result + ((laboratoire == null) ? 0 : laboratoire.hashCode());
		result = prime * result + ((lymphocytes == null) ? 0 : lymphocytes.hashCode());
		result = prime * result + ((moelle == null) ? 0 : moelle.hashCode());
		result = prime * result + ((nEtudeCyto == null) ? 0 : nEtudeCyto.hashCode());
		result = prime * result + ((resultatMoelle == null) ? 0 : resultatMoelle.hashCode());
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
		Cytogenetique other = (Cytogenetique) obj;
		if (agentPortant != other.agentPortant)
			return false;
		if (dateMoelle == null) {
			if (other.dateMoelle != null)
				return false;
		} else if (!dateMoelle.equals(other.dateMoelle))
			return false;
		if (dateSang == null) {
			if (other.dateSang != null)
				return false;
		} else if (!dateSang.equals(other.dateSang))
			return false;
		if (fiche == null) {
			if (other.fiche != null)
				return false;
		} else if (!fiche.equals(other.fiche))
			return false;
		if (instabilite != other.instabilite)
			return false;
		if (instabilitePourcentage == null) {
			if (other.instabilitePourcentage != null)
				return false;
		} else if (!instabilitePourcentage.equals(other.instabilitePourcentage))
			return false;
		if (ir != other.ir)
			return false;
		if (irPourcentage == null) {
			if (other.irPourcentage != null)
				return false;
		} else if (!irPourcentage.equals(other.irPourcentage))
			return false;
		if (laboratoire == null) {
			if (other.laboratoire != null)
				return false;
		} else if (!laboratoire.equals(other.laboratoire))
			return false;
		if (lymphocytes != other.lymphocytes)
			return false;
		if (moelle == null) {
			if (other.moelle != null)
				return false;
		} else if (!moelle.equals(other.moelle))
			return false;
		if (nEtudeCyto == null) {
			if (other.nEtudeCyto != null)
				return false;
		} else if (!nEtudeCyto.equals(other.nEtudeCyto))
			return false;
		if (resultatMoelle == null) {
			if (other.resultatMoelle != null)
				return false;
		} else if (!resultatMoelle.equals(other.resultatMoelle))
			return false;
		return true;
	}

}
