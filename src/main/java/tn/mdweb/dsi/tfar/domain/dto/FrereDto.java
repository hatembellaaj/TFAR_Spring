package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FrereDto {
	
	private Long frereId;

	private String nom;

	private String prenom;

	private String atteint;

	private String placeFratrie;

	private String sexe;

	private String decedes;

	private Long age;
	
	private Long idFiche;

}
