package com.test.demo.entities;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {
	
	@Autowired
	OperationService opService;
	
	@PostMapping("/depositMoney/{compteId}/{money}")
	public void dipositMoney(@PathVariable(name="compteId") Long compteId, @PathVariable(name="money")Long money) {
		opService.dipositMoney(compteId, money);
	}
	@PostMapping("/withdrawalMoney/{compteId}/{money}")
	public void withdrawalMoney(@PathVariable(name="compteId") Long compteId, @PathVariable(name="money")Long money) {
		opService.withdrawalMoney(compteId, money);
	}
	@GetMapping("/chekOperations/{compteId}")
	public List<Operation> chekOperations(@PathVariable(name="compteId") Long compteId) {
		return opService.chekOperations(compteId);
	}

}
