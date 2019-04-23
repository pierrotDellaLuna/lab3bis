package ictcg.com.model;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class TransactionFinance {

	@Id
	@JsonIgnore
	private String idTransaction;
	@JsonFormat(pattern = "HH:mm")	
	private LocalTime time;
	@JsonIgnore	
	private double price;
	@JsonFormat(pattern = "dd/MM/yyyy")	
	private Date date;
	@JsonIgnore
	private Societes societe;




}
