package com.learning.bank.customer.customerservice.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class IndividualCustomerResponseDTO extends AbstractDTO {
	private String pan;
	private LocalDate dateOfBirth;
}
