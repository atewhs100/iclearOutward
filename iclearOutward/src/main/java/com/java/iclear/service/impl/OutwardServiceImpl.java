package com.java.iclear.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.iclear.entity.Cheque;
import com.java.iclear.entity.ChequeStub;
import com.java.iclear.exception.ChequeNotFoundException;
import com.java.iclear.model.ChequeModel;
import com.java.iclear.model.ChequeStubModel;
import com.java.iclear.repository.OutwardRepository;
import com.java.iclear.service.OutwardService;

@Service
public class OutwardServiceImpl implements OutwardService {
	@Autowired
	OutwardRepository outwardRepository;

	@Override
	public void saveCheques(List<ChequeModel> cheque) {
		// ChequeDTO dto = new ChequeDTO();

		cheque.forEach(c -> {
			Cheque centity = new Cheque();
			BeanUtils.copyProperties(c, centity);
			outwardRepository.save(centity);
		});
	}

	@Override
	public ChequeModel getCheques(Long chequeId) throws ChequeNotFoundException {

		ChequeModel chequeModel = new ChequeModel();
		Optional<Cheque> cheque = outwardRepository.findByChequeId(chequeId);
		Optional<Long> count = Optional.of(outwardRepository.count());

		System.out.println("hello i amm " + count);
		Cheque chequeValue = cheque.orElseThrow(() -> new ChequeNotFoundException("Data not found"));
		BeanUtils.copyProperties(chequeValue, chequeModel);
		return chequeModel;
	}

	@Override
	public ChequeStubModel getChequeStub(Long id) throws ChequeNotFoundException {

		// fetch the database value and store it in class object form
		ChequeStubModel chequeModel = new ChequeStubModel();
		Optional<ChequeStub> cheque = outwardRepository.getchequeStub(id);

		ChequeStub chequeValue = cheque.orElseThrow(() -> new ChequeNotFoundException("Data not found"));
		BeanUtils.copyProperties(chequeValue, chequeModel);
		return chequeModel;
	}

	@Override
	public ChequeModel getchequeByIdAmount(Long chequeId, Double amount) throws ChequeNotFoundException {
		ChequeModel chequeModel = new ChequeModel();
		Optional<Cheque> cheque = outwardRepository.findByChequeIdAndAmount(chequeId, amount);
		Cheque chequeValue = cheque.orElseThrow(() -> new ChequeNotFoundException("Data not found"));
		BeanUtils.copyProperties(chequeValue, chequeModel);
		return chequeModel;
	}

	@Override
	public List<ChequeStubModel> getChequeStubObj(Double amount) {
		List<ChequeStubModel> chequeStubModels = new ArrayList<>();
		outwardRepository.getchequeStubObj(amount);
		return chequeStubModels;
	}

	@Override
	public void deleteChequeStub(Long id) throws ChequeNotFoundException {
		outwardRepository.findById(id)
				.orElseThrow(() -> new ChequeNotFoundException("Cheque is Not Present to delete"));
		outwardRepository.deleteById(id);
	}

}