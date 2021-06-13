package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

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

	// get serviceDto by code
	@GetMapping("/find/{code}")
	public ServiceDto getServiceDtoById(@PathVariable(value = "code") long id) {
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
	

	
	// update service
	@PutMapping("/save/{code}")
	public ServiceDto updateService(@RequestBody ServiceDto serviceDto, @PathVariable("code") long id) {
		Service1 existingservice = serviceService.get(id);
		existingservice.setNom(serviceDto.getNom());
		existingservice = serviceService.save(existingservice);
		return serviceConverter.entityToDto(existingservice);
	}
	
	
	// delete service by code
		@DeleteMapping("delete/{code}")
		public String deleteService(@PathVariable("code") long id) {
			Service1 existingservice = serviceService.get(id);
			serviceService.delete(id);
			return existingservice.toString() + " " + "is deleted";
		}

}
