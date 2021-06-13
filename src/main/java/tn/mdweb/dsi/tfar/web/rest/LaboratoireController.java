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
import tn.mdweb.dsi.tfar.converter.LaboratoireConverter;
import tn.mdweb.dsi.tfar.domain.dto.LaboratoireDto;
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;
import tn.mdweb.dsi.tfar.service.LaboratoireService;

@RestController
@RequestMapping("/api/laboratoireDtos")
public class LaboratoireController {
	
	@Autowired
	private LaboratoireService laboratoireService;

	@Autowired
	private LaboratoireConverter laboratoireConverter;

	// get all laboratoireDtos
	@GetMapping("/findAll")
	public List<LaboratoireDto> getAllLaboratoires() {

		List<Laboratoire> findAll = laboratoireService.listAll();
		return laboratoireConverter.entityToDto(findAll);
	}

	// get laboratoireDto by id
	@GetMapping("/find/{id}")
	public LaboratoireDto getLaboratoireDtoById(@PathVariable(value = "id") long id) {
		Laboratoire laboratoire = laboratoireService.get(id);
		return laboratoireConverter.entityToDto(laboratoire);
	}

	// create laboratoire
	@PostMapping("/save")
	public LaboratoireDto save(@RequestBody LaboratoireDto laboratoireDto) {
		Laboratoire laboratoire = laboratoireConverter.dtoToEntity(laboratoireDto);
		laboratoire = laboratoireService.save(laboratoire);
		return laboratoireConverter.entityToDto(laboratoire);
	}
	

	
	// update laboratoire
	@PutMapping("/save/{id}")
	public LaboratoireDto updateLaboratoire(@RequestBody LaboratoireDto laboratoireDto, @PathVariable("id") long id) {
		Laboratoire existinglaboratoire = laboratoireService.get(id);
		existinglaboratoire.setNom(laboratoireDto.getNom());
		existinglaboratoire = laboratoireService.save(existinglaboratoire);
		return laboratoireConverter.entityToDto(existinglaboratoire);
	}
	
	
	// delete service by id
		@DeleteMapping("delete/{id}")
		public String deleteLaboratoire(@PathVariable("id") long id) {
			Laboratoire existinglaboratoire = laboratoireService.get(id);
			laboratoireService.delete(id);
			return existinglaboratoire.toString() + " " + "is deleted";
		}

}
