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
import tn.mdweb.dsi.tfar.domain.dto.FicheListDto;
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
	
	@GetMapping("/findAllFicheListDto")
	public List<FicheListDto> getAllFichesListDto() {
		List<FicheListDto> findAllListDto = ficheService.listAllFicheListDto();
		return findAllListDto;
	}

	// get fiche by nDossierFiche
		@GetMapping("/find/{idFiche}")
		public FicheDto getFicheDtoById(@PathVariable(value = "idFiche") Long id) {
			Fiche fiche = ficheService.get(id);
			return ficheConverter.toDto(fiche);
		}

		// create ficheDto
		@PostMapping("/save") 
		public FicheDto save(@RequestBody FicheDto ficheDto)  throws Exception{
			return ficheConverter.toDto(ficheService.save(ficheDto));
		}
		

		
		// update ficheDto
		@PutMapping("/save/{idFiche}")
		public FicheDto updateFiche(@RequestBody FicheDto ficheDto, @PathVariable("idFiche") Long id) throws Exception{
			FicheDto ficheupdate = ficheDto;
			ficheupdate.setIdFiche(id);
			return ficheConverter.toDto(ficheService.save(ficheupdate));
		}
		
		
		// delete fiche by nDossierFiche
			@DeleteMapping("delete/{idFiche}")
			public String deleteFiche(@PathVariable("idFiche") Long id) {
				Fiche existingfiche = ficheService.get(id);
				ficheService.delete(id);
				return existingfiche.toString() + " is deleted";
			}



}
