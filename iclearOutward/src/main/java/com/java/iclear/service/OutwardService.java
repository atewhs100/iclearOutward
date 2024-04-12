package com.java.iclear.service;

import java.util.List;

import com.java.iclear.exception.ChequeNotFoundException;
import com.java.iclear.model.ChequeModel;
import com.java.iclear.model.ChequeStubModel;

public interface OutwardService {

	public void saveCheques(List<ChequeModel> cheque);

	public ChequeModel getCheques(Long chequeId) throws ChequeNotFoundException;

	public ChequeStubModel getChequeStub(Long id) throws ChequeNotFoundException;

	public ChequeModel getchequeByIdAmount(Long chequeId, Double amount) throws ChequeNotFoundException;

	public List<ChequeStubModel> getChequeStubObj(Double amount);

	public void deleteChequeStub(Long id) throws ChequeNotFoundException;

}
