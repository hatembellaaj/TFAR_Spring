package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cytogeneticien")
public class Cytogeneticien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private Long code;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "service")
	private String service;

	@Column(name = "etab")
	private String etab;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "tel")
	private String tel;
	
	@Column(name = "poste")
	private String poste;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "email")
	private String email;

	@Column(name = "photo")
	private String photo;

	@Column(name = "type")
	private String type;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "url")
	private String url;

	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name = "code_hopital", referencedColumnName = "code")
	private Hopital hopital;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name = "code_service", referencedColumnName = "code")
	private Service1 service1;

	public Cytogeneticien() {
	}

	public Cytogeneticien(String nom, String prenom, String service, String etab, String adresse, String tel,
			String poste, String fax, String email, String photo, String type, String login, String password,
			String url, Hopital hopital, Service1 service1) {
		this.nom = nom;
		this.prenom = prenom;
		this.service = service;
		this.etab = etab;
		this.adresse = adresse;
		this.tel = tel;
		this.poste = poste;
		this.fax = fax;
		this.email = email;
		this.photo = photo;
		this.type = type;
		this.login = login;
		this.password = password;
		this.url = url;
		this.hopital = hopital;
		this.service1 = service1;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEtab() {
		return etab;
	}

	public void setEtab(String etab) {
		this.etab = etab;
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

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	public Service1 getService1() {
		return service1;
	}

	public void setService1(Service1 service1) {
		this.service1 = service1;
	}

	@Override
	public String toString() {
		return "Cytogeneticien [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", service=" + service
				+ ", etab=" + etab + ", adresse=" + adresse + ", tel=" + tel + ", poste=" + poste + ", fax=" + fax
				+ ", email=" + email + ", photo=" + photo + ", type=" + type + ", login=" + login + ", password="
				+ password + ", url=" + url + ", hopital=" + hopital + ", service1=" + service1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((etab == null) ? 0 : etab.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((hopital == null) ? 0 : hopital.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((service1 == null) ? 0 : service1.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Cytogeneticien other = (Cytogeneticien) obj;
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (etab == null) {
			if (other.etab != null)
				return false;
		} else if (!etab.equals(other.etab))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (hopital == null) {
			if (other.hopital != null)
				return false;
		} else if (!hopital.equals(other.hopital))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (poste == null) {
			if (other.poste != null)
				return false;
		} else if (!poste.equals(other.poste))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (service1 == null) {
			if (other.service1 != null)
				return false;
		} else if (!service1.equals(other.service1))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	

	
	
	
	
	

}
