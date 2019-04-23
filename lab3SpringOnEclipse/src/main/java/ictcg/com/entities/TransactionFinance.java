package ictcg.com.entities;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class TransactionFinance {

	@Id
	@JsonIgnore
	private String idTransaction;
	@JsonFormat(pattern = "HH:mm")
	@Getter
	@Setter
	private LocalTime time;
	@JsonIgnore
	@Getter
	@Setter
	private double price;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Getter
	@Setter
	private Date date;
	@JsonIgnore
	private Societes societe;

	public TransactionFinance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Societes getSociete() {
		return societe;
	}

	public void setSociete(Societes societe) {
		this.societe = societe;
	}

}
