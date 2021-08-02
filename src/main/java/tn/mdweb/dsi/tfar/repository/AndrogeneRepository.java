package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Androgene;

@Repository
public interface AndrogeneRepository extends JpaRepository<Androgene, Long> {
	
	
	@Query("DELETE FROM tn.mdweb.dsi.tfar.domain.entity.Androgene a WHERE a.fiche.idFiche= :idOfFiche ")
	@Modifying
	void DeleteAndrogeneByIdFiche(@Param("idOfFiche") Long idOfFiche);

}
