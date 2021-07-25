package tn.mdweb.dsi.tfar.domain.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.mdweb.dsi.tfar.enumeration.AgentPortant;
import tn.mdweb.dsi.tfar.enumeration.IR;
import tn.mdweb.dsi.tfar.enumeration.Instabilite;
import tn.mdweb.dsi.tfar.enumeration.Lymphocytes;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CytogenetiqueDto {
	
	
	private Long nEtudeCyto;

	private Lymphocytes lymphocytes;

	private Date dateSang;

	private AgentPortant agentPortant;

	private Instabilite instabilite;

	private Double instabilitePourcentage;

	private IR ir;

	private Double irPourcentage;

	private String moelle;

	private Date dateMoelle;

	private String resultatMoelle;
	
	private Long idLaboratoire;
	
	private Long idFiche;

}
