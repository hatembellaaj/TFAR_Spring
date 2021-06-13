package tn.mdweb.dsi.tfar.domain.dto;

import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.domain.entity.Service1;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;

public class MedecinDto {
	
	private Long cin;

	private String nom;

	private String prenom;

	private String grade;

	private String type;

	private Gouvernorat gouvernorat;

	private String adresse;

	private String tel;

	private String poste;

	private String fax;

	private String email;

	private String image;

	private String login;

	private String password;

	private String url;

	private Hopital hopital;

	private Service1 service1;

	public MedecinDto() {
	}

	public MedecinDto(Long cin, String nom, String prenom, String grade, String type, Gouvernorat gouvernorat,
			String adresse, String tel, String poste, String fax, String email, String image, String login,
			String password, String url, Hopital hopital, Service1 service1) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.type = type;
		this.gouvernorat = gouvernorat;
		this.adresse = adresse;
		this.tel = tel;
		this.poste = poste;
		this.fax = fax;
		this.email = email;
		this.image = image;
		this.login = login;
		this.password = password;
		this.url = url;
		this.hopital = hopital;
		this.service1 = service1;
	}

	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
		return "MedecinDto [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", grade=" + grade + ", type=" + type
				+ ", gouvernorat=" + gouvernorat + ", adresse=" + adresse + ", tel=" + tel + ", poste=" + poste
				+ ", fax=" + fax + ", email=" + email + ", image=" + image + ", login=" + login + ", password="
				+ password + ", url=" + url + ", hopital=" + hopital + ", service1=" + service1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((gouvernorat == null) ? 0 : gouvernorat.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((hopital == null) ? 0 : hopital.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		MedecinDto other = (MedecinDto) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (gouvernorat != other.gouvernorat)
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (hopital == null) {
			if (other.hopital != null)
				return false;
		} else if (!hopital.equals(other.hopital))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
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
