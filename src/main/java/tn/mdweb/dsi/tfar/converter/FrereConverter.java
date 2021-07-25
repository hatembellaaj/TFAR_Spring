package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.FrereDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.enumeration.Atteint;
import tn.mdweb.dsi.tfar.enumeration.Decedes;
import tn.mdweb.dsi.tfar.enumeration.PlaceFraterie;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@Component
public class FrereConverter {
	
	public FrereDto entityToDto(Frere frere) {

		FrereDto map = new FrereDto(frere.getFrereId(),frere.getNom(),frere.getPrenom(),frere.getAtteint(),frere.getPlaceFratrie(),
				frere.getSexe(),frere.getDecedes(),frere.getAge(),frere.getFiche().getIdFiche());
		return map;
	}

	public List<FrereDto> entityToDto(List<Frere> frere) {
		return frere.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Frere dtoToEntity(FrereDto frereDto) {
		Frere map = new Frere(frereDto.getFrereId(),frereDto.getNom(),frereDto.getPrenom(),frereDto.getAtteint()
				,frereDto.getPlaceFratrie(),frereDto.getSexe(),frereDto.getDecedes(),
				frereDto.getAge(),new Fiche(frereDto.getIdFiche()));

		return map;
	}

	public List<Frere> dtoToEntity(List<FrereDto> frereDto) {
		return frereDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
