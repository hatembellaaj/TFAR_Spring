package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Hopitale {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="code_hopitale")
	private Long code_hopitale;
	
	
	@NotNull
	@Column(name="nom_Hopitale")
	private String nom_Hopitale;


	public Hopitale() {  }


	public Hopitale(@NotNull String nom_Hopitale) {
		this.nom_Hopitale= nom_Hopitale;
	}


	public Hopitale(Long code_hopitale, @NotNull String nom_Hopitale) {
		this.code_hopitale = code_hopitale;
		this.nom_Hopitale = nom_Hopitale;
	}


	public Long getCode_hopitale() {
		return code_hopitale;
	}


	public void setCode_hopitale(Long code_hopitale) {
		this.code_hopitale = code_hopitale;
	}


	public String getNom_Hopitale() {
		return nom_Hopitale;
	}


	public void setNom_Hopitale(String nom_Hopitale) {
		this.nom_Hopitale = nom_Hopitale;
	}


	@Override
	public String toString() {
		return "Hopitale [code_hopitale=" + code_hopitale + ", nom_Hopitale=" + nom_Hopitale + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code_hopitale == null) ? 0 : code_hopitale.hashCode());
		result = prime * result + ((nom_Hopitale == null) ? 0 : nom_Hopitale.hashCode());
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
		Hopitale other = (Hopitale) obj;
		if (code_hopitale == null) {
			if (other.code_hopitale != null)
				return false;
		} else if (!code_hopitale.equals(other.code_hopitale))
			return false;
		if (nom_Hopitale == null) {
			if (other.nom_Hopitale != null)
				return false;
		} else if (!nom_Hopitale.equals(other.nom_Hopitale))
			return false;
		return true;
	}



	

	
	
	

}
