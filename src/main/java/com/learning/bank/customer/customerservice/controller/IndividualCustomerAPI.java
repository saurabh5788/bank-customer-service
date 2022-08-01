package com.learning.bank.customer.customerservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.bank.customer.customerservice.dto.IndividualCustomerRequestDTO;
import com.learning.bank.customer.customerservice.entity.IndividualCustomerEntity;

@Tag(name = "Individual Customer API", description = "Endpoints for Individual Customers.")
public interface IndividualCustomerAPI {
	@Operation(method = "GET", summary = "Endpoint to get Individual Customers.", description = "Endpoint to get Individual Customers using Pagination & Sequence.")
	@GetMapping
	ResponseEntity getCustomers(
			@RequestParam(required = false) Optional<String> pan);

	@Operation(method = "GET", summary = "Endpoint to get Individual Customer.", description = "Endpoint to get All Individual Customer using id.")
	@GetMapping("/{id}")
	ResponseEntity<IndividualCustomerEntity> getCustomer(
			@Parameter(name = "Individual Customer ID", description = "The Individual customer ID to be fetched.", required = true) @PathVariable long id);

	@Operation(method = "POST", summary = "Endpoint to add an Individual Customer.", description = "Endpoint to add an Individual Customer.")
	@PostMapping
	ResponseEntity addCustomer(
			@Parameter(name = "Individual Customer", description = "The Individual customer details to be added.", required = true) @RequestBody @Valid IndividualCustomerRequestDTO customer);
}
