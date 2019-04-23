package ictcg.com.entities;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

  @Getter @Setter @EqualsAndHashCode
public class Societes {
	
	@Id
	private String  idSociete ;
	private String  nameSociete ;
	private double  marketValueBeurs ;
	
	
	
	public Societes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(String idSociete) {
		this.idSociete = idSociete;
	}
	public String getNameSociete() {
		return nameSociete;
	}
	public void setNameSociete(String nameSociete) {
		this.nameSociete = nameSociete;
	}
	public double getMarketValueBeurs() {
		return marketValueBeurs;
	}
	public void setMarketValueBeurs(double marketValueBeurs) {
		this.marketValueBeurs = marketValueBeurs;
	}
	public Societes(String nameSociete, double marketValueBeurs) {
		super();
		this.nameSociete = nameSociete;
		this.marketValueBeurs = marketValueBeurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSociete == null) ? 0 : idSociete.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marketValueBeurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameSociete == null) ? 0 : nameSociete.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Societes other = (Societes) obj;
		if (idSociete == null) {
			if (other.idSociete != null)
				return false;
		} else if (!idSociete.equals(other.idSociete))
			return false;
		if (Double.doubleToLongBits(marketValueBeurs) != Double.doubleToLongBits(other.marketValueBeurs))
			return false;
		if (nameSociete == null) {
			if (other.nameSociete != null)
				return false;
		} else if (!nameSociete.equals(other.nameSociete))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Societes [name=" + nameSociete + ",Value Beurs=" + marketValueBeurs + "]";
	}
	
	
	

	

}
