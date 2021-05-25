package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
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
	@Column(name="code_service")
	private Long code_service;
	
	@NotNull
	@Column(name="nom_service")
	private String nom_service;

	public Service1() {
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

	public Service1(@NotNull String nom_Service) {
		this.nom_service = nom_Service;
	}

	public Service1(Long code_Service, @NotNull String nom_Service) {
		this.code_service = code_Service;
		this.nom_service = nom_Service;
	}

	@Override
	public String toString() {
		return "Service1 [code_service=" + code_service + ", nom_service=" + nom_service + "]";
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
		Service1 other = (Service1) obj;
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
