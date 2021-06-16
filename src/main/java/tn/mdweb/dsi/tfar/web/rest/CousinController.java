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
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.service.CousinService;

@RestController
@RequestMapping("/api/cousins")
public class CousinController {
	
	@Autowired
	private CousinService cousinService;

	// get all cousins
	@GetMapping("/findAll")
	public List<Cousin> getAllCousins() {
		List<Cousin> findAll = cousinService.listAll();
		return findAll;
	}

	// get cousin by cousinId
	@GetMapping("/find")
	@ResponseStatus(HttpStatus.OK)
	public Cousin getCousinByCompositeId(@RequestParam(name = "nDossierC") String nDossierC,
			@RequestParam(name = "idC") Long idC) {
		Cousin cousin = cousinService.get(nDossierC, idC);
		return cousin;
	}

	// create cousin
	@PostMapping("/save")
	public Cousin save(@RequestBody Cousin cousin) throws Exception {
		return cousinService.save(cousin);
	}

	// update cousin
	@PutMapping("/update")
	public Cousin updateCousin(@RequestBody Cousin cousin,
			@RequestParam(name = "nDossierC") String nDossierC, @RequestParam(name = "idC") Long idC)
			throws Exception {
		Cousin existingcousin = cousinService.get(nDossierC, idC);
		existingcousin.setNom(cousin.getNom());
		existingcousin.setPrenom(cousin.getPrenom());
		existingcousin.setPlaceCousin(cousin.getPlaceCousin());
		existingcousin.setSexe(cousin.getSexe());
		existingcousin.setFiche(cousin.getFiche());
		return cousinService.save(existingcousin);
	}

	// delete cousin
	@DeleteMapping("/delete")
	public String deleteCousin(@RequestParam(name = "nDossierC") String nDossierC,
			@RequestParam(name = "idC") Long idC) {
		Cousin existingcousin = cousinService.get(nDossierC,idC);
		cousinService.delete(nDossierC,idC);
		return existingcousin.toString() + " is deleted";
	}

	

}
