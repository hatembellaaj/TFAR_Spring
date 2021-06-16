package tn.mdweb.dsi.tfar.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FrereId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "n_dossier_f",nullable = false)
	private String nDossierF;

	@Column(name = "id_f",nullable = false)
	private Long idF;

	public FrereId() {
	}

	public FrereId(String nDossierF, Long idF) {
		this.nDossierF = nDossierF;
		this.idF = idF;
	}

	public String getnDossierF() {
		return nDossierF;
	}

	public void setnDossierF(String nDossierF) {
		this.nDossierF = nDossierF;
	}

	public Long getIdF() {
		return idF;
	}

	public void setIdF(Long idF) {
		this.idF = idF;
	}

	@Override
	public String toString() {
		return "FrereId [nDossierF=" + nDossierF + ", idF=" + idF + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idF == null) ? 0 : idF.hashCode());
		result = prime * result + ((nDossierF == null) ? 0 : nDossierF.hashCode());
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
		FrereId other = (FrereId) obj;
		if (idF == null) {
			if (other.idF != null)
				return false;
		} else if (!idF.equals(other.idF))
			return false;
		if (nDossierF == null) {
			if (other.nDossierF != null)
				return false;
		} else if (!nDossierF.equals(other.nDossierF))
			return false;
		return true;
	}
	
	
	
	
	
	

}
