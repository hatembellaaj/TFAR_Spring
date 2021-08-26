package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.Mois;
import tn.mdweb.dsi.tfar.enumeration.Reponse;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AndrogeneDto {
	
	private Long id;

	//private Mois mois;
	
	private Long mois;

	private Reponse reponse;
	
	private Long idFiche;

	
	
	

}
