package com.java.iclear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.iclear.model.ResponseStatement;
import com.java.iclear.service.InterestStatementService;

@RestController
@RequestMapping(value = "/bankstatement")
public class StatementController {

	@Autowired
	InterestStatementService interestStatementService;

	@GetMapping(value = "/intereststatement/{clientId}")
	public ResponseEntity<ResponseStatement> getInterestStatement(@PathVariable("clientId") long clientId) {

		interestStatementService.calculateInterest();

		/*
		 * return ResponseEntity.status(HttpStatus.ACCEPTED) .body(new
		 * ResponseStatement(null, "InterestStatement", getInterestStatement()));
		 */
		return null;
	}

	@GetMapping(value = "/billingstatement")
	public void getBillingStatement() {

	}

}
