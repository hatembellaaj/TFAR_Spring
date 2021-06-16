package tn.mdweb.dsi.tfar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.mdweb.dsi.tfar.domain.entity.Organisme;


@Repository
public interface OrganismeRepository extends JpaRepository<Organisme, Long>{

}
