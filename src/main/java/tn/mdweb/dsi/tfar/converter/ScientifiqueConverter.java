package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.ScientifiqueDto;
import tn.mdweb.dsi.tfar.domain.entity.Scientifique;

@Component
public class ScientifiqueConverter {
	
	
	public ScientifiqueDto entityToDto(Scientifique scientifique) {

		ModelMapper mapper = new ModelMapper();
		ScientifiqueDto map = mapper.map(scientifique, ScientifiqueDto.class);
		return map;
	}

	public List<ScientifiqueDto> entityToDto(List<Scientifique> scientifique) {

		return scientifique.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Scientifique dtoToEntity(ScientifiqueDto scientifiquedto) {

		ModelMapper mapper = new ModelMapper();
		Scientifique map = mapper.map(scientifiquedto, Scientifique.class);
		return map;
	}

	public List<Scientifique> dtoToEntity(List<ScientifiqueDto> scientifiquedto) {

		return scientifiquedto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
