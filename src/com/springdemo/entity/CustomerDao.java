package com.springdemo.entity;

import java.util.List;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer cd);

}
