package com.test.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.context.annotation.Bean;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


import com.test.demo.entities.Compte;
import com.test.demo.entities.CompteRepository;
import com.test.demo.entities.Operation;
import com.test.demo.entities.OperationService;

@EnableFeignClients
@SpringBootApplication
public class CompteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository, OperationService opservice,
			RepositoryRestConfiguration conf) {
		return args -> {
			// List<Operation> listop = new ArrayList<Operation>();
			// listop = opservice.chekOperations(2);
			// System.out.println(listop.get(1).getMontant());
			conf.exposeIdsFor(Compte.class);
			compteRepository.save(new Compte("compte 1"));
			compteRepository.save(new Compte("compte 2"));
			compteRepository.save(new Compte("compte 3"));
			compteRepository.findAll();
		};
	}

}
