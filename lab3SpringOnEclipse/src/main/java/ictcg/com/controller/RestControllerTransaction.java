package ictcg.com.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ictcg.com.model.TransactionFinance;
import ictcg.com.service.TransactionFinanceService;

@RestController
@RequestMapping("/date")
public class RestControllerTransaction {
	
	@Autowired
	TransactionFinanceService service ;
	
	@GetMapping("/getDate")
	public TransactionFinance getDate() {
		TransactionFinance transac;
		transac = service.getFirstTransaction();
		LocalTime time = LocalTime.now();
		DateTimeFormatter europeanFormat = DateTimeFormatter.ofPattern("H/mm");
		transac.setStrtime(europeanFormat.format(time));
		return transac;

	}
	
	@GetMapping("/getConditionDate/{isUS}")
	public TransactionFinance getConditionDate(@PathVariable String isUS) {
				
		TransactionFinance transac ;
		transac  = service.getFirstTransaction();
		LocalTime time = LocalTime.now();
		boolean str = Boolean.parseBoolean(isUS);
		if ( str) {
			DateTimeFormatter usaFormat = DateTimeFormatter.ofPattern("hh . mm a");
			transac.setStrtime(usaFormat.format(time));
		}
		else {
			DateTimeFormatter europeanFormat = DateTimeFormatter.ofPattern("H . mm");
			transac.setStrtime(europeanFormat.format(time));
		}
		return transac ;
		
	}
}
