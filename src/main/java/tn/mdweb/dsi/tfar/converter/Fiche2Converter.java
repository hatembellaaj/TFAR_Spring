package tn.mdweb.dsi.tfar.converter;

import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.Fiche2Dto;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import org.modelmapper.ModelMapper;

@Component
public class Fiche2Converter {

	public FicheDto Fiche2DtoToDFicheDto(Fiche2Dto fiche2Dto) {

		ModelMapper mapper = new ModelMapper();
		FicheDto map = mapper.map(fiche2Dto, FicheDto.class);
		return map;
	}

	

}
