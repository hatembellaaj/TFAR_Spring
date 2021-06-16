package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.repository.FicheRepository;

@Service
public class FicheService {
	
	@Autowired
	private FicheRepository ficheRepository;
	
	
	public List<Fiche> listAll() {
		return ficheRepository.findAll();	
	}
	
	public Fiche save(Fiche fiche) {
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
