package com.khaoula.medecins.entities;

import java.util.Date; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne; 

@Entity
public class Medecin {

	
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idMedecin;
    private String nomMedecin;
    private Double salaireMedecin;
    private Date dateContrat;
    
    
    @ManyToOne 
    private Hopital hopital; 
    
    
	public Medecin() {
		super();
	}

	public Medecin(String nomMedecin, Double salaireMedecin, Date dateContrat) {
		super();
		this.nomMedecin = nomMedecin;
		this.salaireMedecin = salaireMedecin;
		this.dateContrat = dateContrat;
	}

	public Long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(Long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public Double getSalaireMedecin() {
		return salaireMedecin;
	}

	public void setSalaireMedecin(Double salaireMedecin) {
		this.salaireMedecin = salaireMedecin;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}
    
}
