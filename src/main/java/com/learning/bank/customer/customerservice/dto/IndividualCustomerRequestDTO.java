package com.learning.bank.customer.customerservice.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class IndividualCustomerRequestDTO extends AbstractDTO {
	@NotBlank(message = "{validation.customer.individual.error.pan.not.valid}")
	private String pan;
	@NotNull(message = "{validation.customer.individual.error.dob.not.valid}")
	private LocalDate dateOfBirth;
}
