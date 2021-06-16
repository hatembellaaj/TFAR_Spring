package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.mdweb.dsi.tfar.domain.entity.Frere;
import tn.mdweb.dsi.tfar.domain.entity.FrereId;


@Repository
public interface FrereRepository extends JpaRepository<Frere, FrereId> {

}
