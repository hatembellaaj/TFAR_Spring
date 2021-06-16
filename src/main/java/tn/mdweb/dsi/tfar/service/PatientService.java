package tn.mdweb.dsi.tfar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.domain.entity.PatientId;
import tn.mdweb.dsi.tfar.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> listAll() {
		return patientRepository.findAll();
	}

	public Patient save(Patient patient) {
		patientRepository.save(patient);
		return patient;
	}

	public Patient get(String nDossierP, Long idP) {
		PatientId patientId=new PatientId(nDossierP, idP);
		return patientRepository.findById(patientId).get();
	}

	public void delete(String nDossierP, Long idP) {
		PatientId patientId=new PatientId(nDossierP, idP);
		patientRepository.deleteById(patientId);
	}

}
