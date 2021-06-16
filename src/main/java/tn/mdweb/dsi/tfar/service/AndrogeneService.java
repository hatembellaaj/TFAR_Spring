package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Androgene;
import tn.mdweb.dsi.tfar.repository.AndrogeneRepository;

@Service
public class AndrogeneService {
	
	
	@Autowired
	private AndrogeneRepository androgeneRepository;
	
	
	public List<Androgene> listAll() {
		return androgeneRepository.findAll();	
	}
	
	public Androgene save(Androgene androgene) {
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
