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
import tn.mdweb.dsi.tfar.converter.HopitaleConverter;
import tn.mdweb.dsi.tfar.domain.dto.HopitaleDto;
import tn.mdweb.dsi.tfar.domain.entity.Hopitale;
import tn.mdweb.dsi.tfar.service.HopitaleService;

@RestController
@RequestMapping("/api/hopitaleDtos")
public class HopitaleController {

	@Autowired
	private HopitaleService hopitaleService;

	@Autowired
	private HopitaleConverter hopitaleConverter;

	// get all hopitaleDtos
	@GetMapping("/findAll")
	public List<HopitaleDto> getAllHopitaleDtos() {

		List<Hopitale> findAll = hopitaleService.listAll();
		return hopitaleConverter.entityToDto(findAll);
	}

	// get hopitaleDto by Code_hopitale
	@GetMapping("/find/{Code_hopitale}")
	public HopitaleDto getHopitaleDtoById(@PathVariable(value = "Code_hopitale") long id) {
		Hopitale hopitale = hopitaleService.get(id);
		return hopitaleConverter.entityToDto(hopitale);
	}

	// create hopitale
	@PostMapping("/save")
	public HopitaleDto save(@RequestBody HopitaleDto hopitaleDto) {
		Hopitale hopitale = hopitaleConverter.dtoToEntity(hopitaleDto);
		hopitale = hopitaleService.save(hopitale);
		return hopitaleConverter.entityToDto(hopitale);
	}

	/*
	// update hopitale
	@PutMapping("/save/{Code_hopitale}")
	public HopitaleDto updateHopitale(@RequestBody HopitaleDto hopitaleDto, @PathVariable("Code_hopitale") long id) {
		Hopitale hopitale = hopitaleConverter.dtoToEntity(hopitaleDto);
		Hopitale existinghopitale = hopitaleService.get(id);
		existinghopitale.setNom_Hopitale(hopitale.getNom_Hopitale());
		existinghopitale = hopitaleService.save(existinghopitale);
		return hopitaleConverter.entityToDto(existinghopitale);
	}
	*/
	
	// update hopitale
		@PutMapping("/save/{Code_hopitale}")
		public HopitaleDto updateHopitale(@RequestBody HopitaleDto hopitaleDto, @PathVariable("Code_hopitale") long id) {
			Hopitale existinghopitale = hopitaleService.get(id);
			existinghopitale.setNom_Hopitale(hopitaleDto.getNom_Hopitale());
			existinghopitale = hopitaleService.save(existinghopitale);
			return hopitaleConverter.entityToDto(existinghopitale);
		}
		
/*
	// delete hopitale by Code_hopitale
	@DeleteMapping("delete/{Code_hopitale}")
	public String deleteHopitale(@PathVariable("Code_hopitale") long id) {
		Hopitale existinghopitale = hopitaleService.get(id);
		HopitaleDto hopitaleDto= hopitaleConverter.entityToDto(existinghopitale);
		hopitaleService.delete(id);
		return hopitaleDto.toString()+" "+"is deleted";
	}
	*/
		
	// delete hopitale by Code_hopitale
		@DeleteMapping("delete/{Code_hopitale}")
		public String deleteHopitale(@PathVariable("Code_hopitale") long id) {
			Hopitale existinghopitale = hopitaleService.get(id);
			hopitaleService.delete(id);
			return existinghopitale.toString()+" "+"is deleted";
		}
		

}
