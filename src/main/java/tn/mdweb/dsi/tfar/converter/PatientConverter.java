package tn.mdweb.dsi.tfar.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.Sexe;

@Component
public class PatientConverter {
	
	
	public PatientDto entityToDto(Patient patient) {

		PatientDto map = new PatientDto(patient.getNDPatient(),patient.getNom(),patient.getPrenom(),
				patient.getSexe().name(),patient.getDateNaissance(),patient.getLieuNaissance(),
				patient.getAdresse(),patient.getReperes(),patient.getGouvernorat().name(),patient.getTel(),
				patient.getPrenomPere(),patient.getNomMere(),patient.getPrenomMere(),
				patient.getNomGmp(),patient.getNomGmm(),patient.getAge(),patient.getFiche().getNDossierFiche());
		return map;
	}

	public List<PatientDto> entityToDto(List<Patient> patient) {

		return patient.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Patient dtoToEntity(PatientDto patientDto) {

		Patient map = new Patient(patientDto.getNDPatient(),patientDto.getNom(),patientDto.getPrenom(),
				Sexe.valueOf(patientDto.getSexe()),patientDto.getDateNaissance(),patientDto.getLieuNaissance(),
				patientDto.getAdresse(),patientDto.getReperes(),Gouvernorat.valueOf(patientDto.getGouvernorat()),patientDto.getTel(),
				patientDto.getPrenomPere(),patientDto.getNomMere(),patientDto.getPrenomMere(),
				patientDto.getNomGmp(),patientDto.getNomGmm(),patientDto.getAge(),new Fiche(patientDto.getNDFiche()));

		return map;
	}

	public List<Patient> dtoToEntity(List<PatientDto> patientDto) {

		return patientDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
	

}
