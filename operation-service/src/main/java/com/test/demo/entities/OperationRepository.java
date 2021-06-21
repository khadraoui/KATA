package com.test.demo.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface OperationRepository extends JpaRepository<Operation, Long> {
	  @Query("select u from Operation u where u.compteId = ?1")
	  List<Operation> findByCompteId(Long CompteId);
}
