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
		serviceDto.setCode_Service(service.getCode_Service());
		serviceDto.setNom_Service(service.getNom_Service());
		return serviceDto;
	}

	public List<ServiceDto> entityToDto(List<Service1> services) {

		return services.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Service1 dtoToEntity(ServiceDto serviceDto) {
		Service1 service = new Service1();
		service.setCode_Service(serviceDto.getCode_Service());
		service.setNom_Service(serviceDto.getNom_Service());
		return service;

	}

	public List<Service1> dtoToEntity(List<ServiceDto> serviceDtos) {
		
		return serviceDtos.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	

}
