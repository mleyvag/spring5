package com.miguel.pe.models.dao;

import java.util.List;

import com.miguel.pe.models.entity.Customer;

public interface ICustomerDao {
	public List<Customer> findAll();

	public void save(Customer customer);
}
