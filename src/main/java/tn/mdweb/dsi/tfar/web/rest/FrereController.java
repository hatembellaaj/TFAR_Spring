package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.service.FrereService;

@RestController
@RequestMapping("/api/freres")
public class FrereController {
	
	
	@Autowired
	private FrereService frereService;

	// get all freres
	@GetMapping("/findAll")
	public List<Frere> getAllFreres() {
		List<Frere> findAll = frereService.listAll();
		return findAll;
	}

	// get frere by frereId
	@GetMapping("/find")
	@ResponseStatus(HttpStatus.OK)
	public Frere getFrereByCompositeId(@RequestParam(name = "nDossierF") String nDossierF,
			@RequestParam(name = "idF") Long idF) {
		Frere frere = frereService.get(nDossierF, idF);
		return frere;
	}

	// create frere
	@PostMapping("/save")
	public Frere save(@RequestBody Frere frere) throws Exception {
		return frereService.save(frere);
	}

	// update frere
	@PutMapping("/update")
	public Frere updateFrere(@RequestBody Frere frere,
			@RequestParam(name = "nDossierF") String nDossierF, @RequestParam(name = "idF") Long idF)
			throws Exception {
		Frere existingfrere = frereService.get(nDossierF, idF);
		existingfrere.setNom(frere.getNom());
		existingfrere.setPrenom(frere.getPrenom());
		existingfrere.setAtteint(frere.getAtteint());
		existingfrere.setPlaceFratrie(frere.getPlaceFratrie());
		existingfrere.setSexe(frere.getSexe());
		existingfrere.setDecedes(frere.getDecedes());
		existingfrere.setAge(frere.getAge());
		existingfrere.setFiche(frere.getFiche());
		return frereService.save(existingfrere);
	}

	// delete frere
	@DeleteMapping("/delete")
	public String deleteFrere(@RequestParam(name = "nDossierF") String nDossierF,
			@RequestParam(name = "idF") Long idF) {
		Frere existingfrere = frereService.get(nDossierF,idF);
		frereService.delete(nDossierF,idF);
		return existingfrere.toString() + " is deleted";
	}

	
	

}
