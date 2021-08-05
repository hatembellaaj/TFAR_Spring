package tn.mdweb.dsi.tfar.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.mdweb.dsi.tfar.converter.Fiche2Converter;
import tn.mdweb.dsi.tfar.converter.FicheConverter;
import tn.mdweb.dsi.tfar.domain.dto.Fiche2Dto;
import tn.mdweb.dsi.tfar.domain.dto.FicheDto;
import tn.mdweb.dsi.tfar.domain.dto.FicheListDto;
import tn.mdweb.dsi.tfar.domain.entity.Androgene;
import tn.mdweb.dsi.tfar.domain.entity.Cytogenetique;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;
import tn.mdweb.dsi.tfar.domain.entity.Patient;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.AndrogeneRepository;
import tn.mdweb.dsi.tfar.repository.CytogenetiqueRepository;
import tn.mdweb.dsi.tfar.repository.FicheRepository;
import tn.mdweb.dsi.tfar.repository.PatientRepository;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class FicheService {
	
	Patient patient;
	
	Cytogenetique cytogenetique;
	
	Androgene androgene;

	@Autowired
	private AndrogeneRepository androgeneRepository;
	
	@Autowired
	private FicheRepository ficheRepository;
	
	@Autowired
	private CytogenetiqueRepository cytogenetiqueRepository;

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

	public Fiche save(Fiche2Dto fiche2Dto) throws ValidationException {



		if ((fiche2Dto.getNdossierFiche() == null) || fiche2Dto.getDateDiagnostique() == null
				|| fiche2Dto.getDateEnregistrement() == null || fiche2Dto.getPatient().getNdPatient() == null
				|| fiche2Dto.getPatient().getNom() == null || fiche2Dto.getPatient().getPrenom() == null) {
			throw new ValidationException(
					"The ndossierFiche or DateDiagnostique Fiche or DateEnregistrement or ndpatient or "
					+ "nom patient or prenom patient  are not found.");
		}

		Long codeUser = fiche2Dto.getCodeUser();
		List<User> users = userRepository.findAll();
		User x = users.stream().filter(h -> h.getCode().equals(codeUser)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The user is not found.");
		}
		FicheDto ficheDto = fiche2Converter.Fiche2DtoToDFicheDto(fiche2Dto);
		Fiche fiche = ficheConverter.toEntity(ficheDto);
		Fiche savedFiche = ficheRepository.save(fiche);

		System.out.println(savedFiche + "    ffffffffffffffff");
		
		if (fiche2Dto.getPatient().getIdPatient()!=null) {
			patient = new Patient(fiche2Dto.getPatient().getIdPatient(),fiche2Dto.getPatient().getNdPatient(), fiche2Dto.getPatient().getNom(),
					fiche2Dto.getPatient().getPrenom(), fiche2Dto.getPatient().getSexe(),
					fiche2Dto.getPatient().getDateNaissance(), fiche2Dto.getPatient().getLieuNaissance(),
					fiche2Dto.getPatient().getAdresse(), fiche2Dto.getPatient().getReperes(),
					fiche2Dto.getPatient().getGouvernorat(), fiche2Dto.getPatient().getTel(),
					fiche2Dto.getPatient().getPrenomPere(), fiche2Dto.getPatient().getNomMere(),
					fiche2Dto.getPatient().getPrenomMere(), fiche2Dto.getPatient().getNomGmp(),
					fiche2Dto.getPatient().getNomGmm(), new Fiche(savedFiche.getIdFiche()));
			
		}else {
			
			patient = new Patient(fiche2Dto.getPatient().getNdPatient(), fiche2Dto.getPatient().getNom(),
					fiche2Dto.getPatient().getPrenom(), fiche2Dto.getPatient().getSexe(),
					fiche2Dto.getPatient().getDateNaissance(), fiche2Dto.getPatient().getLieuNaissance(),
					fiche2Dto.getPatient().getAdresse(), fiche2Dto.getPatient().getReperes(),
					fiche2Dto.getPatient().getGouvernorat(), fiche2Dto.getPatient().getTel(),
					fiche2Dto.getPatient().getPrenomPere(), fiche2Dto.getPatient().getNomMere(),
					fiche2Dto.getPatient().getPrenomMere(), fiche2Dto.getPatient().getNomGmp(),
					fiche2Dto.getPatient().getNomGmm(), new Fiche(savedFiche.getIdFiche()));
		}

		
		
		

		Patient r = patientRepository.save(patient);
		
		System.out.println(r + "   rrrrrrrrrrrrrrr");
		
		if(fiche2Dto.getCytogenetique().getNetudeCyto()!=null) {
			
			cytogenetique=new Cytogenetique(fiche2Dto.getCytogenetique().getNetudeCyto(),fiche2Dto.getCytogenetique().getLymphocytes(),fiche2Dto.getCytogenetique().getDateSang(),
					fiche2Dto.getCytogenetique().getAgentPortant(),fiche2Dto.getCytogenetique().getInstabilite(),fiche2Dto.getCytogenetique().getInstabilitePourcentage(),
					fiche2Dto.getCytogenetique().getIr(),fiche2Dto.getCytogenetique().getIrPourcentage(),fiche2Dto.getCytogenetique().getMoelle(),
					fiche2Dto.getCytogenetique().getDateMoelle(),fiche2Dto.getCytogenetique().getResultatMoelle(),new Laboratoire(fiche2Dto.getCytogenetique().getIdLaboratoire()),
					new Fiche(savedFiche.getIdFiche()));
			
		}else {
			cytogenetique=new Cytogenetique(fiche2Dto.getCytogenetique().getLymphocytes(),fiche2Dto.getCytogenetique().getDateSang(),
					fiche2Dto.getCytogenetique().getAgentPortant(),fiche2Dto.getCytogenetique().getInstabilite(),fiche2Dto.getCytogenetique().getInstabilitePourcentage(),
					fiche2Dto.getCytogenetique().getIr(),fiche2Dto.getCytogenetique().getIrPourcentage(),fiche2Dto.getCytogenetique().getMoelle(),
					fiche2Dto.getCytogenetique().getDateMoelle(),fiche2Dto.getCytogenetique().getResultatMoelle(),new Laboratoire(fiche2Dto.getCytogenetique().getIdLaboratoire()),
					new Fiche(savedFiche.getIdFiche()));
			
		}
		
		
		
		Cytogenetique c = cytogenetiqueRepository.save(cytogenetique);
		
		if(fiche2Dto.getAndrogene().getId()!=null) {
			androgene=new Androgene(fiche2Dto.getAndrogene().getId(),fiche2Dto.getAndrogene().getMois(),fiche2Dto.getAndrogene().getReponse(),new Fiche(savedFiche.getIdFiche()));

			
		}else {
			androgene=new Androgene(fiche2Dto.getAndrogene().getMois(),fiche2Dto.getAndrogene().getReponse(),new Fiche(savedFiche.getIdFiche()));

			
		}
		
		
		Androgene a = androgeneRepository.save(androgene);

		return savedFiche;
	}

	public Fiche get(Long id) {
		return ficheRepository.findById(id).get();
	}

    @Transactional
	public void delete(Long id) {
		patientRepository.DeletePatientByIdFiche(id);
		cytogenetiqueRepository.DeleteCytogenetiqueByIdFiche(id);
		androgeneRepository.DeleteAndrogeneByIdFiche(id);
		ficheRepository.deleteById(id);
	}

}
