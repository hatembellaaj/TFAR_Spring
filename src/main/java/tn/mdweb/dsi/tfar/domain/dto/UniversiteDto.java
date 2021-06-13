package tn.mdweb.dsi.tfar.domain.dto;

public class UniversiteDto {

	private Long code_universite;

	private String nom;

	private String adresse;

	private String tel;

	private String contact;

	private String email;

	public UniversiteDto() {
	}

	public UniversiteDto(Long code_universite, String nom, String adresse, String tel, String contact, String email) {
		this.code_universite = code_universite;
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.contact = contact;
		this.email = email;
	}

	public Long getCode_universite() {
		return code_universite;
	}

	public void setCode_universite(Long code_universite) {
		this.code_universite = code_universite;
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

	@Override
	public String toString() {
		return "UniversiteDto [code_universite=" + code_universite + ", nom=" + nom + ", adresse=" + adresse + ", tel="
				+ tel + ", contact=" + contact + ", email=" + email + "]";
	}

}
