package com.test.demo.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long>{
	
	  @Query("select u from Compte u where u.name = ?1")
	  List<Compte> findByName(String name);
	
	
}
