package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.Atteint;
import tn.mdweb.dsi.tfar.enumeration.Decedes;
import tn.mdweb.dsi.tfar.enumeration.PlaceFraterie;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FrereDto {
	
	private Long frereId;

	private String nom;

	private String prenom;

	private Atteint atteint;

	private PlaceFraterie placeFratrie;

	private Sexe sexe;

	private Decedes decedes;

	private Long age;
	
	private Long idFiche;

}
