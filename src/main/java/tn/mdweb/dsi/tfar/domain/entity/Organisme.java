package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import tn.mdweb.dsi.tfar.enumeration.OrganismeType;

@Entity
@Table(name = "organisme")
public class Organisme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private Long code;

	@NotNull
	@Column(name = "nom")
	private String nom;

	@NotNull
	@Column(name = "adresse")
	private String adresse;

	@NotNull
	@Column(name = "tel")
	private String tel;

	@NotNull
	@Column(name = "contact")
	private String contact;

	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private OrganismeType type;

	public Organisme() {
	}

	public Organisme(Long code, @NotNull String nom, @NotNull String adresse, @NotNull String tel,
			@NotNull String contact, @NotNull String email, @NotNull OrganismeType type) {
		this.code = code;
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.contact = contact;
		this.email = email;
		this.type = type;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OrganismeType getType() {
		return type;
	}

	public void setType(OrganismeType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Organisme [code=" + code + ", nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + ", contact="
				+ contact + ", email=" + email + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Organisme other = (Organisme) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
	
	

}
