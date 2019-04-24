package ictcg.com.model;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

   @EqualsAndHashCode
   @Getter
   @Setter
   
   @NoArgsConstructor
public class Societes {
	
	@Id	
	private String  idSociete ;	
	private String  nameSociete ;	
	private double  marketValueBeurs ;
	
	
	
	
	public Societes(String nameSociete, double marketValueBeurs) {
		super();
		this.nameSociete = nameSociete;
		this.marketValueBeurs = marketValueBeurs;
	}
	
	@Override
	public String toString() {
		return "Societes [name=" + nameSociete + ",Value Beurs=" + marketValueBeurs + "]";
	}
	
	
	

	

}
