package com.java.iclear.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.java.iclear.exception.ChequeNotFoundException;
import com.java.iclear.model.ChequeModel;
import com.java.iclear.model.ChequeStubModel;
import com.java.iclear.model.Response;
import com.java.iclear.service.OutwardService;

@RestController
@RequestMapping(value = "/outward")
public class OutwardController {

	@Autowired
	MessageSource messageSource;

	@Autowired
	private OutwardService outwardService;

	@Autowired
	private RestTemplate restTemplate;

	private final Logger logger = LogManager.getLogger(OutwardController.class);

	/*
	 * @GetMapping("/chequeByIdAmount/hello") public String getHello() { return
	 * "hello"; }
	 */

	@GetMapping("/chequeByIdAmount/{id}/{amount}")
	public ChequeModel getchequeByIdAmount(@PathVariable("id") Long chequeId, @PathVariable("amount") Double amount)
			throws ChequeNotFoundException {
		logger.debug("In OutwardController:: getchequeByIdAmount method");
		return outwardService.getchequeByIdAmount(chequeId, amount);
	}

	@GetMapping("/chequestub/{id}")
	public ChequeStubModel getChequeStub(@PathVariable("id") Long id) throws ChequeNotFoundException {
		logger.info("In OutwardController:: getChequeStub method");
		return outwardService.getChequeStub(id);
	}

	@GetMapping("/chequestub/{amount}")
	public List<ChequeStubModel> getChequeStubObj(@PathVariable("amount") Double amount)
			throws ChequeNotFoundException {
		return outwardService.getChequeStubObj(amount);
	}

	@PostMapping(value = "/saveCheques", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> saveCheques(@Valid @RequestBody List<ChequeModel> cheque) {

		outwardService.saveCheques(cheque);

		Response response = new Response("Cheques Saved",
				messageSource.getMessage("chequecreated", null, Locale.ENGLISH), cheque);
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, HttpStatus.CREATED);
		return responseEntity;

	}

	// @RequestMapping(value = "/cheque", method = RequestMethod.GET)

	@GetMapping("/cheque/{id}")
	public ChequeModel getCheques(@PathVariable("id") Long chequeId) throws ChequeNotFoundException {
		return outwardService.getCheques(chequeId);
	}

	// http://localhost:8080/outward/cheque/4
	@GetMapping("/resttemplate/{id}")
	public ResponseEntity<ChequeModel> getChequeRestTemplate(@PathVariable("id") Long chequeId)
			throws ChequeNotFoundException {
		return restTemplate.getForEntity("http://localhost:8080/outward/cheque/" + chequeId, ChequeModel.class);
	}

	@PutMapping("/updateCheques")
	public void updateCheques(@RequestBody List<ChequeModel> cheque) {
		outwardService.saveCheques(cheque);
	}
	
	@DeleteMapping("/chequestub/{id}")
	public void deleteChequeStub(@PathVariable("id") Long id) throws ChequeNotFoundException {
		logger.info("In OutwardController:: deleteChequeStub method");
		outwardService.deleteChequeStub(id);
	}

}
