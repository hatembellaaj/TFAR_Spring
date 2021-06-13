package tn.mdweb.dsi.tfar.domain.dto;


public class CytogeneticienDto {
	
	private String nom;

	private String prenom;

	private String service;

	private String etab;

	private String adresse;

	private String tel;
	
	private String poste;
	
	private String fax;
	
	private String email;

	private String photo;

	private String type;

	private String login;

	private String password;

	private String url;

	private Long codeHopital;
	
	private Long codeService1;

	public CytogeneticienDto() {
	}

	public CytogeneticienDto(String nom, String prenom, String service, String etab, String adresse, String tel,
			String poste, String fax, String email, String photo, String type, String login, String password,
			String url, Long codeHopital, Long codeService1) {
		
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
		this.codeHopital = codeHopital;
		this.codeService1 = codeService1;
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

	public Long getCodeHopital() {
		return codeHopital;
	}

	public void setCodeHopital(Long codeHopital) {
		this.codeHopital = codeHopital;
	}

	public Long getCodeService1() {
		return codeService1;
	}

	public void setCodeService1(Long codeService1) {
		this.codeService1 = codeService1;
	}

	@Override
	public String toString() {
		return "CytogeneticienDto [nom=" + nom + ", prenom=" + prenom + ", service=" + service + ", etab=" + etab
				+ ", adresse=" + adresse + ", tel=" + tel + ", poste=" + poste + ", fax=" + fax + ", email=" + email
				+ ", photo=" + photo + ", type=" + type + ", login=" + login + ", password=" + password + ", url=" + url
				+ ", codeHopital=" + codeHopital + ", codeService1=" + codeService1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((codeHopital == null) ? 0 : codeHopital.hashCode());
		result = prime * result + ((codeService1 == null) ? 0 : codeService1.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((etab == null) ? 0 : etab.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
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
		CytogeneticienDto other = (CytogeneticienDto) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (codeHopital == null) {
			if (other.codeHopital != null)
				return false;
		} else if (!codeHopital.equals(other.codeHopital))
			return false;
		if (codeService1 == null) {
			if (other.codeService1 != null)
				return false;
		} else if (!codeService1.equals(other.codeService1))
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
