package tn.mdweb.dsi.tfar.domain.dto;

import java.io.Serializable;

public class ServiceDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long code_service;
	
	private String nom_service;

	public ServiceDto() {
	}

	public ServiceDto(String nom_Service) {
		this.nom_service = nom_Service;
	}

	public ServiceDto(Long code_Service, String nom_Service) {
		this.code_service = code_Service;
		this.nom_service = nom_Service;
	}

	public Long getCode_service() {
		return code_service;
	}

	public void setCode_service(Long code_service) {
		this.code_service = code_service;
	}

	public String getNom_service() {
		return nom_service;
	}

	public void setNom_service(String nom_service) {
		this.nom_service = nom_service;
	}

	@Override
	public String toString() {
		return "ServiceDto [code_service=" + code_service + ", nom_service=" + nom_service + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code_service == null) ? 0 : code_service.hashCode());
		result = prime * result + ((nom_service == null) ? 0 : nom_service.hashCode());
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
		if (code_service == null) {
			if (other.code_service != null)
				return false;
		} else if (!code_service.equals(other.code_service))
			return false;
		if (nom_service == null) {
			if (other.nom_service != null)
				return false;
		} else if (!nom_service.equals(other.nom_service))
			return false;
		return true;
	}

	
	
	
	
	
	

}
