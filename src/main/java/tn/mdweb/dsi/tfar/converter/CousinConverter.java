package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.CousinDto;
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.enumeration.PlaceCousin;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@Component
public class CousinConverter {
	
	
	public CousinDto entityToDto(Cousin cousin) {

		CousinDto map = new CousinDto(cousin.getCousinId(),cousin.getNom(),cousin.getPrenom(),
				cousin.getPlaceCousin().name(),cousin.getSexe().name(),cousin.getFiche().getNDossierFiche());
		return map;
	}

	public List<CousinDto> entityToDto(List<Cousin> cousin) {

		return cousin.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Cousin dtoToEntity(CousinDto cousinDto) {

		Cousin map = new Cousin(cousinDto.getCousinId(),cousinDto.getNom(),cousinDto.getPrenom(),
				PlaceCousin.valueOf(cousinDto.getPlaceCousin()),Sexe.valueOf(cousinDto.getSexe()),new Fiche(cousinDto.getNDFiche()));

		return map;
	}

	public List<Cousin> dtoToEntity(List<CousinDto> cousinDto) {

		return cousinDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
	

}
