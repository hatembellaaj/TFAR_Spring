package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Cousin;
import tn.mdweb.dsi.tfar.domain.entity.CousinId;

@Repository
public interface CousinRepository extends JpaRepository<Cousin, CousinId>{

}
