package com.khaoula.medecins;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khaoula.medecins.entities.Hopital;
import com.khaoula.medecins.entities.Medecin;
import com.khaoula.medecins.repos.MedecinRepository;

@SpringBootTest
class MedecinsApplicationTests {
	@Autowired
	private MedecinRepository medecinRepository;
	

	@Test
	public void testCreateMedecin () {
		Medecin med = new Medecin("chérugien",4000.000,new Date()); 

		medecinRepository.save(med);
	}

	@Test 
	public void testFindMedecin() 
	{ 
	Medecin m = medecinRepository.findById(1L).get();     
	System.out.println(m); 
	} 
	@Test 
	public void testUpdateMedecin() 
	{ 
	Medecin m = medecinRepository.findById(1L).get(); 
	m.setSalaireMedecin(1000.0); 
	medecinRepository.save(m); 
	}
	
	
	@Test 
	 public void testDeleteMedecin() 
	  { 
	   medecinRepository.deleteById(1L);; 
	    
	  } 
	 
	    
	@Test 
	 public void testListerTousmedecins() 
	  { 
	   List<Medecin>  med = medecinRepository.findAll();   
	   for (Medecin m : med) 
	   { 
	    System.out.println(m); 
	   }   
	  }
	
	  @Test 
	  public void testFindByNomMedecin() 
	   { 
	  List<Medecin>  meds = medecinRepository.findByNomMedecin("chérugien"); 
	    for (Medecin m : meds) 
	    { 
	     System.out.println(m); 
	    } }
	  
	  @Test 
	  public void testFindByNomMedecinContains() 
	  { 
	  List<Medecin> meds=medecinRepository.findByNomMedecinContains("chérugien"); 
	  for (Medecin m : meds) 
	  { 
	  System.out.println(m); 
	  } } 
	    
	  @Test
	  public void testfindByNomSalaire() 
	  { 
	  List<Medecin>  meds = medecinRepository.findByNomSalaire("chérugien", 4000.000); 
	  for (Medecin m : meds) 
	  { 
	  System.out.println(m); 
	  } 
	  
	  } 
	  @Test 
	  public void testfindByHopital() 
	  { 
	  Hopital hop = new Hopital(); 
	  hop.setIdHop(1L);    
	  List<Medecin>  meds = medecinRepository.findByHopital(hop); 
	  for (Medecin m : meds) 
	  { 
	  System.out.println(m); 
	  } 
	  }
	  
	  
	  @Test 
	  public void findByHopitalIdHop() 
	  {    
	  List<Medecin>  meds = medecinRepository.findByHopitalIdHop(1L); 
	  for (Medecin m : meds) 
	  { 
	  System.out.println(m); 
	  } 
	  }
	  
	  @Test 
	  public void testfindByOrderByNomMedecinAsc() 
	   { 
	   List<Medecin>  meds =    
	 medecinRepository.findByOrderByNomMedecinAsc();   
	    for (Medecin m : meds) 
	    { 
	     System.out.println(m); 
	    } 
	   } 
	  
	  @Test 
	  public void testtrierMedecinsNomsSalaire() 
	   { 
	   List<Medecin>  meds = medecinRepository.trierMedecinsNomsSalaire();
	    
	    for (Medecin m : meds) 
	    { 
	     System.out.println(m); 
	    } 
	   } 
}
