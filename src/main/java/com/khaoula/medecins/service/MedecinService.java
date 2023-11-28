package com.khaoula.medecins.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.khaoula.medecins.entities.Hopital;
import com.khaoula.medecins.entities.Medecin;

public interface MedecinService {

	
	 Medecin saveMedecin(Medecin m); 
	 Medecin updateMedecin(Medecin m); 
	 void deleteMedecin(Medecin m); 
	 void deleteMedecinById(Long id);
	 Medecin getMedecin(Long id); 
	 List<Medecin> getAllMedecins(); 
	 List<Medecin> findByNomMedecin(String nom); 
	 List<Medecin> findByNomMedecinContains(String nom); 
	 List<Medecin> findByNomSalaire(String nom, Double salaire); 
	 List<Medecin> findByHopital(Hopital hopital); 
	 List<Medecin> findByHopitalIdHop(Long id); 
	 List<Medecin> findByOrderByNomMedecinAsc();
	 List<Medecin> trierMedecinsNomsSalaire (); 
}
