package com.test.demo.entities;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
	
	@Autowired
	OperationRepository operationRepo;

	@Override
	public void dipositMoney(Long compteid, Long money) {
		Operation op = new Operation( money, compteid, "D".charAt(0));
		op.setDateOperation(new Date());
		operationRepo.save(op);
	}
	

	@Override
	public void withdrawalMoney(Long compteid, Long money) {
		Operation op = new Operation( money, compteid, "W".charAt(0));
		op.setDateOperation(new Date());
		operationRepo.save(op);
		
	}

	@Override
	public List<Operation> chekOperations(Long compteId) {
		return operationRepo.findByCompteId(compteId);
		
	}

}
