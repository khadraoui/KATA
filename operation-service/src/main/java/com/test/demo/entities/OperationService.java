package com.test.demo.entities;

import java.util.List;

public interface OperationService {

	
	public void dipositMoney(Long compteid, Long money);
	public void withdrawalMoney(Long compteid, Long money);
	public List<Operation> chekOperations(Long compteId);
}
