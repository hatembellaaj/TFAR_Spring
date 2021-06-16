package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.domain.entity.FrereId;
import tn.mdweb.dsi.tfar.repository.FrereRepository;

@Service
public class FrereService {
	
	@Autowired
	private FrereRepository frereRepository;

	public List<Frere> listAll() {
		return frereRepository.findAll();
	}

	public Frere save(Frere frere) {
		frereRepository.save(frere);
		return frere;
	}

	public Frere get(String nDossierF, Long idF) {
		FrereId frereId=new FrereId(nDossierF, idF);
		return frereRepository.findById(frereId).get();
	}

	public void delete(String nDossierF, Long idF) {
		FrereId frereId=new FrereId(nDossierF, idF);
		frereRepository.deleteById(frereId);
	}

}
