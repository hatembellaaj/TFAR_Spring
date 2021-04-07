package tn.mdweb.dsi.tfar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> listAll() {
		return patientRepository.findAll();
	}

	public Patient save(Patient patient) throws Exception {
		if ((!patient.getSexe().toLowerCase().equals("male")) && (!patient.getSexe().toLowerCase().equals("female"))) {

			throw new Exception("The Sexe shoud be male or female !!!");

		}
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
