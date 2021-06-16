package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Service1;
import tn.mdweb.dsi.tfar.repository.ServiceRepository;


@Service
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	
	public List<Service1> listAll() {
		return serviceRepository.findAll();	
	}
	
	public Service1 save(Service1 service) {
		serviceRepository.save(service);
		return service;
	}
	
	public Service1 get(long id) {
		return serviceRepository.findById(id).get();
	}
	
	public void delete(long id) {
		serviceRepository.deleteById(id);
	}

}
