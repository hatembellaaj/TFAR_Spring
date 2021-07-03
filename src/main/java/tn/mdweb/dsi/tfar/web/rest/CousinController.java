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
import tn.mdweb.dsi.tfar.converter.CousinConverter;
import tn.mdweb.dsi.tfar.domain.dto.CousinDto;
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.enumeration.PlaceCousin;
import tn.mdweb.dsi.tfar.enumeration.Sexe;
import tn.mdweb.dsi.tfar.service.CousinService;

@RestController
@RequestMapping("/api/cousins")
public class CousinController {
	
	@Autowired
	private CousinService cousinService;
	
	@Autowired
	private CousinConverter cousinConverter;

	// get all cousinsDto
	@GetMapping("/findAll")
	public List<CousinDto> getAllCousinsDto() {
		List<Cousin> findAll = cousinService.listAll();
		return cousinConverter.entityToDto(findAll);
	}

	// get cousinsDto by cousinId
		@GetMapping("/find/{cousinId}")
		public CousinDto getCousinDtoById(@PathVariable(value = "cousinId") long id) {
			Cousin cousin = cousinService.get(id);
			return cousinConverter.entityToDto(cousin);
		}

		// create cousinsDto
		@PostMapping("/save")
		public CousinDto save(@RequestBody CousinDto cousinDto)  throws Exception {
			return cousinConverter.entityToDto(cousinService.save(cousinDto));
		}

		// update cousinsDto
		@PutMapping("/save/{id}")
		public CousinDto updateCousinDto(@RequestBody CousinDto cousinDto, @PathVariable("id") long id)  throws Exception {
			Cousin existingcousin = cousinService.get(id);
			
			existingcousin.setNom(cousinDto.getNom());
			existingcousin.setPrenom(cousinDto.getPrenom());
			existingcousin.setPlaceCousin(PlaceCousin.valueOf(cousinDto.getPlaceCousin()));
			existingcousin.setSexe(Sexe.valueOf(cousinDto.getSexe()));
			existingcousin.setFiche(new Fiche(cousinDto.getNDFiche()));
	
			CousinDto a=cousinConverter.entityToDto(existingcousin);
			return cousinConverter.entityToDto(cousinService.save(a));
		}

		// delete cousin by cousinId
				@DeleteMapping("delete/{cousinId}")
				public String deleteCousin(@PathVariable("cousinId") long id) {
					Cousin existingcousin = cousinService.get(id);
					cousinService.delete(id);
					return existingcousin.toString() + " is deleted";
				}

	

}
