package tn.mdweb.dsi.tfar.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PatientId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "n_dossier_p",nullable = false)
	private String nDossierP;

	@Column(name = "id_p",nullable = false)
	private Long idP;

	public PatientId() {}

	public PatientId(String nDossierP, Long idP) {
		this.nDossierP = nDossierP;
		this.idP = idP;
	}

	public String getnDossierP() {
		return nDossierP;
	}

	public void setnDossierP(String nDossierP) {
		this.nDossierP = nDossierP;
	}

	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	@Override
	public String toString() {
		return "PatientId [nDossierP=" + nDossierP + ", idP=" + idP + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idP == null) ? 0 : idP.hashCode());
		result = prime * result + ((nDossierP == null) ? 0 : nDossierP.hashCode());
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
		PatientId other = (PatientId) obj;
		if (idP == null) {
			if (other.idP != null)
				return false;
		} else if (!idP.equals(other.idP))
			return false;
		if (nDossierP == null) {
			if (other.nDossierP != null)
				return false;
		} else if (!nDossierP.equals(other.nDossierP))
			return false;
		return true;
	}
	
	
	
	

	
	
	
	

}
