package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.HopitaleDto;
import tn.mdweb.dsi.tfar.domain.entity.Hopitale;

@Component
public class HopitaleConverter {

	public HopitaleDto entityToDto(Hopitale hopitale) {
		HopitaleDto hopitaleDto = new HopitaleDto();
		hopitaleDto.setCode_hopitale(hopitale.getCode_hopitale());
		hopitaleDto.setNom_Hopitale(hopitale.getNom_Hopitale());
		return hopitaleDto;
	}

	public List<HopitaleDto> entityToDto(List<Hopitale> hopitales) {

		return hopitales.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Hopitale dtoToEntity(HopitaleDto hopitaleDto) {
		Hopitale hopitale = new Hopitale();
		hopitale.setCode_hopitale(hopitaleDto.getCode_hopitale());
		hopitale.setNom_Hopitale(hopitaleDto.getNom_Hopitale());
		return hopitale;

	}

	public List<Hopitale> dtoToEntity(List<HopitaleDto> hopitaleDtos) {
		
		return hopitaleDtos.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
