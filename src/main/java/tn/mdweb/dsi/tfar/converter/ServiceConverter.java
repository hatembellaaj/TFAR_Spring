package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.ServiceDto;
import tn.mdweb.dsi.tfar.domain.entity.Service1;

@Component
public class ServiceConverter {
	
	public ServiceDto entityToDto(Service1 service) {
		ServiceDto serviceDto = new ServiceDto();
		serviceDto.setCode_service(service.getCode_service());
		serviceDto.setNom_service(service.getNom_service());
		return serviceDto;
	}

	public List<ServiceDto> entityToDto(List<Service1> services) {

		return services.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Service1 dtoToEntity(ServiceDto serviceDto) {
		Service1 service = new Service1();
		service.setCode_service(serviceDto.getCode_service());
		service.setNom_service(serviceDto.getNom_service());
		return service;

	}

	public List<Service1> dtoToEntity(List<ServiceDto> serviceDtos) {
		
		return serviceDtos.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	

}
