package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.HopitalDto;
import tn.mdweb.dsi.tfar.domain.entity.Hopital;

@Component
public class HopitalConverter {

	public HopitalDto entityToDto(Hopital hopital) {

		ModelMapper mapper = new ModelMapper();
		HopitalDto map = mapper.map(hopital, HopitalDto.class);
		return map;
	}

	public List<HopitalDto> entityToDto(List<Hopital> hopital) {

		return hopital.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Hopital dtoToEntity(HopitalDto hopitaldto) {

		ModelMapper mapper = new ModelMapper();
		Hopital map = mapper.map(hopitaldto, Hopital.class);
		return map;
	}

	public List<Hopital> dtoToEntity(List<HopitalDto> hopitaldto) {

		return hopitaldto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
