package com.learning.bank.customer.customerservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ind_customer")
@Getter
@Setter
@ToString
public class IndividualCustomerEntity extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String pan;
	@Column(nullable = false)
	private LocalDate dateOfBirth;
}
