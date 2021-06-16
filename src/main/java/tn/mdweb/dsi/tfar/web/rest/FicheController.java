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
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.service.FicheService;

@RestController
@RequestMapping("/api/fiches")
public class FicheController {
	
	@Autowired
	private FicheService ficheService;

	// get all fiches
	@GetMapping("/findAll")
	public List<Fiche> getAllFiches() {
		List<Fiche> findAll = ficheService.listAll();
		return findAll;
	}

	// get fiche by nDossierFiche
		@GetMapping("/find/{nDossierFiche}")
		public Fiche getFicheById(@PathVariable(value = "nDossierFiche") String id) {
			Fiche fiche = ficheService.get(id);
			return fiche;
		}

		// create fiche
		@PostMapping("/save")
		public Fiche save(@RequestBody Fiche fiche) {
			return ficheService.save(fiche);
		}
		

		
		// update fiche
		@PutMapping("/save/{nDossierFiche}")
		public Fiche updateFiche(@RequestBody Fiche fiche, @PathVariable("nDossierFiche") String id) {
			Fiche ficheupdate = fiche;
			ficheupdate.setnDossierFiche(id);
			return ficheService.save(ficheupdate);
		}
		
		
		// delete fiche by nDossierFiche
			@DeleteMapping("delete/{nDossierFiche}")
			public String deleteFiche(@PathVariable("nDossierFiche") String id) {
				Fiche existingfiche = ficheService.get(id);
				ficheService.delete(id);
				return existingfiche.toString() + " is deleted";
			}



}
