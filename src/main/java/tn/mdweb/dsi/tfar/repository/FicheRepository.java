package tn.mdweb.dsi.tfar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Fiche;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.mdweb.dsi.tfar.domain.dto.FicheListDto;

@Repository
public interface FicheRepository extends JpaRepository<Fiche, Long> {
	
	@Query("SELECT new tn.mdweb.dsi.tfar.domain.dto.FicheListDto(f.idFiche, f.ndossierFiche, f.dateDiagnostique, f.dateEnregistrement"
			+ ",f.user.organisme.nom,f.user.departement.nom,p.nom,p.prenom) FROM Fiche f  LEFT JOIN Patient p on p.fiche.idFiche=f.idFiche")
	List<FicheListDto> findAllFicheListDto();
	
	


}
