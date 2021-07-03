package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.FicheConverter;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.FicheRepository;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class FicheService {
	
	@Autowired
	private FicheRepository ficheRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FicheConverter ficheConverter;
	
	
	public List<Fiche> listAll() {
		return ficheRepository.findAll();	
	}
	
	public Fiche save(FicheDto ficheDto) throws ValidationException{
		
		Long codeUser = ficheDto.getCodeUser();
		List<User> users =userRepository.findAll();
		User x = users.stream().filter(h -> h.getCode().equals(codeUser)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The user is not found.");
		}
		Fiche fiche = ficheConverter.toEntity(ficheDto);
		ficheRepository.save(fiche);
		return fiche;
	}
	
	public Fiche get(String id) {
		return ficheRepository.findById(id).get();
	}
	
	public void delete(String id) {
		ficheRepository.deleteById(id);
	}

}
