package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.service.PatientService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	// get all patients
	@GetMapping("/findAll")
	public List<Patient> getAllPatients() {

		List<Patient> findAll = patientService.listAll();
		return findAll;
	}

	// get patient by patientId
	@GetMapping("/find")
	@ResponseStatus(HttpStatus.OK)
	public Patient getPatientByCompositeId(@RequestParam(name = "nDossierP") String nDossierP,
			@RequestParam(name = "idP") Long idP) {
		Patient patient = patientService.get(nDossierP, idP);
		return patient;
	}

	// create patient
	@PostMapping("/save")
	public Patient save(@RequestBody Patient patient) throws Exception {
		return patientService.save(patient);
	}

	// update patient
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody Patient patient,
			@RequestParam(name = "nDossierP") String nDossierP, @RequestParam(name = "idP") Long idP)
			throws Exception {
		Patient existingpatient = patientService.get(nDossierP, idP);
		existingpatient.setNom(patient.getNom());
		existingpatient.setPrenom(patient.getPrenom());
		existingpatient.setDateNaissance(patient.getDateNaissance());
		existingpatient.setLieuNaissance(patient.getLieuNaissance());
		existingpatient.setSexe(patient.getSexe());
		existingpatient.setGouvernorat(patient.getGouvernorat());
		existingpatient.setAdresse(patient.getAdresse());
		existingpatient.setReperes(patient.getReperes());
		existingpatient.setTel(patient.getTel());
		existingpatient.setPrenomPere(patient.getPrenomPere());
		existingpatient.setNomMere(patient.getNomMere());
		existingpatient.setPrenomMere(patient.getPrenomMere());
		existingpatient.setNomGmp(patient.getNomGmp());
		existingpatient.setNomGmm(patient.getNomGmm());
		existingpatient.setAge(patient.getAge());
		return patientService.save(existingpatient);
	}

	// delete patient
	@DeleteMapping("/delete")
	public String deletePatient(@RequestParam(name = "nDossierP") String nDossierP,
			@RequestParam(name = "idP") Long idP) {
		Patient existingpatient = patientService.get(nDossierP,idP);
		patientService.delete(nDossierP,idP);
		return existingpatient.toString() + " is deleted";
	}

}
