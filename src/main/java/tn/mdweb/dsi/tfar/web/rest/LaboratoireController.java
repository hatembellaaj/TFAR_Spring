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
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;
import tn.mdweb.dsi.tfar.service.LaboratoireService;

@RestController
@RequestMapping("/api/laboratoires")
public class LaboratoireController {
	
	@Autowired
	private LaboratoireService laboratoireService;

	// get all laboratoires
	@GetMapping("/findAll")
	public List<Laboratoire> getAllLaboratoires() {
		List<Laboratoire> findAll = laboratoireService.listAll();
		return findAll;
	}

	// get laboratoireDto by id
	@GetMapping("/find/{id}")
	public Laboratoire getLaboratoireById(@PathVariable(value = "id") long id) {
		Laboratoire laboratoire = laboratoireService.get(id);
		return laboratoire;
	}

	// create laboratoire
	@PostMapping("/save")
	public Laboratoire save(@RequestBody Laboratoire laboratoire) {
		return laboratoireService.save(laboratoire);
	}
	

	
	// update laboratoire
	@PutMapping("/save/{id}")
	public Laboratoire updateLaboratoire(@RequestBody Laboratoire laboratoire, @PathVariable("id") long id) {
		Laboratoire existinglaboratoire = laboratoireService.get(id);
		existinglaboratoire.setNom(laboratoire.getNom());
		return laboratoireService.save(existinglaboratoire);
	}
	
	
	// delete laboratoire by id
		@DeleteMapping("delete/{id}")
		public String deleteLaboratoire(@PathVariable("id") long id) {
			Laboratoire existinglaboratoire = laboratoireService.get(id);
			laboratoireService.delete(id);
			return existinglaboratoire.toString()+ " is deleted";
		}

}
