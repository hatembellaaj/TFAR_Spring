package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.RoleDto;
import tn.mdweb.dsi.tfar.domain.entity.Role;
import tn.mdweb.dsi.tfar.domain.entity.User;

@Component
public class RoleConverter {
	
	public RoleDto entityToDto(Role role) {

		RoleDto map = new RoleDto(role.getIdRole(),role.getTitre(),role.getDescription(),role.getDeleted(),
				role.getUser().getCode());

		return map;
	}

	public List<RoleDto> entityToDto(List<Role> role) {

		return role.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Role dtoToEntity(RoleDto roleDto) {

		Role map = new Role(roleDto.getIdRole(),roleDto.getTitre(),roleDto.getDescription(),roleDto.getDeleted(), new User(roleDto.getCodeUser()));

		return map;
	}

	public List<Role> dtoToEntity(List<RoleDto> roleDto) {

		return roleDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
	

}
