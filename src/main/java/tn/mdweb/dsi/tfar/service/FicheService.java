package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.Fiche2Converter;
import tn.mdweb.dsi.tfar.converter.FicheConverter;
import tn.mdweb.dsi.tfar.domain.dto.Fiche2Dto;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import tn.mdweb.dsi.tfar.domain.dto.FicheListDto;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.FicheRepository;
import tn.mdweb.dsi.tfar.repository.PatientRepository;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class FicheService {
	
	@Autowired
	private FicheRepository ficheRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private FicheConverter ficheConverter;
	
	@Autowired
	private Fiche2Converter fiche2Converter;
	
	
	public List<Fiche> listAll() {
		return ficheRepository.findAll();	
	}
	
	public List<FicheListDto> listAllFicheListDto() {
		return ficheRepository.findAllFicheListDto();	
	}
	
	public Fiche save(Fiche2Dto fiche2Dto) throws ValidationException{
		
		System.out.println(fiche2Dto+"    bbbbbbbbbbbbbbbbbbbbbbbb");
		
		// if 4 fiche w 3 patient =null => throw exeption 
		
	
		//if ((fiche2Dto.getCodeUser()==null) || )
		
		
		Long codeUser = fiche2Dto.getCodeUser();
		List<User> users =userRepository.findAll();
		User x = users.stream().filter(h -> h.getCode().equals(codeUser)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The user is not found.");
		}
		FicheDto ficheDto=fiche2Converter.Fiche2DtoToDFicheDto(fiche2Dto);
		Fiche fiche = ficheConverter.toEntity(ficheDto);
		Fiche savedFiche = ficheRepository.save(fiche);
		
		System.out.println(savedFiche+"    ffffffffffffffff");
		
		Patient patient=new Patient(fiche2Dto.getPatient().getNdPatient(),fiche2Dto.getPatient().getNom(),fiche2Dto.getPatient().getPrenom(),
				fiche2Dto.getPatient().getSexe(),fiche2Dto.getPatient().getDateNaissance(),fiche2Dto.getPatient().getLieuNaissance(),
				fiche2Dto.getPatient().getAdresse(),fiche2Dto.getPatient().getReperes(),fiche2Dto.getPatient().getGouvernorat(),
				fiche2Dto.getPatient().getTel(),fiche2Dto.getPatient().getPrenomPere(),fiche2Dto.getPatient().getNomMere(),
				fiche2Dto.getPatient().getPrenomMere(),fiche2Dto.getPatient().getNomGmp(),fiche2Dto.getPatient().getNomGmm(),
				new Fiche(savedFiche.getIdFiche()));
		
		Patient r = patientRepository.save(patient);
		
		System.out.println(r+"zzzzzzzzzzzzzzzzzzz");
		
		
		
		return savedFiche;
	}
	
	public Fiche get(Long id) {
		return ficheRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		ficheRepository.deleteById(id);
	}

}
