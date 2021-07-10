package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.CytogenetiqueDto;
import tn.mdweb.dsi.tfar.domain.entity.Cytogenetique;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;
import tn.mdweb.dsi.tfar.enumeration.AgentPortant;
import tn.mdweb.dsi.tfar.enumeration.IR;
import tn.mdweb.dsi.tfar.enumeration.Instabilite;
import tn.mdweb.dsi.tfar.enumeration.Lymphocytes;


@Component
public class CytogenetiqueConverter {
	

	public CytogenetiqueDto entityToDto(Cytogenetique cytogenetique) {

		CytogenetiqueDto map = new CytogenetiqueDto(cytogenetique.getNEtudeCyto(),cytogenetique.getLymphocytes().name(),
				cytogenetique.getDateSang(),cytogenetique.getAgentPortant().name(),cytogenetique.getInstabilite().name(),cytogenetique.getInstabilitePourcentage(),
				cytogenetique.getIr().name(),cytogenetique.getIrPourcentage(),cytogenetique.getMoelle(),cytogenetique.getDateMoelle(),cytogenetique.getResultatMoelle(),
				cytogenetique.getLaboratoire().getId(),cytogenetique.getFiche().getIdFiche());

		return map;
	}

	public List<CytogenetiqueDto> entityToDto(List<Cytogenetique> cytogenetique) {

		return cytogenetique.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Cytogenetique dtoToEntity(CytogenetiqueDto cytogenetiqueDto) {

		

		Cytogenetique map = new Cytogenetique(cytogenetiqueDto.getNEtudeCyto(),Lymphocytes.valueOf(cytogenetiqueDto.getLymphocytes()),
				cytogenetiqueDto.getDateSang(),AgentPortant.valueOf(cytogenetiqueDto.getAgentPortant()),Instabilite.valueOf(cytogenetiqueDto.getInstabilite()),cytogenetiqueDto.getInstabilitePourcentage(),
				IR.valueOf(cytogenetiqueDto.getIr()),cytogenetiqueDto.getIrPourcentage(),cytogenetiqueDto.getMoelle(),cytogenetiqueDto.getDateMoelle(),cytogenetiqueDto.getResultatMoelle(),
				new Laboratoire(cytogenetiqueDto.getIdLaboratoire()), new Fiche(cytogenetiqueDto.getIdFiche()));

		return map;
	}

	public List<Cytogenetique> dtoToEntity(List<CytogenetiqueDto> cytogenetiqueDto) {

		return cytogenetiqueDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
