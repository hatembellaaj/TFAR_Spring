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
import tn.mdweb.dsi.tfar.converter.MedecinConverter;
import tn.mdweb.dsi.tfar.domain.dto.MedecinDto;
import tn.mdweb.dsi.tfar.domain.entity.Medecin;
import tn.mdweb.dsi.tfar.service.MedecinService;


@RestController
@RequestMapping("/api/medecinDtos")
public class MedecinController {
	
	@Autowired
	private MedecinService medecinService;

	@Autowired
	private MedecinConverter  medecinConverter;

	// get all medecinDtos
	@GetMapping("/findAll")
	public List<MedecinDto> getAllMedecinDtos() {

		List<Medecin> findAll = medecinService.listAll();
		return medecinConverter.entityToDto(findAll);
	}

	// get medecinDto by cin
	@GetMapping("/find/{cin}")
	public MedecinDto getMedecinDtoById(@PathVariable(value = "cin") Long id) {
		Medecin patient = medecinService.get(id);
		return medecinConverter.entityToDto(patient);
	}

	// create medecin
	@PostMapping("/save")
	public MedecinDto save(@RequestBody MedecinDto medecinDto) throws Exception {
		Medecin medecin = medecinConverter.dtoToEntity(medecinDto);
		medecin = medecinService.save(medecin);
		return medecinConverter.entityToDto(medecin);
	}

	// update medecin
	@PutMapping("/save/{cin}")
	public MedecinDto updateMedecin(@RequestBody MedecinDto medecinDto,
			@PathVariable("cin") Long id) throws Exception {
		Medecin existingmedecin = medecinService.get(id);
		existingmedecin.setNom(medecinDto.getNom());
		existingmedecin.setPrenom(medecinDto.getPrenom());
		existingmedecin.setGrade(medecinDto.getGrade());
		existingmedecin.setType(medecinDto.getType());
		existingmedecin.setGouvernorat(medecinDto.getGouvernorat());
		existingmedecin.setAdresse(medecinDto.getAdresse());
		existingmedecin.setTel(medecinDto.getTel());
		existingmedecin.setPoste(medecinDto.getPoste());
		existingmedecin.setFax(medecinDto.getFax());
		existingmedecin.setEmail(medecinDto.getEmail());
		existingmedecin.setImage(medecinDto.getImage());
		existingmedecin.setLogin(medecinDto.getLogin());
		existingmedecin.setPassword(medecinDto.getPassword());
		existingmedecin.setUrl(medecinDto.getUrl());
		existingmedecin.setHopital(medecinDto.getHopital());
		existingmedecin.setService1(medecinDto.getService1());

		existingmedecin = medecinService.save(existingmedecin);
		return medecinConverter.entityToDto(existingmedecin);
	}

	// delete medecin by cin
	@DeleteMapping("delete/{cin}")
	public String deleteMedecin(@PathVariable("cin") Long id) {
		Medecin existingmedecin = medecinService.get(id);
		medecinService.delete(id);
		return existingmedecin.toString() + " " + "is deleted";
	}

}
