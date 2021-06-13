package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Hopitale;
import tn.mdweb.dsi.tfar.repository.HopitaleRepository;

@Service
public class HopitaleService {
	
	@Autowired
	private HopitaleRepository hopitaleRepository;
	
	
	public List<Hopitale> listAll() {
		return hopitaleRepository.findAll();	
	}
	
	public Hopitale save(Hopitale hopitale) {
		hopitaleRepository.save(hopitale);
		return hopitale;
	}
	
	public Hopitale get(long id) {
		return hopitaleRepository.findById(id).get();
	}
	
	public void delete(long id) {
		hopitaleRepository.deleteById(id);
	}

}
