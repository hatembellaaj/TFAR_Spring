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

import tn.mdweb.dsi.tfar.converter.CytogeneticienConverter;
import tn.mdweb.dsi.tfar.domain.dto.CytogeneticienDto;
import tn.mdweb.dsi.tfar.domain.entity.Cytogeneticien;
import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.domain.entity.Service1;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.service.CytogeneticienService;


@RestController
@RequestMapping("/api/cytogeneticienDtos")
public class CytogeneticienController {
	
	
	@Autowired
	private CytogeneticienService cytogeneticienService;

	@Autowired
	private CytogeneticienConverter cytogeneticienConverter;

	// get all cytogeneticienDtos
	@GetMapping("/findAll")
	public List<CytogeneticienDto> getAllCytogeneticienDtos() {

		List<Cytogeneticien> findAll = cytogeneticienService.listAll();
		return cytogeneticienConverter.entityToDto(findAll);
	}

	// get cytogeneticienDto by code
	@GetMapping("/find/{code}")
	public CytogeneticienDto getCytogeneticienDtoById(@PathVariable(value = "code") Long id) {
		Cytogeneticien cytogeneticien = cytogeneticienService.get(id);
		return cytogeneticienConverter.entityToDto(cytogeneticien);
	}

	// create cytogeneticien
	@PostMapping("/save")
	public Cytogeneticien save(@RequestBody CytogeneticienDto cytogeneticienDto) throws ValidationException {
		Cytogeneticien cytogeneticien = cytogeneticienService.save(cytogeneticienDto);
		return cytogeneticien;
	}

	// update cytogeneticien
	@PutMapping("/save/{code}")
	public Cytogeneticien updateCytogeneticien(@RequestBody CytogeneticienDto cytogeneticienDto,
			@PathVariable("code") Long id) throws Exception {
		Cytogeneticien existingcytogeneticien = cytogeneticienService.get(id);
		existingcytogeneticien.setNom(cytogeneticienDto.getNom());
		existingcytogeneticien.setPrenom(cytogeneticienDto.getPrenom());
		existingcytogeneticien.setService(cytogeneticienDto.getService());
		existingcytogeneticien.setEtab(cytogeneticienDto.getEtab());
		existingcytogeneticien.setAdresse(cytogeneticienDto.getAdresse());
		existingcytogeneticien.setTel(cytogeneticienDto.getTel());
		existingcytogeneticien.setPoste(cytogeneticienDto.getPoste());
		existingcytogeneticien.setFax(cytogeneticienDto.getFax());
		existingcytogeneticien.setEmail(cytogeneticienDto.getEmail());
		existingcytogeneticien.setPhoto(cytogeneticienDto.getPhoto());
		existingcytogeneticien.setType(cytogeneticienDto.getType());
		existingcytogeneticien.setLogin(cytogeneticienDto.getLogin());
		existingcytogeneticien.setPassword(cytogeneticienDto.getPassword());
		existingcytogeneticien.setUrl(cytogeneticienDto.getUrl());
		existingcytogeneticien.setHopital(new Hopital(cytogeneticienDto.getCodeHopital()));
		existingcytogeneticien.setService1(new Service1(cytogeneticienDto.getCodeService1()));
		/*existingcytogeneticien.setHopital(cytogeneticienDto.getHopital());
		existingcytogeneticien.setService1(cytogeneticienDto.getService1());*/

		existingcytogeneticien = cytogeneticienService.update(existingcytogeneticien);
		return existingcytogeneticien;
	}

	// delete cytogeneticien by code
	@DeleteMapping("delete/{code}")
	public String deleteCytogeneticien(@PathVariable("code") Long id) {
		Cytogeneticien existingcytogeneticien = cytogeneticienService.get(id);
		cytogeneticienService.delete(id);
		return existingcytogeneticien.toString() + " " + "is deleted";
	}


}
