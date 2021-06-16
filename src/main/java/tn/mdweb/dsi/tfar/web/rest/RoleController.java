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
import tn.mdweb.dsi.tfar.domain.entity.Role;
import tn.mdweb.dsi.tfar.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	// get all roles
	@GetMapping("/findAll")
	public List<Role> getAllRoles() {
		List<Role> findAll = roleService.listAll();
		return findAll;
	}

	// get role by idRole
	@GetMapping("/find/{idRole}")
	public Role getRoleById(@PathVariable(value = "idRole") Long id) {
		Role role = roleService.get(id);
		return role;
	}

	// create role
	@PostMapping("/save")
	public Role save(@RequestBody Role role) throws Exception {
		return roleService.save(role);
	}

	// update role
	@PutMapping("/save/{idRole}")
	public Role updateRole(@RequestBody Role role, @PathVariable("idRole") Long id) throws Exception {
		Role existingrole = roleService.get(id);
		existingrole.setTitre(role.getTitre());
		existingrole.setDescription(role.getDescription());
		existingrole.setDeleted(role.getDeleted());
		existingrole.setUser(role.getUser());
		return roleService.save(existingrole);
	}

	// delete role by idRole
	@DeleteMapping("delete/{idRole}")
	public String deleteRole(@PathVariable("idRole") Long id) {
		Role existingrole = roleService.get(id);
		roleService.delete(id);
		return existingrole.toString() + " is deleted";
	}

}
