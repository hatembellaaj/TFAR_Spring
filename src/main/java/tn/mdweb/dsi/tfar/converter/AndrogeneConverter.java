package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.AndrogeneDto;
import tn.mdweb.dsi.tfar.domain.entity.Androgene;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;

@Component
public class AndrogeneConverter {

	public AndrogeneDto entityToDto(Androgene androgene) {

		AndrogeneDto map = new AndrogeneDto(androgene.getId(), androgene.getMois(), androgene.getReponse(),
				androgene.getFiche().getIdFiche());
		return map;
	}

	public List<AndrogeneDto> entityToDto(List<Androgene> androgene) {
		return androgene.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Androgene dtoToEntity(AndrogeneDto androgeneDto) {
		Androgene map = new Androgene(androgeneDto.getId(), androgeneDto.getMois(), androgeneDto.getReponse(),
				new Fiche(androgeneDto.getIdFiche()));

		return map;
	}

	public List<Androgene> dtoToEntity(List<AndrogeneDto> androgeneDto) {
		return androgeneDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
