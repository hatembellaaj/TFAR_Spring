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
import tn.mdweb.dsi.tfar.converter.FrereConverter;
import tn.mdweb.dsi.tfar.domain.dto.FrereDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.enumeration.Atteint;
import tn.mdweb.dsi.tfar.enumeration.Decedes;
import tn.mdweb.dsi.tfar.enumeration.PlaceFraterie;
import tn.mdweb.dsi.tfar.enumeration.Sexe;
import tn.mdweb.dsi.tfar.service.FrereService;

@RestController
@RequestMapping("/api/freres")
public class FrereController {
	
	
	@Autowired
	private FrereService frereService;
	
	@Autowired
	private FrereConverter frereConverter;

	// get all freresDto
	@GetMapping("/findAll")
	public List<FrereDto> getAllFreres() {
		List<Frere> findAll = frereService.listAll();
		return frereConverter.entityToDto(findAll);
	}

	// get frereDto by frereId
	@GetMapping("/find/{frereId}")
	public FrereDto getCousinDtoById(@PathVariable(value = "frereId") long id) {
		Frere frere = frereService.get(id);
		return frereConverter.entityToDto(frere);
	}

	// create frereDto 
			@PostMapping("/save")
			public FrereDto save(@RequestBody FrereDto frereDto)  throws Exception {
				return frereConverter.entityToDto(frereService.save(frereDto));
			}

			// update frereDto 
			@PutMapping("/save/{id}")
			public FrereDto updateFrereDto(@RequestBody FrereDto frereDto, @PathVariable("id") long id)  throws Exception {
				Frere existingfrere = frereService.get(id);
				existingfrere.setNom(frereDto.getNom());
				existingfrere.setPrenom(frereDto.getPrenom());
				existingfrere.setAtteint(Atteint.valueOf(frereDto.getAtteint()));
				existingfrere.setPlaceFratrie(PlaceFraterie.valueOf(frereDto.getPlaceFratrie()));
				existingfrere.setSexe(Sexe.valueOf(frereDto.getSexe()));
				existingfrere.setDecedes(Decedes.valueOf(frereDto.getDecedes()));
				existingfrere.setAge(frereDto.getAge());
				existingfrere.setFiche(new Fiche(frereDto.getNDFiche()));
				FrereDto f=frereConverter.entityToDto(existingfrere);
				return frereConverter.entityToDto(frereService.save(f));
			}

			// delete frere by frereId
			@DeleteMapping("delete/{frereId}")
			public String deleteFrere(@PathVariable("frereId") long id) {
				Frere existingfrere = frereService.get(id);
				frereService.delete(id);
				return existingfrere.toString() + " is deleted";
			}


	
	

}
