package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.mdweb.dsi.tfar.domain.entity.Laboratoire;

@Repository
public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long>{

}
