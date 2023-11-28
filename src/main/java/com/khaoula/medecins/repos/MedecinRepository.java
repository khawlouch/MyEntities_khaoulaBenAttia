package com.khaoula.medecins.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.khaoula.medecins.entities.Hopital;
import com.khaoula.medecins.entities.Medecin;
@RepositoryRestResource(path = "rest") 

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

	
	 
	 List<Medecin> findByNomMedecin(String nom); 
	 List<Medecin> findByNomMedecinContains(String nom); 
	 
	 @Query("select m from Medecin m where m.nomMedecin like %?1 and m.salaireMedecin > ?2") 
	 List<Medecin> findByNomSalaire (String nom, Double salaire);
	 
	 //@Query("select p from Medecin m where m.nomMedecin like %:nom and m.salaireMedecin > :salaire") 
	 //List<Medecin> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	 
	 @Query("select m from Medecin m where m.hopital = ?1") 
	 List<Medecin> findByHopital(Hopital hopital); 
	 
	 List<Medecin> findByHopitalIdHop(Long id); 
	 
	 List<Medecin> findByOrderByNomMedecinAsc();
	 
	 @Query("select m from Medecin m order by m.nomMedecin ASC, m.salaireMedecin DESC") 
	 List<Medecin> trierMedecinsNomsSalaire (); 

}
