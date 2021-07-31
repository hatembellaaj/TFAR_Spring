package tn.mdweb.dsi.tfar.domain.dto;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientDto {
	
	private Long idPatient;
	
	@NotEmpty
	private String ndPatient;

	@NotEmpty
	private String nom;

	@NotEmpty
	private String prenom;

	private Sexe sexe;

	private String dateNaissance;

	private String lieuNaissance;

	private String adresse;

	private String reperes;

	private Gouvernorat gouvernorat;

	private String tel;

	private String prenomPere;

	private String nomMere;

	private String prenomMere;

	private String nomGmp;

	private String nomGmm;

	//private int age;
	
	private Long idFiche;


	
	

}
