package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.PlaceCousin;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CousinDto {
	
	
	private Long cousinId;

	private String nom;

	private String prenom;

	private PlaceCousin placeCousin;

	private Sexe sexe;
	
	private Long idFiche;

}
