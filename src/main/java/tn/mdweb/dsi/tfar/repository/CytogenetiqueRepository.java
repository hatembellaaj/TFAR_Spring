package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Cytogenetique;

@Repository
public interface CytogenetiqueRepository extends JpaRepository<Cytogenetique, Long> {
	
	
	@Query("DELETE FROM tn.mdweb.dsi.tfar.domain.entity.Cytogenetique c WHERE c.fiche.idFiche= :idOfFiche ")
	@Modifying
	void DeleteCytogenetiqueByIdFiche(@Param("idOfFiche") Long idOfFiche);

}
