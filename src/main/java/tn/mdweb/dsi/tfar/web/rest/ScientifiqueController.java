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


import tn.mdweb.dsi.tfar.converter.ScientifiqueConverter;
import tn.mdweb.dsi.tfar.domain.dto.ScientifiqueDto;
import tn.mdweb.dsi.tfar.domain.entity.Scientifique;

import tn.mdweb.dsi.tfar.service.ScientifiqueService;

@RestController
@RequestMapping("/api/scientifiqueDtos")
public class ScientifiqueController {

	@Autowired
	private ScientifiqueService scientifiqueService;

	@Autowired
	private ScientifiqueConverter scientifiqueConverter;

	// get all scientifiqueDtos
	@GetMapping("/findAll")
	public List<ScientifiqueDto> getAllPatientDtos() {

		List<Scientifique> findAll = scientifiqueService.listAll();
		return scientifiqueConverter.entityToDto(findAll);
	}

	// get scientifiqueDto by code_sc
	@GetMapping("/find/{code}")
	public ScientifiqueDto getScientifiqueDtoById(@PathVariable(value = "code") Long id) {
		Scientifique patient = scientifiqueService.get(id);
		return scientifiqueConverter.entityToDto(patient);
	}

	// create scientifique
	@PostMapping("/save")
	public ScientifiqueDto save(@RequestBody ScientifiqueDto scientifiqueDto) throws Exception {
		Scientifique scientifique = scientifiqueConverter.dtoToEntity(scientifiqueDto);
		scientifique = scientifiqueService.save(scientifique);
		return scientifiqueConverter.entityToDto(scientifique);
	}

	// update patient
	@PutMapping("/save/{code}")
	public ScientifiqueDto updateScientifique(@RequestBody ScientifiqueDto scientifiqueDto,
			@PathVariable("code") Long id) throws Exception {
		Scientifique existingscientifique = scientifiqueService.get(id);
		existingscientifique.setNom(scientifiqueDto.getNom());
		existingscientifique.setPrenom(scientifiqueDto.getPrenom());
		existingscientifique.setService(scientifiqueDto.getService());
		existingscientifique.setCentre(scientifiqueDto.getCentre());
		existingscientifique.setAdresse(scientifiqueDto.getAdresse());
		existingscientifique.setTel(scientifiqueDto.getTel());
		existingscientifique.setEmail(scientifiqueDto.getEmail());
		existingscientifique.setPhoto(scientifiqueDto.getPhoto());
		existingscientifique.setType(scientifiqueDto.getType());
		existingscientifique.setLogin(scientifiqueDto.getLogin());
		existingscientifique.setPassword(scientifiqueDto.getPassword());
		existingscientifique.setUrl(scientifiqueDto.getUrl());

		existingscientifique = scientifiqueService.save(existingscientifique);
		return scientifiqueConverter.entityToDto(existingscientifique);
	}

	// delete scientifique by code
	@DeleteMapping("delete/{code}")
	public String deleteScientifique(@PathVariable("code") Long id) {
		Scientifique existingscientifique = scientifiqueService.get(id);
		scientifiqueService.delete(id);
		return existingscientifique.toString() + " " + "is deleted";
	}

}
