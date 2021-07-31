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
import tn.mdweb.dsi.tfar.converter.PatientConverter;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.Sexe;
import tn.mdweb.dsi.tfar.service.PatientService;


@RestController
@RequestMapping("/api/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PatientConverter patientConverter;

	// get all patientsDto
	@GetMapping("/findAll")
	public List<PatientDto> getAllPatientsDto() {

		List<Patient> findAll = patientService.listAll();
		return patientConverter.entityToDto(findAll);
	}

	// get patientDto by nDPatient
		@GetMapping("/find/{idPatient}")
		public PatientDto getUserById(@PathVariable(value = "idPatient") Long id) {
			Patient patient = patientService.get(id);
			return patientConverter.entityToDto(patient);
		}

		// create PatientDto
		@PostMapping("/save")
		public PatientDto save(@RequestBody PatientDto patientDto) throws Exception {
			return patientConverter.entityToDto(patientService.save(patientDto));
		}

		// update user
		@PutMapping("/save/{idPatient}")
		public PatientDto updateUser(@RequestBody PatientDto patientDto,
				@PathVariable("idPatient") Long id) throws Exception {
			Patient existingpatient = patientService.get(id);
			existingpatient.setNom(patientDto.getNom());
			existingpatient.setPrenom(patientDto.getPrenom());
			existingpatient.setSexe(patientDto.getSexe());
			existingpatient.setDateNaissance(patientDto.getDateNaissance());
			existingpatient.setLieuNaissance(patientDto.getLieuNaissance());
			existingpatient.setAdresse(patientDto.getAdresse());
			existingpatient.setReperes(patientDto.getReperes());
			existingpatient.setGouvernorat(patientDto.getGouvernorat());
			existingpatient.setTel(patientDto.getTel());
			existingpatient.setPrenomPere(patientDto.getPrenomPere());
			existingpatient.setNomMere(patientDto.getNomMere());
			existingpatient.setPrenomMere(patientDto.getPrenomMere());
			existingpatient.setNomGmp(patientDto.getNomGmp());
			existingpatient.setNomGmm(patientDto.getNomGmm());
			existingpatient.setFiche(new Fiche(patientDto.getIdFiche()));
			
			PatientDto x=patientConverter.entityToDto(existingpatient);
			return patientConverter.entityToDto(patientService.save(x));
		}

		// delete Patient by nDPatient
		@DeleteMapping("delete/{idPatient}")
		public String deleteUser(@PathVariable("idPatient") Long id) {
			Patient existingpatient = patientService.get(id);
			patientService.delete(id);
			return existingpatient.toString() +  " is deleted";
		}

}
