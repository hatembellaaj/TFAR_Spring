package tn.mdweb.dsi.tfar.converter;

import org.springframework.stereotype.Component;

import tn.mdweb.dsi.tfar.domain.dto.PatientDto;
import tn.mdweb.dsi.tfar.domain.entity.Patient;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

@Component
public class PatientConverter {

	public PatientDto entityToDto(Patient patient) {

		ModelMapper mapper = new ModelMapper();
		PatientDto map = mapper.map(patient, PatientDto.class);
		return map;
	}

	public List<PatientDto> entityToDto(List<Patient> patient) {

		return patient.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Patient dtoToEntity(PatientDto patientdto) {

		ModelMapper mapper = new ModelMapper();
		Patient map = mapper.map(patientdto, Patient.class);
		return map;
	}

	public List<Patient> dtoToEntity(List<PatientDto> patientdto) {

		return patientdto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
