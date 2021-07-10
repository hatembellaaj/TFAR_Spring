package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.AndrogeneConverter;
import tn.mdweb.dsi.tfar.domain.dto.AndrogeneDto;
import tn.mdweb.dsi.tfar.domain.entity.Androgene;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.AndrogeneRepository;
import tn.mdweb.dsi.tfar.repository.FicheRepository;

@Service
public class AndrogeneService {
	
	
	@Autowired
	private AndrogeneRepository androgeneRepository;
	
	@Autowired
	private AndrogeneConverter androgeneConverter;
	
	@Autowired
	private FicheRepository ficheRepository;
	
	
	public List<Androgene> listAll() {
		return androgeneRepository.findAll();	
	}
	
	public Androgene save(AndrogeneDto androgeneDto) throws ValidationException{
		
		Long idFiche = androgeneDto.getIdFiche();
		List<Fiche> fiches =ficheRepository.findAll();
		Fiche x = fiches.stream().filter(h -> h.getIdFiche().equals(idFiche)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The fiche is not found.");
		}
		
		Androgene androgene = androgeneConverter.dtoToEntity(androgeneDto);
		androgeneRepository.save(androgene);
		return androgene;
	}
	
	public Androgene get(long id) {
		return androgeneRepository.findById(id).get();
	}
	
	public void delete(long id) {
		androgeneRepository.deleteById(id);
	}

}
