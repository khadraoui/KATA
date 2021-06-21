package com.test.demo.entities;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="OPERATION-SERVICE")
public interface OperationService{
	
	@PostMapping("/depositMoney/{compteId}/{money}")
	public void dipositMoney( Long compteId, @PathVariable(name="money")Long money);
	
	@PostMapping("/withdrawalMoney/{compteId}/{money}")
	public void withdrawalMoney(@PathVariable(name="compteId") Long compteId, @PathVariable(name="money")Long money);
	
	@GetMapping("/chekOperations/{compteId}")
	public List<Operation> chekOperations(@PathVariable(name="compteId") Long compteId);
}
