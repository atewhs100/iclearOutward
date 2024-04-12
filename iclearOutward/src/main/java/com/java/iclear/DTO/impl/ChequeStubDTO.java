package com.java.iclear.DTO.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Data
@NoArgsConstructor
public class ChequeStubDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String cType;
	private Double amount;

	public ChequeStubDTO(String cType, Double amount) {
		super();
		this.cType = cType;
		this.amount = amount;
	}

}
