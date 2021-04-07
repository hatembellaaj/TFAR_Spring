package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Scientifique;
import tn.mdweb.dsi.tfar.repository.ScientifiqueRepository;


@Service
public class ScientifiqueService {
	
	
	@Autowired
	private ScientifiqueRepository scientifiqueRepository;
	
	
	public List<Scientifique> listAll() {
		return scientifiqueRepository.findAll();	
	}
	
	public Scientifique save(Scientifique scientifique) {
		scientifiqueRepository.save(scientifique);
		return scientifique;
	}
	
	public Scientifique get(long id) {
		return scientifiqueRepository.findById(id).get();
	}
	
	public void delete(long id) {
		scientifiqueRepository.deleteById(id);
	}

}
