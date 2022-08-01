package com.learning.bank.customer.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.learning.bank.customer.customerservice.entity.IndividualCustomerEntity;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomerEntity, Long>{

}
