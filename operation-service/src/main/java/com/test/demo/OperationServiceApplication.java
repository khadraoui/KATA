package com.test.demo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


import com.test.demo.entities.Operation;
import com.test.demo.entities.OperationRepository;

@SpringBootApplication
@EnableFeignClients
public class OperationServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(OperationServiceApplication.class, args);
	}

	@Bean 
	CommandLineRunner start(OperationRepository operationRepository, RepositoryRestConfiguration conf) {
		return args -> {
	
			conf.exposeIdsFor(Operation.class);
			operationRepository.save(new Operation(210L,3L));
			operationRepository.save(new Operation(280L,2L));
			operationRepository.save(new Operation(289L,2L));
			operationRepository.findAll();
		};
	}
}




