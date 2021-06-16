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
import tn.mdweb.dsi.tfar.domain.entity.Organisme;
import tn.mdweb.dsi.tfar.service.OrganismeService;

@RestController
@RequestMapping("/api/organismes")
public class OrganismeController {

	@Autowired
	private OrganismeService organismeService;

	// get all organismes
	@GetMapping("/findAll")
	public List<Organisme> getAllOrganismes() {
		List<Organisme> findAll = organismeService.listAll();
		return findAll;
	}

	// get organisme by code
	@GetMapping("/find/{code}")
	public Organisme getOrganismeById(@PathVariable(value = "code") long id) {
		Organisme organisme = organismeService.get(id);
		return organisme;
	}

	// create organisme
	@PostMapping("/save")
	public Organisme save(@RequestBody Organisme organisme) {
		return organismeService.save(organisme);
	}

	// update organisme
	@PutMapping("/save/{code}")
	public Organisme updateOrganisme(@RequestBody Organisme organisme, @PathVariable("code") long id) {
		Organisme existingorganisme = organismeService.get(id);
		existingorganisme.setNom(organisme.getNom());
		existingorganisme.setAdresse(organisme.getAdresse());
		existingorganisme.setTel(organisme.getTel());
		existingorganisme.setContact(organisme.getContact());
		existingorganisme.setEmail(organisme.getEmail());
		existingorganisme.setType(organisme.getType());
		return organismeService.save(existingorganisme);
	}


	// delete organisme by code
	@DeleteMapping("delete/{code}")
	public String deleteOrganisme(@PathVariable("code") long id) {
		Organisme existingorganisme = organismeService.get(id);
		organismeService.delete(id);
		return existingorganisme.toString() + " is deleted";
	}

}
