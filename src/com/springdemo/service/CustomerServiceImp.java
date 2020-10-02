package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entity.Customer;
import com.springdemo.entity.CustomerDao;
@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer cd) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(cd);
		
	}

}
