package tn.mdweb.dsi.tfar.domain.dto;

import java.io.Serializable;

public class ServiceDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long Code_Service;
	
	private String Nom_Service;

	public ServiceDto() {
	}

	public ServiceDto(String nom_Service) {
		Nom_Service = nom_Service;
	}

	public ServiceDto(Long code_Service, String nom_Service) {
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
		return "ServiceDto [Code_Service=" + Code_Service + ", Nom_Service=" + Nom_Service + "]";
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
		ServiceDto other = (ServiceDto) obj;
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
