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

import tn.mdweb.dsi.tfar.converter.PatientConverter;

import tn.mdweb.dsi.tfar.domain.dto.PatientDto;

import tn.mdweb.dsi.tfar.domain.entity.Patient;

import tn.mdweb.dsi.tfar.service.PatientService;

@RestController
@RequestMapping("/api/patientDtos")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@Autowired
	private PatientConverter patientConverter;

	// get all patientDtos
	@GetMapping("/findAll")
	public List<PatientDto> getAllPatientDtos() {

		List<Patient> findAll = patientService.listAll();
		return patientConverter.entityToDto(findAll);
	}

	// get patientDto by N_dossier_P
	@GetMapping("/find/{N_dossier_P}")
	public PatientDto getPatientDtoById(@PathVariable(value = "N_dossier_P") String id) {
		Patient patient = patientService.get(id);
		return patientConverter.entityToDto(patient);
	}

	// create patient
	@PostMapping("/save")
	public PatientDto save(@RequestBody PatientDto patientDto) throws Exception {
		Patient patient = patientConverter.dtoToEntity(patientDto);
		patient = patientService.save(patient);
		return patientConverter.entityToDto(patient);
	}

	/*
	// update patient
	@PutMapping("/save/{N_dossier_P}")
	public PatientDto updatePatient(@RequestBody PatientDto patientDto, @PathVariable("N_dossier_P") String id) {
		Patient patient = patientConverter.dtoToEntity(patientDto);
		Patient existingpatient = patientService.get(id);
		existingpatient.setNom(patient.getNom());
		existingpatient.setPrenom(patient.getPrenom());
		existingpatient.setDate_Naissance(patient.getDate_Naissance());
		existingpatient.setLieuNaissance(patient.getLieuNaissance());
		existingpatient.setSexe(patient.getSexe());
		existingpatient.setGouvernorat(patient.getGouvernorat());
		existingpatient.setAdresse(patient.getAdresse());
		existingpatient.setReperes(patient.getReperes());
		existingpatient.setTel(patient.getTel());
		existingpatient.setPrenomPere(patient.getPrenomPere());
		existingpatient.setNomMere(patient.getNomMere());
		existingpatient.setPrenomMere(patient.getPrenomMere());
		existingpatient.setNomGMP(patient.getNomGMP());
		existingpatient.setNomGMM(patient.getNomGMM());
		existingpatient.setAge(patient.getAge());
		existingpatient = patientService.save(existingpatient);
		return patientConverter.entityToDto(existingpatient);
	}
	*/
	
	// update patient
		@PutMapping("/save/{N_dossier_P}")
		public PatientDto updatePatient(@RequestBody PatientDto patientDto, @PathVariable("N_dossier_P") String id) throws Exception {
			Patient existingpatient = patientService.get(id);
			existingpatient.setNom(patientDto.getNom());
			existingpatient.setPrenom(patientDto.getPrenom());
			existingpatient.setDate_Naissance(patientDto.getDate_Naissance());
			existingpatient.setLieuNaissance(patientDto.getLieuNaissance());
			existingpatient.setSexe(patientDto.getSexe());
			existingpatient.setGouvernorat(patientDto.getGouvernorat());
			existingpatient.setAdresse(patientDto.getAdresse());
			existingpatient.setReperes(patientDto.getReperes());
			existingpatient.setTel(patientDto.getTel());
			existingpatient.setPrenomPere(patientDto.getPrenomPere());
			existingpatient.setNomMere(patientDto.getNomMere());
			existingpatient.setPrenomMere(patientDto.getPrenomMere());
			existingpatient.setNomGMP(patientDto.getNomGMP());
			existingpatient.setNomGMM(patientDto.getNomGMM());
			existingpatient.setAge(patientDto.getAge());
			existingpatient = patientService.save(existingpatient);
			return patientConverter.entityToDto(existingpatient);
		}

		/*
	// delete patient by N_dossier_P
	@DeleteMapping("delete/{N_dossier_P}")
	public String deletePatient(@PathVariable("N_dossier_P") String id) {
		Patient existingpatient = patientService.get(id);
		PatientDto patientDto = patientConverter.entityToDto(existingpatient);
		patientService.delete(id);
		return patientDto.toString() + " " + "is deleted";
	}
	*/
	
	// delete patient by N_dossier_P
		@DeleteMapping("delete/{N_dossier_P}")
		public String deletePatient(@PathVariable("N_dossier_P") String id) {
			Patient existingpatient = patientService.get(id);
			patientService.delete(id);
			return existingpatient.toString() + " " + "is deleted";
		}

}
