package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.CousinConverter;
import tn.mdweb.dsi.tfar.domain.dto.CousinDto;
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.CousinRepository;
import tn.mdweb.dsi.tfar.repository.FicheRepository;

@Service
public class CousinService {
	
	@Autowired
	private CousinRepository cousinRepository;
	
	@Autowired
	private CousinConverter cousinConverter;

	@Autowired
	private FicheRepository ficheRepository;
	
	public List<Cousin> listAll() {
		return cousinRepository.findAll();
	}

	public Cousin save(CousinDto cousinDto) throws ValidationException {
		
		
		Long idFiche = cousinDto.getIdFiche();
		List<Fiche> fiches =ficheRepository.findAll();
		Fiche x = fiches.stream().filter(h -> h.getIdFiche().equals(idFiche)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The fiche is not found.");
		}
		Cousin cousin = cousinConverter.dtoToEntity(cousinDto);
		cousinRepository.save(cousin);
		return cousin;
	}

	public Cousin get(long id) {
		return cousinRepository.findById(id).get();
	}
	
	public void delete(long id) {
		cousinRepository.deleteById(id);
	}
	
	

}
