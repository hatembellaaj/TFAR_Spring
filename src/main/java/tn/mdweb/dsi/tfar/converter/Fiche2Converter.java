package tn.mdweb.dsi.tfar.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.AndrogeneDto;
import tn.mdweb.dsi.tfar.domain.dto.CytogenetiqueDto;
import tn.mdweb.dsi.tfar.domain.dto.Fiche2Dto;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.repository.AndrogeneRepository;
import tn.mdweb.dsi.tfar.repository.CytogenetiqueRepository;
import tn.mdweb.dsi.tfar.repository.PatientRepository;

import org.modelmapper.ModelMapper;

@Component
public class Fiche2Converter {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientConverter patientConverter;
	
	@Autowired
	private AndrogeneRepository androgeneRepository;
	
	@Autowired
	private AndrogeneConverter androgeneConverter;
	
	@Autowired
	private CytogenetiqueRepository cytogenetiqueRepository;
	
	@Autowired
	private CytogenetiqueConverter cytogenetiqueConverter;

	public FicheDto Fiche2DtoToDFicheDto(Fiche2Dto fiche2Dto) {

		ModelMapper mapper = new ModelMapper();
		FicheDto map = mapper.map(fiche2Dto, FicheDto.class);
		return map;
	}
	
	
	public Fiche2Dto FicheDtoToDFiche2Dto(FicheDto ficheDto) {
		
		Long idOfFiche=ficheDto.getIdFiche();
		PatientDto patientDto=patientConverter.entityToDto(patientRepository.findPatientByIdFiche(idOfFiche));
		AndrogeneDto androgeneDto=androgeneConverter.entityToDto(androgeneRepository.findAndrogeneByIdFiche(idOfFiche));
		CytogenetiqueDto cytogenetiqueDto=cytogenetiqueConverter.entityToDto(cytogenetiqueRepository.findCytogenetiqueByIdFiche(idOfFiche));
		ModelMapper mapper = new ModelMapper();
		Fiche2Dto map = mapper.map(ficheDto, Fiche2Dto.class);
		map.setPatient(patientDto);
		map.setAndrogene(androgeneDto);
		map.setCytogenetique(cytogenetiqueDto);
		return map;
	}

	

}
