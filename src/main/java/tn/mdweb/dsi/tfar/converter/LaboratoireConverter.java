package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.LaboratoireDto;
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;

@Component
public class LaboratoireConverter {
	
	public LaboratoireDto entityToDto(Laboratoire laboratoire) {
		LaboratoireDto laboratoireDto = new LaboratoireDto();
		laboratoireDto.setId(laboratoire.getId());
		laboratoireDto.setNom(laboratoire.getNom());
		return laboratoireDto;
	}

	public List<LaboratoireDto> entityToDto(List<Laboratoire> laboratoire) {

		return laboratoire.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Laboratoire dtoToEntity(LaboratoireDto laboratoireDto) {
		Laboratoire laboratoire = new Laboratoire();
		laboratoire.setId(laboratoireDto.getId());
		laboratoire.setNom(laboratoireDto.getNom());
		return laboratoire;

	}

	public List<Laboratoire> dtoToEntity(List<LaboratoireDto> laboratoireDto) {
		
		return laboratoireDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
	

}
