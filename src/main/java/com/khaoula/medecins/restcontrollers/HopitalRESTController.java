package com.khaoula.medecins.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khaoula.medecins.entities.Hopital;
import com.khaoula.medecins.repos.HopitalRepository;

@RestController
@RequestMapping("/api/hop")
@CrossOrigin("*")
public class HopitalRESTController {

	@Autowired
	HopitalRepository hopitalRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Hopital> getAllCategories()
	{
	return hopitalRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Hopital getHopitalById(@PathVariable("id") Long id) {
	return hopitalRepository.findById(id).get();
	}
}
