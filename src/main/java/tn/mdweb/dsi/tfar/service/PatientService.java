package tn.mdweb.dsi.tfar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.converter.PatientConverter;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.FicheRepository;
import tn.mdweb.dsi.tfar.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientConverter patientConverter;
	
	@Autowired
	private FicheRepository ficheRepository;

	public List<Patient> listAll() {
		return patientRepository.findAll();
	}

	public Patient save(PatientDto patientDto) throws ValidationException {
		String nDFiche = patientDto.getNDFiche();
		List<Fiche> fiches = ficheRepository.findAll();
		Fiche x = fiches.stream().filter(h -> h.getNDossierFiche().equals(nDFiche)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The fiche is not found.");
		}
		Patient patient = patientConverter.dtoToEntity(patientDto);
		patientRepository.save(patient);
		return patient;
	}

	public Patient get(String id) {
		return patientRepository.findById(id).get();
	}

	public void delete(String id) {
		patientRepository.deleteById(id);
	}

}
