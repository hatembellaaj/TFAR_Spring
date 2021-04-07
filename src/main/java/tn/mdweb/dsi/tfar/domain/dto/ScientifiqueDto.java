package tn.mdweb.dsi.tfar.domain.dto;

import java.sql.Blob;

public class ScientifiqueDto {

	private Long code_sc;

	private String nom_sc;

	private String prenom_sc;

	private String service_sc;

	private String centre_sc;

	private String adresse_sc;

	private String tel_sc;

	private String email_sc;

	private Blob photo_sc;

	private String type_sc;

	private String login_sc;

	private String passwd_sc;

	private String url;

	public ScientifiqueDto() {
	}

	public ScientifiqueDto(String nom_sc, String prenom_sc, String service_sc, String centre_sc, String adresse_sc,
			String tel_sc, String email_sc, Blob photo_sc, String type_sc, String login_sc, String passwd_sc,
			String url) {
		this.nom_sc = nom_sc;
		this.prenom_sc = prenom_sc;
		this.service_sc = service_sc;
		this.centre_sc = centre_sc;
		this.adresse_sc = adresse_sc;
		this.tel_sc = tel_sc;
		this.email_sc = email_sc;
		this.photo_sc = photo_sc;
		this.type_sc = type_sc;
		this.login_sc = login_sc;
		this.passwd_sc = passwd_sc;
		this.url = url;
	}

	public ScientifiqueDto(Long code_sc, String nom_sc, String prenom_sc, String service_sc, String centre_sc,
			String adresse_sc, String tel_sc, String email_sc, Blob photo_sc, String type_sc, String login_sc,
			String passwd_sc, String url) {
		this.code_sc = code_sc;
		this.nom_sc = nom_sc;
		this.prenom_sc = prenom_sc;
		this.service_sc = service_sc;
		this.centre_sc = centre_sc;
		this.adresse_sc = adresse_sc;
		this.tel_sc = tel_sc;
		this.email_sc = email_sc;
		this.photo_sc = photo_sc;
		this.type_sc = type_sc;
		this.login_sc = login_sc;
		this.passwd_sc = passwd_sc;
		this.url = url;
	}

	public Long getCode_sc() {
		return code_sc;
	}

	public void setCode_sc(Long code_sc) {
		this.code_sc = code_sc;
	}

	public String getNom_sc() {
		return nom_sc;
	}

	public void setNom_sc(String nom_sc) {
		this.nom_sc = nom_sc;
	}

	public String getPrenom_sc() {
		return prenom_sc;
	}

	public void setPrenom_sc(String prenom_sc) {
		this.prenom_sc = prenom_sc;
	}

	public String getService_sc() {
		return service_sc;
	}

	public void setService_sc(String service_sc) {
		this.service_sc = service_sc;
	}

	public String getCentre_sc() {
		return centre_sc;
	}

	public void setCentre_sc(String centre_sc) {
		this.centre_sc = centre_sc;
	}

	public String getAdresse_sc() {
		return adresse_sc;
	}

	public void setAdresse_sc(String adresse_sc) {
		this.adresse_sc = adresse_sc;
	}

	public String getTel_sc() {
		return tel_sc;
	}

	public void setTel_sc(String tel_sc) {
		this.tel_sc = tel_sc;
	}

	public String getEmail_sc() {
		return email_sc;
	}

	public void setEmail_sc(String email_sc) {
		this.email_sc = email_sc;
	}

	public Blob getPhoto_sc() {
		return photo_sc;
	}

	public void setPhoto_sc(Blob photo_sc) {
		this.photo_sc = photo_sc;
	}

	public String getType_sc() {
		return type_sc;
	}

	public void setType_sc(String type_sc) {
		this.type_sc = type_sc;
	}

	public String getLogin_sc() {
		return login_sc;
	}

	public void setLogin_sc(String login_sc) {
		this.login_sc = login_sc;
	}

	public String getPasswd_sc() {
		return passwd_sc;
	}

	public void setPasswd_sc(String passwd_sc) {
		this.passwd_sc = passwd_sc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ScientifiqueDto [code_sc=" + code_sc + ", nom_sc=" + nom_sc + ", prenom_sc=" + prenom_sc
				+ ", service_sc=" + service_sc + ", centre_sc=" + centre_sc + ", adresse_sc=" + adresse_sc + ", tel_sc="
				+ tel_sc + ", email_sc=" + email_sc + ", photo_sc=" + photo_sc + ", type_sc=" + type_sc + ", login_sc="
				+ login_sc + ", passwd_sc=" + passwd_sc + ", url=" + url + "]";
	}
	
	

}
