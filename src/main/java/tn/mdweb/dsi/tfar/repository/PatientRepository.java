package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	
	@Query("DELETE FROM tn.mdweb.dsi.tfar.domain.entity.Patient p WHERE p.fiche.idFiche= :idOfFiche ")
	@Modifying
	void DeletePatientByIdFiche(@Param("idOfFiche") Long idOfFiche);
}
