package com.test.demo.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CompteServiceImpl implements CompteService {
	
	@Autowired
	CompteRepository repo;
	@Autowired
	OperationService opService;

	@Override
	public void dipositMoney(Long compteid, Long money) {
		Compte compte = repo.getById(compteid);
		compte.setSolde(compte.getSolde() + money);
		repo.save(compte);
		opService.dipositMoney(compteid, money);

	}

	@Override
	public void withdrawalMoney(Long compteid, Long money) {
		Compte compte = repo.getById(compteid);
		compte.setSolde(compte.getSolde() - money);
		repo.save(compte);
		opService.withdrawalMoney(compteid, money);

	}

	@Override
	public List<Operation> chekOperations(Long compteId) {
		return opService.chekOperations(compteId);

	}

}
