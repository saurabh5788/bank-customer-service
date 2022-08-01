package com.learning.bank.customer.customerservice.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class IndividualCustomerResponseWrapperDTO extends AbstractDTO {
	List<IndividualCustomerResponseDTO> individualCustomerResponseList;
}
