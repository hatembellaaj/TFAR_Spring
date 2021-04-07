package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.mdweb.dsi.tfar.converter.PatientConverter;
import tn.mdweb.dsi.tfar.converter.ScientifiqueConverter;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.dto.ScientifiqueDto;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.domain.entity.Scientifique;
import tn.mdweb.dsi.tfar.service.PatientService;
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
	@GetMapping("/find/{code_sc}")
	public ScientifiqueDto getScientifiqueDtoById(@PathVariable(value = "code_sc") Long id) {
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
	@PutMapping("/save/{code_sc}")
	public ScientifiqueDto updateScientifique(@RequestBody ScientifiqueDto scientifiqueDto,
			@PathVariable("code_sc") Long id) throws Exception {
		Scientifique existingscientifique = scientifiqueService.get(id);
		existingscientifique.setNom_sc(scientifiqueDto.getNom_sc());
		existingscientifique.setPrenom_sc(scientifiqueDto.getPrenom_sc());
		existingscientifique.setService_sc(scientifiqueDto.getService_sc());
		existingscientifique.setCentre_sc(scientifiqueDto.getCentre_sc());
		existingscientifique.setAdresse_sc(scientifiqueDto.getAdresse_sc());
		existingscientifique.setTel_sc(scientifiqueDto.getTel_sc());
		existingscientifique.setEmail_sc(scientifiqueDto.getEmail_sc());
		existingscientifique.setPhoto_sc(scientifiqueDto.getPhoto_sc());
		existingscientifique.setType_sc(scientifiqueDto.getType_sc());
		existingscientifique.setLogin_sc(scientifiqueDto.getLogin_sc());
		existingscientifique.setPasswd_sc(scientifiqueDto.getPasswd_sc());
		existingscientifique.setUrl(scientifiqueDto.getUrl());

		existingscientifique = scientifiqueService.save(existingscientifique);
		return scientifiqueConverter.entityToDto(existingscientifique);
	}

	// delete scientifique by code_sc
	@DeleteMapping("delete/{code_sc}")
	public String deleteScientifique(@PathVariable("code_sc") Long id) {
		Scientifique existingscientifique = scientifiqueService.get(id);
		scientifiqueService.delete(id);
		return existingscientifique.toString() + " " + "is deleted";
	}

}
