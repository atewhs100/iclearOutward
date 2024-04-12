package com.java.iclear.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.iclear.entity.Cheque;
import com.java.iclear.entity.ChequeStub;

@Repository
public interface OutwardRepository extends JpaRepository<Cheque, Long>, JpaSpecificationExecutor<Cheque> {

	// @Query("select c from Cheque c where c.chequeId = :chequeId")
	// finding by 1 field
	Optional<Cheque> findByChequeId(@Param("chequeId") Long chequeId);

	// count
	@Query("select Count(c) from Cheque c where c.chequeId = :chequeId")
	Optional<Long> count(@Param("chequeId") Long chequeId);

	// fetching data from database and collecting in object
	@Query("select new com.java.iclear.entity.ChequeStub(c.chequeType,c.amount) "
			+ "from Cheque c where c.chequeId = :id")
	Optional<ChequeStub> getchequeStub(Long id);

	// fetching data from database and collecting in object
	@Query("select new com.java.iclear.entity.ChequeStub(c.chequeType,c.amount) "
			+ "from Cheque c where c.amount = :amount")
	List<ChequeStub> getchequeStubObj(Double amount);

	// how to do if its a list of Cheque stub

	Optional<Cheque> findByChequeIdAndAmount(@Param("chequeId") Long chequeId, @Param("amount") Double amount);
}
