package com.miguel.pe.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.miguel.pe.models.entity.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Customer> findAll() {
		return entityManager.createQuery("from Customer").getResultList();
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		entityManager.persist(customer);
	}

}
