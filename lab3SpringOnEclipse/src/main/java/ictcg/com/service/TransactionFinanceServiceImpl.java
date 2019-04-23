package ictcg.com.service;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import ictcg.com.model.TransactionFinance;



@Service
public class TransactionFinanceServiceImpl implements TransactionFinanceService {

	@Override
	public List<TransactionFinance> findAllTransact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionFinance getFirstTransaction() {
		TransactionFinance transac = new TransactionFinance() ;
		transac.setTime(LocalTime.now());
		transac.setDate(new Date());
		return transac;
	}

}
