package com.test.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPTE")
public class Compte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	private String name;
	private Long solde;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Compte(String name) {
		super();

		this.name = name;
	}
	public Compte() {
		super();

	}
	public Long getSolde() {
		return solde;
	}
	public void setSolde(Long solde) {
		this.solde = solde;
	}
	
}