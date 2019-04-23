package ictcg.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ictcg.com.model.TransactionFinance;
import ictcg.com.service.TransactionFinanceService;

@RestController
@RequestMapping("/date")
public class RestControllerTransaction {
	
	@Autowired
	TransactionFinanceService service ;
	
	
	@GetMapping("/getdate")
	public TransactionFinance getdate() {
		return service.getFirstTransaction();
		
		
	}

}
