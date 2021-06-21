package com.test.demo.entities;

import java.util.Date;



public class Operation {

	private Long numero;
	
	private Date dateOperation;
	private double montant;
	private Long compteId;
	private char type;
	
	public Operation(Long numero, Date dateOperation, double montant) {
		super();
		this.numero = numero;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public Operation() {
		super();
	}
	public Operation(double montant, long compteId, char type) {
		super();
		this.type = type;
		this.montant = montant;
		this.compteId = compteId;
	}
	public Operation(double montant, long compteId) {
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
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public long getCompteId() {
		return compteId;
	}
	public void setCompteId(long compteId) {
		this.compteId = compteId;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	

}
