package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Role;
import tn.mdweb.dsi.tfar.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	public List<Role> listAll() {
		return roleRepository.findAll();	
	}
	
	public Role save(Role role) {
		roleRepository.save(role);
		return role;
	}
	
	public Role get(long id) {
		return roleRepository.findById(id).get();
	}
	
	public void delete(long id) {
		roleRepository.deleteById(id);
	}

}
