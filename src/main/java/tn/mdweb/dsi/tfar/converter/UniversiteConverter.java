package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.UniversiteDto;
import tn.mdweb.dsi.tfar.domain.entity.Universite;

@Component
public class UniversiteConverter {
	
	public UniversiteDto entityToDto(Universite universite) {

		ModelMapper mapper = new ModelMapper();
		UniversiteDto map = mapper.map(universite, UniversiteDto.class);
		return map;
	}

	public List<UniversiteDto> entityToDto(List<Universite> universite) {

		return universite.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Universite dtoToEntity(UniversiteDto universitedto) {

		ModelMapper mapper = new ModelMapper();
		Universite map = mapper.map(universitedto, Universite.class);
		return map;
	}

	public List<Universite> dtoToEntity(List<UniversiteDto> universitedto) {

		return universitedto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
