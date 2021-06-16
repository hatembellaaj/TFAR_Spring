package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Cytogenetique;
import tn.mdweb.dsi.tfar.repository.CytogenetiqueRepository;

@Service
public class CytogenetiqueService {
	

	@Autowired
	private CytogenetiqueRepository cytogenetiqueRepository;
	
	
	public List<Cytogenetique> listAll() {
		return cytogenetiqueRepository.findAll();	
	}
	
	public Cytogenetique save(Cytogenetique cytogenetique) {
		cytogenetiqueRepository.save(cytogenetique);
		return cytogenetique;
	}
	
	public Cytogenetique get(long id) {
		return cytogenetiqueRepository.findById(id).get();
	}
	
	public void delete(long id) {
		cytogenetiqueRepository.deleteById(id);
	}

}
