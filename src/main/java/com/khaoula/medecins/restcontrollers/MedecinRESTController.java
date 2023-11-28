package com.khaoula.medecins.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khaoula.medecins.entities.Medecin;
import com.khaoula.medecins.service.MedecinService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class MedecinRESTController {
		
		@Autowired
		MedecinService medecinService; 
		
		@RequestMapping(method = RequestMethod.GET)
		public List<Medecin> getAllMedecins()
		{
			return medecinService.getAllMedecins();
		}    

	    @RequestMapping(value="/{id}",method = RequestMethod.GET) 
	    public Medecin getMedecinById(@PathVariable("id") Long id) {  
	    return medecinService.getMedecin(id); 
	    } 
	    
	   // @RequestMapping(method = RequestMethod.POST) 
	    @PostMapping
	    public Medecin createMedecin(@RequestBody Medecin medecin) { 
	    return medecinService.saveMedecin(medecin); 
	    } 
	    
	    @RequestMapping(method = RequestMethod.PUT) 
	    public Medecin updateMedecin(@RequestBody Medecin medecin) { 
	    return medecinService.updateMedecin(medecin); 
	    } 
	    
	    @RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	    public void deleteMedecin(@PathVariable("id") Long id) 
	    { 
	    medecinService.deleteMedecinById(id); 
	    } 
	    @RequestMapping(value="/medshop/{idHop}",method = RequestMethod.GET) 
	    public List<Medecin> getMedecinsByHopId(@PathVariable("idHop") Long idHop) { 
	    return medecinService.findByHopitalIdHop(idHop); 
	    } 
	    
	
}
