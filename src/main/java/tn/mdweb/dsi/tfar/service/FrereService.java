package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.converter.FrereConverter;
import tn.mdweb.dsi.tfar.domain.dto.FrereDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.FicheRepository;
import tn.mdweb.dsi.tfar.repository.FrereRepository;

@Service
public class FrereService {
	
	@Autowired
	private FrereRepository frereRepository;
	
	@Autowired
	private FrereConverter frereConverter;

	@Autowired
	private FicheRepository ficheRepository;

	public List<Frere> listAll() {
		return frereRepository.findAll();
	}

public Frere save(FrereDto frereDto) throws ValidationException {
		
		String nDFiche = frereDto.getNDFiche();
		List<Fiche> fiches =ficheRepository.findAll();
		Fiche x = fiches.stream().filter(h -> h.getNDossierFiche().equals(nDFiche)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The fiche is not found.");
		}
		Frere frere = frereConverter.dtoToEntity(frereDto);
		frereRepository.save(frere);
		return frere;
	}

	public Frere get(long id) {
		return frereRepository.findById(id).get();
	}
	
	public void delete(long id) {
		frereRepository.deleteById(id);
	}

}
