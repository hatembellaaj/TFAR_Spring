package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Universite;
import tn.mdweb.dsi.tfar.repository.UniversiteRepository;

@Service
public class UniversiteService {
	
	
	@Autowired
	private UniversiteRepository universiteRepository;
	
	
	public List<Universite> listAll() {
		return universiteRepository.findAll();	
	}
	
	public Universite save(Universite universite) {
		universiteRepository.save(universite);
		return universite;
	}
	
	public Universite get(long id) {
		return universiteRepository.findById(id).get();
	}
	
	public void delete(long id) {
		universiteRepository.deleteById(id);
	}


}
