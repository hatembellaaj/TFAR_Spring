package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "service")
public class Service1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Code_Service;
	
	@NotNull
	private String Nom_Service;

	public Service1() {
	}

	public Service1(@NotNull String nom_Service) {
		Nom_Service = nom_Service;
	}

	public Service1(Long code_Service, @NotNull String nom_Service) {
		Code_Service = code_Service;
		Nom_Service = nom_Service;
	}

	public Long getCode_Service() {
		return Code_Service;
	}

	public void setCode_Service(Long code_Service) {
		Code_Service = code_Service;
	}

	public String getNom_Service() {
		return Nom_Service;
	}

	public void setNom_Service(String nom_Service) {
		Nom_Service = nom_Service;
	}

	@Override
	public String toString() {
		return "Service1 [Code_Service=" + Code_Service + ", Nom_Service=" + Nom_Service + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Code_Service == null) ? 0 : Code_Service.hashCode());
		result = prime * result + ((Nom_Service == null) ? 0 : Nom_Service.hashCode());
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
		Service1 other = (Service1) obj;
		if (Code_Service == null) {
			if (other.Code_Service != null)
				return false;
		} else if (!Code_Service.equals(other.Code_Service))
			return false;
		if (Nom_Service == null) {
			if (other.Nom_Service != null)
				return false;
		} else if (!Nom_Service.equals(other.Nom_Service))
			return false;
		return true;
	}
	
	

	
}
