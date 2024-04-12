package com.java.iclear.DTO.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Data
public class ChequeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long chequeId;
	private String chequeType;
	private Double amount;

}
