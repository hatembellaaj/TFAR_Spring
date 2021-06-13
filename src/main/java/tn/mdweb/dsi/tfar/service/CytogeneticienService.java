package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.CytogeneticienConverter;
import tn.mdweb.dsi.tfar.domain.dto.CytogeneticienDto;
import tn.mdweb.dsi.tfar.domain.entity.Cytogeneticien;
import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.domain.entity.Service1;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.CytogeneticienRepository;
import tn.mdweb.dsi.tfar.repository.HopitalRepository;
import tn.mdweb.dsi.tfar.repository.ServiceRepository;

@Service
public class CytogeneticienService {
	
	@Autowired
	private CytogeneticienRepository cytogeneticienRepository;


	@Autowired
	private CytogeneticienConverter cytogeneticienConverter;
	
	@Autowired
	private HopitalRepository hopitalRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<Cytogeneticien> listAll() {
		return cytogeneticienRepository.findAll();	
	}
	
	public Cytogeneticien save(CytogeneticienDto cytogeneticienDto) throws ValidationException {
		Long codeHopitale = cytogeneticienDto.getCodeHopital();
		List<Hopital> hopitales = hopitalRepository.findAll();
		Hopital x = hopitales.stream().filter(h -> h.getCode().equals(codeHopitale)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The hopital is not found.");
		}
		
		Long codeService = cytogeneticienDto.getCodeService1();
		List<Service1> services = serviceRepository.findAll();
		Service1 y = services.stream().filter(h -> h.getCode().equals(codeService)).findAny().orElse(null);
		if (y == null) {
			throw new ValidationException("The Service is not found.");
		}

		Cytogeneticien cytogeneticien = cytogeneticienConverter.dtoToEntity(cytogeneticienDto);
		cytogeneticienRepository.save(cytogeneticien);
		return cytogeneticien;
	}
	
	public Cytogeneticien get(long id) {
		return cytogeneticienRepository.findById(id).get();
	}
	
	public void delete(long id) {
		cytogeneticienRepository.deleteById(id);
	}

	public Cytogeneticien update(Cytogeneticien existingcytogeneticien) throws ValidationException {
		
		
		Long codeHopitale = existingcytogeneticien.getHopital().getCode();
		List<Hopital> hopitales = hopitalRepository.findAll();
		Hopital x = hopitales.stream().filter(h -> h.getCode().equals(codeHopitale)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The hopital is not found.");
		}
		
		Long codeService = existingcytogeneticien.getService1().getCode();
		List<Service1> services = serviceRepository.findAll();
		Service1 y = services.stream().filter(h -> h.getCode().equals(codeService)).findAny().orElse(null);
		if (y == null) {
			throw new ValidationException("The Service is not found.");
		}
		cytogeneticienRepository.save(existingcytogeneticien);
		return existingcytogeneticien;
	}

}
