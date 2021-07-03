package tn.mdweb.dsi.tfar.domain.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CytogenetiqueDto {
	
	
	private Long nEtudeCyto;

	private String lymphocytes;

	private Date dateSang;

	private String agentPortant;

	private String instabilite;

	private Double instabilitePourcentage;

	private String ir;

	private Double irPourcentage;

	private String moelle;

	private Date dateMoelle;

	private String resultatMoelle;
	
	private Long idLaboratoire;
	
	private String nDFiche;

}
