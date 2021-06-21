package com.test.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="OPERATION")
 public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	
	private Date dateOperation;
	private Long montant;
	private Long compteId;
	private char type;
	
	public Operation(Long numero, Date dateOperation, Long montant) {
		super();
		this.numero = numero;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public Operation() {
		super();
	}
	public Operation(Long montant, Long compteId, char type) {
		super();
		this.type = type;
		this.montant = montant;
		this.compteId = compteId;
	}
	public Operation(Long montant, Long compteId) {
		super();
		this.montant = montant;
		this.compteId = compteId;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	public Long getCompteId() {
		return compteId;
	}
	public void setCompteId(Long compteId) {
		this.compteId = compteId;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	

	
}

