package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientDto {
	
	private String nDPatient;

	private String nom;

	private String prenom;

	private String sexe;

	private String dateNaissance;

	private String lieuNaissance;

	private String adresse;

	private String reperes;

	private String gouvernorat;

	private String tel;

	private String prenomPere;

	private String nomMere;

	private String prenomMere;

	private String nomGmp;

	private String nomGmm;

	private int age;
	
	private String nDFiche;

}
