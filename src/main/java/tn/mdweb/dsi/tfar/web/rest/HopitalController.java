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

//import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.mdweb.dsi.tfar.converter.HopitalConverter;
import tn.mdweb.dsi.tfar.domain.dto.HopitalDto;
import tn.mdweb.dsi.tfar.domain.entity.Hopital;
import tn.mdweb.dsi.tfar.service.HopitalService;

@RestController
@RequestMapping("/api/hopitalDtos")
public class HopitalController {

	@Autowired
	private HopitalService hopitalService;

	@Autowired
	private HopitalConverter hopitalConverter;

	// get all hopitalDtos
	@GetMapping("/findAll")
	public List<HopitalDto> getAllHopitalDtos() {
		List<Hopital> findAll = hopitalService.listAll();
		return hopitalConverter.entityToDto(findAll);
	}

	// get hopitalDto by code
	@GetMapping("/find/{code}")
	public HopitalDto getHopitaleDtoById(@PathVariable(value = "code") long id) {
		Hopital hopitale = hopitalService.get(id);
		return hopitalConverter.entityToDto(hopitale);
	}

	// create hopital
	@PostMapping("/save")
	public HopitalDto save(@RequestBody HopitalDto hopitaleDto) {
		Hopital hopitale = hopitalConverter.dtoToEntity(hopitaleDto);
		hopitale = hopitalService.save(hopitale);
		return hopitalConverter.entityToDto(hopitale);
	}

	// update hopital
	@PutMapping("/save/{code}")
	public HopitalDto updateHopitale(@RequestBody HopitalDto hopitalDto, @PathVariable("code") long id) {
		Hopital existinghopital = hopitalService.get(id);
		existinghopital.setNom(hopitalDto.getNom());
		existinghopital.setAdresse(hopitalDto.getAdresse());
		existinghopital.setTel(hopitalDto.getTel());
		existinghopital.setContact(hopitalDto.getContact());
		existinghopital.setEmail(hopitalDto.getEmail());
		existinghopital = hopitalService.save(existinghopital);
		return hopitalConverter.entityToDto(existinghopital);
	}


	// delete hopital by code
	@DeleteMapping("delete/{code}")
	public String deleteHopital(@PathVariable("code") long id) {
		Hopital existinghopital = hopitalService.get(id);
		hopitalService.delete(id);
		return existinghopital.toString() + " " + "is deleted";
	}

}
