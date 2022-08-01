package com.learning.bank.customer.customerservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="state")
@Getter
@Setter
@ToString
public class StateEntity extends AbstractEntity {
	@Id
	private long id;
	@Column(nullable = false, length = 3, unique = true, updatable = false)
	private String code;
	@Column(nullable = false, unique = true)
	private String name;
}
