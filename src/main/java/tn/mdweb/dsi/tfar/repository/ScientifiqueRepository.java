package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.mdweb.dsi.tfar.domain.entity.Scientifique;

@Repository
public interface ScientifiqueRepository  extends JpaRepository<Scientifique,Long>{

}
