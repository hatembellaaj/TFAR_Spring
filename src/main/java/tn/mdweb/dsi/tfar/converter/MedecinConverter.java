package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.MedecinDto;
import tn.mdweb.dsi.tfar.domain.entity.Medecin;

@Component
public class MedecinConverter {
	
	public MedecinDto entityToDto(Medecin medecin) {

		ModelMapper mapper = new ModelMapper();
		MedecinDto map = mapper.map(medecin, MedecinDto.class);
		return map;
	}

	public List<MedecinDto> entityToDto(List<Medecin> medecin) {

		return medecin.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Medecin dtoToEntity(MedecinDto medecinDto) {

		ModelMapper mapper = new ModelMapper();
		Medecin map = mapper.map(medecinDto, Medecin.class);
		return map;
	}

	public List<Medecin> dtoToEntity(List<MedecinDto> medecinDto) {

		return medecinDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
