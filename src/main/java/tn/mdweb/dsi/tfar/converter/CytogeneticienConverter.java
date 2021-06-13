package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.CytogeneticienDto;
import tn.mdweb.dsi.tfar.domain.entity.Cytogeneticien;
import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.domain.entity.Service1;


@Component
public class CytogeneticienConverter {
	
	public CytogeneticienDto entityToDto(Cytogeneticien cytogeneticien) {

		/*ModelMapper mapper = new ModelMapper();
		CytogeneticienDto map = mapper.map(cytogeneticien, CytogeneticienDto.class);
		return map;*/
		
		CytogeneticienDto map = new CytogeneticienDto(cytogeneticien.getNom(), cytogeneticien.getPrenom(),
				cytogeneticien.getService(), cytogeneticien.getEtab(),
				cytogeneticien.getAdresse(), cytogeneticien.getTel(),
				cytogeneticien.getPoste(), cytogeneticien.getFax(),
				cytogeneticien.getEmail(), cytogeneticien.getPhoto(),
				cytogeneticien.getType(), cytogeneticien.getLogin(),
				cytogeneticien.getPassword(), cytogeneticien.getUrl(),
				cytogeneticien.getHopital().getCode(),cytogeneticien.getService1().getCode());
		
		return map;
	}

	public List<CytogeneticienDto> entityToDto(List<Cytogeneticien> cytogeneticien) {

		return cytogeneticien.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Cytogeneticien dtoToEntity(CytogeneticienDto cytogeneticienDto) {

		/*ModelMapper mapper = new ModelMapper();
		Cytogeneticien map = mapper.map(cytogeneticienDto, Cytogeneticien.class);*/

		Service1 s = new Service1();
		s.setCode(cytogeneticienDto.getCodeService1());
		
		Cytogeneticien map = new Cytogeneticien(cytogeneticienDto.getNom(), cytogeneticienDto.getPrenom(),
				cytogeneticienDto.getService(), cytogeneticienDto.getEtab(),
				cytogeneticienDto.getAdresse(), cytogeneticienDto.getTel(),
				cytogeneticienDto.getPoste(), cytogeneticienDto.getFax(),
				cytogeneticienDto.getEmail(), cytogeneticienDto.getPhoto(),
				cytogeneticienDto.getType(), cytogeneticienDto.getLogin(),
				cytogeneticienDto.getPassword(), cytogeneticienDto.getUrl(),
				new Hopital(cytogeneticienDto.getCodeHopital()), s);
		
		return map;
	}

	public List<Cytogeneticien> dtoToEntity(List<CytogeneticienDto> cytogeneticienDto) {

		return cytogeneticienDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
