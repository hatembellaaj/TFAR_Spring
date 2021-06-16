package tn.mdweb.dsi.tfar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Medecin;
import tn.mdweb.dsi.tfar.repository.MedecinRepository;

@Service
public class MedecinService {
	
	@Autowired
	private MedecinRepository medecinRepository;
	
	
	public List<Medecin> listAll() {
		return medecinRepository.findAll();	
	}
	
	public Medecin save(Medecin medecin) {
		medecinRepository.save(medecin);
		return medecin;
	}
	
	public Medecin get(long id) {
		return medecinRepository.findById(id).get();
	}
	
	public void delete(long id) {
		medecinRepository.deleteById(id);
	}
	

}
