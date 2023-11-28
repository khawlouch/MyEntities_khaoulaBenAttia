package com.khaoula.medecins.entities;
import java.util.List; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.OneToMany; 
import com.fasterxml.jackson.annotation.JsonIgnore; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 



@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hopital {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHop; 
	 private String nomHop; 
	 private String descriptionHop; 
	 
	 @JsonIgnore
	 @OneToMany(mappedBy = "hopital") 
	 private List<Medecin> medecins;

	 
	
	 

}
