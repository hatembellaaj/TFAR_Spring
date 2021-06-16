package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.domain.entity.CousinId;
import tn.mdweb.dsi.tfar.repository.CousinRepository;

@Service
public class CousinService {
	
	@Autowired
	private CousinRepository cousinRepository;

	public List<Cousin> listAll() {
		return cousinRepository.findAll();
	}

	public Cousin save(Cousin cousin) {
		cousinRepository.save(cousin);
		return cousin;
	}

	public Cousin get(String nDossierC, Long idC) {
		CousinId cousinId=new CousinId(nDossierC, idC);
		return cousinRepository.findById(cousinId).get();
	}

	public void delete(String nDossierC, Long idC) {
		CousinId cousinId=new CousinId(nDossierC, idC);
		cousinRepository.deleteById(cousinId);
	}
	
	

}
