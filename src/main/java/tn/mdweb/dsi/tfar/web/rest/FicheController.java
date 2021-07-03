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

import tn.mdweb.dsi.tfar.converter.FicheConverter;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.service.FicheService;

@RestController
@RequestMapping("/api/fiches")
public class FicheController {
	
	@Autowired
	private FicheService ficheService;
	
	@Autowired
	private FicheConverter ficheConverter;

	// get all fiches
	@GetMapping("/findAll")
	public List<FicheDto> getAllFiches() {
		List<Fiche> findAll = ficheService.listAll();
		return ficheConverter.toDto(findAll);
	}

	// get fiche by nDossierFiche
		@GetMapping("/find/{nDossierFiche}")
		public FicheDto getFicheDtoById(@PathVariable(value = "nDossierFiche") String id) {
			Fiche fiche = ficheService.get(id);
			return ficheConverter.toDto(fiche);
		}

		// create ficheDto
		@PostMapping("/save") 
		public FicheDto save(@RequestBody FicheDto ficheDto)  throws Exception{
			return ficheConverter.toDto(ficheService.save(ficheDto));
		}
		

		
		// update ficheDto
		@PutMapping("/save/{nDossierFiche}")
		public FicheDto updateFiche(@RequestBody FicheDto ficheDto, @PathVariable("nDossierFiche") String id) throws Exception{
			FicheDto ficheupdate = ficheDto;
			ficheupdate.setNDossierFiche(id);
			return ficheConverter.toDto(ficheService.save(ficheupdate));
		}
		
		
		// delete fiche by nDossierFiche
			@DeleteMapping("delete/{nDossierFiche}")
			public String deleteFiche(@PathVariable("nDossierFiche") String id) {
				Fiche existingfiche = ficheService.get(id);
				ficheService.delete(id);
				return existingfiche.toString() + " is deleted";
			}



}
