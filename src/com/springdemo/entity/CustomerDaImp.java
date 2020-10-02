package com.springdemo.entity;

import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class CustomerDaImp implements CustomerDao {
@Autowired
	
	private SessionFactory sessionFactory;
	
	@Override
	
	public List<Customer> getCustomers() {
		
		Session c=sessionFactory.getCurrentSession();
		Query<Customer> q= c.createQuery("from Customer",Customer.class);
		List<Customer> cs=q.getResultList();
		return cs;
	}

	@Override
	public void saveCustomer(Customer cd) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		
	
	currentSession.save(cd);
	}
}
