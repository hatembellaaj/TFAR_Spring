package tn.mdweb.dsi.tfar.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CousinId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "n_dossier_c",nullable = false)
	private String nDossierC;

	@Column(name = "id_c",nullable = false)
	private Long idC;

	public CousinId() {
	}

	public CousinId(String nDossierC, Long idC) {
		this.nDossierC = nDossierC;
		this.idC = idC;
	}

	public String getnDossierC() {
		return nDossierC;
	}

	public void setnDossierC(String nDossierC) {
		this.nDossierC = nDossierC;
	}

	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
	}

	@Override
	public String toString() {
		return "CousinId [nDossierC=" + nDossierC + ", idC=" + idC + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idC == null) ? 0 : idC.hashCode());
		result = prime * result + ((nDossierC == null) ? 0 : nDossierC.hashCode());
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
		CousinId other = (CousinId) obj;
		if (idC == null) {
			if (other.idC != null)
				return false;
		} else if (!idC.equals(other.idC))
			return false;
		if (nDossierC == null) {
			if (other.nDossierC != null)
				return false;
		} else if (!nDossierC.equals(other.nDossierC))
			return false;
		return true;
	}
	
	
	
	
	
	

}
