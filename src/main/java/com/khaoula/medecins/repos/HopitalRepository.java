package com.khaoula.medecins.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.khaoula.medecins.entities.Hopital;


@RepositoryRestResource(path = "hop")
@CrossOrigin(origins ="http://localhost:4200/") 
public interface HopitalRepository extends JpaRepository<Hopital, Long> {

	List<Hopital> findAll();

}
