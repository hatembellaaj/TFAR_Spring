package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.mdweb.dsi.tfar.domain.entity.Cytogeneticien;

@Repository
public interface CytogeneticienRepository extends JpaRepository<Cytogeneticien, Long>{

}
