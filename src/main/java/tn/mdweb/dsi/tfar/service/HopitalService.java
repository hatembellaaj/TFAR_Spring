package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.repository.HopitalRepository;

@Service
public class HopitalService {
	
	@Autowired
	private HopitalRepository hopitaleRepository;
	
	
	public List<Hopital> listAll() {
		return hopitaleRepository.findAll();	
	}
	
	public Hopital save(Hopital hopitale) {
		hopitaleRepository.save(hopitale);
		return hopitale;
	}
	
	public Hopital get(long id) {
		return hopitaleRepository.findById(id).get();
	}
	
	public void delete(long id) {
		hopitaleRepository.deleteById(id);
	}

}
