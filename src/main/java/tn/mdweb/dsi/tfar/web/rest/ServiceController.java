package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import tn.mdweb.dsi.tfar.converter.ServiceConverter;

import tn.mdweb.dsi.tfar.domain.dto.ServiceDto;

import tn.mdweb.dsi.tfar.domain.entity.Service1;

import tn.mdweb.dsi.tfar.service.ServiceService;

@RestController
@RequestMapping("/api/serviceDtos")
public class ServiceController {

	@Autowired
	private ServiceService serviceService;

	@Autowired
	private ServiceConverter serviceConverter;

	// get all serviceDtos
	@GetMapping("/findAll")
	public List<ServiceDto> getAllServiceDtos() {

		List<Service1> findAll = serviceService.listAll();
		return serviceConverter.entityToDto(findAll);
	}

	// get serviceDto by Code_Service
	@GetMapping("/find/{Code_Service}")
	public ServiceDto getServiceDtoById(@PathVariable(value = "Code_Service") long id) {
		Service1 service = serviceService.get(id);
		return serviceConverter.entityToDto(service);
	}

	// create service
	@PostMapping("/save")
	public ServiceDto save(@RequestBody ServiceDto serviceDto) {
		Service1 service = serviceConverter.dtoToEntity(serviceDto);
		service = serviceService.save(service);
		return serviceConverter.entityToDto(service);
	}

	/*
	// update service
	@PutMapping("/save/{Code_Service}")
	public ServiceDto updateService(@RequestBody ServiceDto serviceDto, @PathVariable("Code_Service") long id) {
		Service1 service = serviceConverter.dtoToEntity(serviceDto);
		Service1 existingservice = serviceService.get(id);
		existingservice.setNom_Service(service.getNom_Service());
		existingservice = serviceService.save(existingservice);
		return serviceConverter.entityToDto(existingservice);
	}
	*/
	

	
	// update service
	@PutMapping("/save/{Code_Service}")
	public ServiceDto updateService(@RequestBody ServiceDto serviceDto, @PathVariable("Code_Service") long id) {
		Service1 existingservice = serviceService.get(id);
		existingservice.setNom_Service(serviceDto.getNom_Service());
		existingservice = serviceService.save(existingservice);
		return serviceConverter.entityToDto(existingservice);
	}
	

	/*
	// delete service by Code_Service
	@DeleteMapping("delete/{Code_Service}")
	public String deleteService(@PathVariable("Code_Service") long id) {
		Service1 existingservice = serviceService.get(id);
		ServiceDto serviceDto = serviceConverter.entityToDto(existingservice);
		serviceService.delete(id);
		return serviceDto.toString() + " " + "is deleted";
	}
	*/
	
	// delete service by Code_Service
		@DeleteMapping("delete/{Code_Service}")
		public String deleteService(@PathVariable("Code_Service") long id) {
			Service1 existingservice = serviceService.get(id);
			serviceService.delete(id);
			return existingservice.toString() + " " + "is deleted";
		}

}
