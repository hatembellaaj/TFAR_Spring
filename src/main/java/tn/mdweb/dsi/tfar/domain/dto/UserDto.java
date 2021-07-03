package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.RoleType;
import tn.mdweb.dsi.tfar.enumeration.TypeUser;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
	
	
	private Long code;

	//private String role;
	
	private RoleType role;

	//private String type;
	
	private TypeUser type;

	private String nom;

	private String prenom;

	private String grade;

	//private String gouvernorat;
	
	private Gouvernorat gouvernorat;

	private String adresse;

	private String tel;

	private String email;

	private String photo;

	private String poste;

	private String fax;

	private String login;

	private String password;

	private String url;
	
	private Long codeOrganisme;
	
	private Long codeDepartement;

}
