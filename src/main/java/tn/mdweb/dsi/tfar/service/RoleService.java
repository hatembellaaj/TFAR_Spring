package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.RoleConverter;
import tn.mdweb.dsi.tfar.domain.dto.RoleDto;
import tn.mdweb.dsi.tfar.domain.entity.Role;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.RoleRepository;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleConverter roleConverter;
	
	
	public List<Role> listAll() {
		return roleRepository.findAll();	
	}
	
	public Role save(RoleDto roleDto) throws ValidationException{
		
		
		Long codeuser = roleDto.getCodeUser();
		List<User> users = userRepository.findAll();
		User x = users.stream().filter(h -> h.getCode().equals(codeuser)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The user is not found.");
		}
		Role r=roleConverter.dtoToEntity(roleDto);
		roleRepository.save(r);
		return r;
	}
	
	public Role get(long id) {
		return roleRepository.findById(id).get();
	}
	
	public void delete(long id) {
		roleRepository.deleteById(id);
	}

}
