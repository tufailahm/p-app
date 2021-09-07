package com.revature.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.training.pms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }