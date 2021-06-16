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
import tn.mdweb.dsi.tfar.domain.entity.Cytogenetique;
import tn.mdweb.dsi.tfar.service.CytogenetiqueService;

@RestController
@RequestMapping("/api/cytogenetiques")
public class CytogenetiqueController {
	
	@Autowired
	private CytogenetiqueService cytogenetiqueService;

	// get all cytogenetiques
	@GetMapping("/findAll")
	public List<Cytogenetique> getAllCytogenetiques() {
		List<Cytogenetique> findAll = cytogenetiqueService.listAll();
		return findAll;
	}

	// get cytogenetique by nEtudeCyto
	@GetMapping("/find/{nEtudeCyto}")
	public Cytogenetique getUserById(@PathVariable(value = "nEtudeCyto") Long id) {
		Cytogenetique cytogenetique = cytogenetiqueService.get(id);
		return cytogenetique;
	}

	// create cytogenetique
	@PostMapping("/save")
	public Cytogenetique save(@RequestBody Cytogenetique cytogenetique) throws Exception {
		return cytogenetiqueService.save(cytogenetique);
	}

	// update cytogenetique
	@PutMapping("/save/{nEtudeCyto}")
	public Cytogenetique updateCytogenetique(@RequestBody Cytogenetique cytogenetique,
			@PathVariable("nEtudeCyto") Long id) throws Exception {
		Cytogenetique existingcytogenetique = cytogenetiqueService.get(id);
		existingcytogenetique.setLymphocytes(cytogenetique.getLymphocytes());
		existingcytogenetique.setDateSang(cytogenetique.getDateSang());
		existingcytogenetique.setAgentPortant(cytogenetique.getAgentPortant());
		existingcytogenetique.setInstabilite(cytogenetique.getInstabilite());
		existingcytogenetique.setInstabilitePourcentage(cytogenetique.getInstabilitePourcentage());
		existingcytogenetique.setIr(cytogenetique.getIr());
		existingcytogenetique.setIrPourcentage(cytogenetique.getIrPourcentage());
		existingcytogenetique.setMoelle(cytogenetique.getMoelle());
		existingcytogenetique.setDateMoelle(cytogenetique.getDateMoelle());
		existingcytogenetique.setResultatMoelle(cytogenetique.getResultatMoelle());
		existingcytogenetique.setLaboratoire(cytogenetique.getLaboratoire());
		existingcytogenetique.setFiche(cytogenetique.getFiche());
		return cytogenetiqueService.save(existingcytogenetique);
	}

	// delete cytogenetique by nEtudeCyto
	@DeleteMapping("delete/{nEtudeCyto}")
	public String deleteCytogenetique(@PathVariable("nEtudeCyto") Long id) {
		Cytogenetique existingcytogenetique = cytogenetiqueService.get(id);
		cytogenetiqueService.delete(id);
		return existingcytogenetique.toString() +  " is deleted";
	}


}
