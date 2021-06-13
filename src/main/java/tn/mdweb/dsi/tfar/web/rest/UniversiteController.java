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
import tn.mdweb.dsi.tfar.converter.UniversiteConverter;
import tn.mdweb.dsi.tfar.domain.dto.UniversiteDto;
import tn.mdweb.dsi.tfar.domain.entity.Universite;
import tn.mdweb.dsi.tfar.service.UniversiteService;


@RestController
@RequestMapping("/api/universiteDtos")
public class UniversiteController {
	
	@Autowired
	private UniversiteService universiteService;

	@Autowired
	private UniversiteConverter universiteConverter;

	// get all universiteDtos
	@GetMapping("/findAll")
	public List<UniversiteDto> getAllUniversiteDtos() {

		List<Universite> findAll = universiteService.listAll();
		return universiteConverter.entityToDto(findAll);
	}

	// get universiteDto by code_universite
	@GetMapping("/find/{code_universite}")
	public UniversiteDto getUniversiteDtoById(@PathVariable(value = "code_universite") long id) {
		Universite universite = universiteService.get(id);
		return universiteConverter.entityToDto(universite);
	}

	// create universite
	@PostMapping("/save")
	public UniversiteDto save(@RequestBody UniversiteDto universiteDto) {
		Universite universite = universiteConverter.dtoToEntity(universiteDto);
		universite = universiteService.save(universite);
		return universiteConverter.entityToDto(universite);
	}
	

	
	// update universite
	@PutMapping("/save/{code_universite}")
	public UniversiteDto updateUniversite(@RequestBody UniversiteDto universiteDto, @PathVariable("code_universite") long id) {
		Universite existinguniversite = universiteService.get(id);
		existinguniversite.setNom(universiteDto.getNom());
		existinguniversite.setAdresse(universiteDto.getAdresse());
		existinguniversite.setContact(universiteDto.getContact());
		existinguniversite.setEmail(universiteDto.getEmail());
		existinguniversite.setTel(universiteDto.getTel());
		existinguniversite = universiteService.save(existinguniversite);
		return universiteConverter.entityToDto(existinguniversite);
	}
	
	
	// delete universite by code_universite
		@DeleteMapping("delete/{code_universite}")
		public String deleteUniversite(@PathVariable("code_universite") long id) {
			Universite existinguniversite = universiteService.get(id);
			universiteService.delete(id);
			return existinguniversite.toString() + " " + "is deleted";
		}


}
