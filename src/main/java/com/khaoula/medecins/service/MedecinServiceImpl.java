package com.khaoula.medecins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khaoula.medecins.entities.Hopital;
import com.khaoula.medecins.entities.Medecin;
import com.khaoula.medecins.repos.MedecinRepository;

@Service
public class MedecinServiceImpl implements MedecinService  {
	
	@Autowired 
	 MedecinRepository medecinRepository; 

	@Override
	public Medecin saveMedecin(Medecin m) {
		  return medecinRepository.save(m); 
	}

	@Override
	public Medecin updateMedecin(Medecin m) {
		  return medecinRepository.save(m); 
	}

	@Override
	public void deleteMedecin(Medecin m) {
		  medecinRepository.delete(m); 

		
	}

	@Override
	public void deleteMedecinById(Long id) {
		  medecinRepository.deleteById(id); 

		
	}

	@Override
	public Medecin getMedecin(Long id) {
		
		  return  medecinRepository.findById(id).get(); 
	}

	@Override
	public List<Medecin> getAllMedecins() {
		  return medecinRepository.findAll(); 
	}
	
	
	 @Override 
	 public List<Medecin> findByNomMedecin(String nom) { 
	  return medecinRepository.findByNomMedecin(nom); 
	 } 
	 
	 @Override 
	 public List<Medecin> findByNomMedecinContains(String nom) { 
	  return medecinRepository.findByNomMedecinContains(nom); 
	 } 
	 
	 @Override 
	 public List<Medecin> findByNomSalaire(String nom, Double salaire) { 
	  return medecinRepository.findByNomSalaire(nom, salaire); 
	 } 
	  
	 @Override 
	 public List<Medecin> findByHopital(Hopital hopital) { 
	  return medecinRepository.findByHopital(hopital); 
	 } 
	 
	 @Override 
	 public List<Medecin> findByHopitalIdHop(Long id) { 
	  return medecinRepository.findByHopitalIdHop(id); 
	 } 
	 
	 @Override 
	 public List<Medecin> findByOrderByNomMedecinAsc() { 
	  return medecinRepository.findByOrderByNomMedecinAsc(); 
	 } 
	 
	 @Override 
	 public List<Medecin> trierMedecinsNomsSalaire() { 
	  return medecinRepository.trierMedecinsNomsSalaire(); 
	 }



	
	
}
