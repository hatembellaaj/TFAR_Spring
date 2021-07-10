package tn.mdweb.dsi.tfar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CousinDto {
	
	
	private Long cousinId;

	private String nom;

	private String prenom;

	private String placeCousin;

	private String sexe;
	
	private Long idFiche;

}
