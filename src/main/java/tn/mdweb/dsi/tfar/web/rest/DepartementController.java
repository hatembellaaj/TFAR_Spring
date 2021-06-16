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
import tn.mdweb.dsi.tfar.domain.entity.Departement;
import tn.mdweb.dsi.tfar.service.DepartementService;

@RestController
@RequestMapping("/api/departements")
public class DepartementController {

	@Autowired
	private DepartementService departementService;

	// get all departements
	@GetMapping("/findAll")
	public List<Departement> getAllDepartements() {

		List<Departement> findAll = departementService.listAll();
		return findAll;
	}

	// get departement by code
	@GetMapping("/find/{code}")
	public Departement getDepartementById(@PathVariable(value = "code") long id) {
		Departement departement = departementService.get(id);
		return departement;
	}

	// create departement
	@PostMapping("/save")
	public Departement save(@RequestBody Departement departement) {
		return departementService.save(departement);
	}
	

	
	// update departement
	@PutMapping("/save/{code}")
	public Departement updateDepartement(@RequestBody Departement departement, @PathVariable("code") long id) {
		Departement existingdepartement = departementService.get(id);
		existingdepartement.setNom(departement.getNom());
		return departementService.save(existingdepartement);
	}
	
	
	// delete departement by code
		@DeleteMapping("delete/{code}")
		public String deleteDepartement(@PathVariable("code") long id) {
			Departement existingdepartement = departementService.get(id);
			departementService.delete(id);
			return existingdepartement.toString() + " is deleted";
		}

}
