package com.java.iclear.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Entity
@Table(name = "ChequeStub")
public class ChequeStub {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cType;
	private Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public ChequeStub(String cType, Double amount) {
		this.cType = cType;
		this.amount = amount;
	}

}
