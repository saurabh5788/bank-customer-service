package com.learning.bank.customer.customerservice.controller;

import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.learning.bank.customer.customerservice.annotation.ApiRestEndpoints;
import com.learning.bank.customer.customerservice.annotation.Loggable;
import com.learning.bank.customer.customerservice.dto.IndividualCustomerRequestDTO;
import com.learning.bank.customer.customerservice.entity.IndividualCustomerEntity;
import com.learning.bank.customer.customerservice.repository.IndividualCustomerRepository;

@ApiRestEndpoints("/individual/v1")
@Loggable("Individual Customer Controller")
public class IndividualCustomerControllerV1 implements IndividualCustomerAPI {
	@Autowired
	private IndividualCustomerRepository indRepo;
	
	@Override
	public ResponseEntity getCustomers(Optional<String> pan) {
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<IndividualCustomerEntity> addCustomer(IndividualCustomerRequestDTO customer) {
		IndividualCustomerEntity i = new IndividualCustomerEntity();
		i.setDateOfBirth(customer.getDateOfBirth());
		i.setPan(customer.getPan());
		indRepo.save(i);
		return ResponseEntity.ok(i);
	}

	@Override
	public ResponseEntity getCustomer(long id) {
		return ResponseEntity.ok().build();
	}
}
