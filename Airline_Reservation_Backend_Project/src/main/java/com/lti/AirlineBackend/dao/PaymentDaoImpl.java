package com.lti.AirlineBackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.AirlineBackend.entity.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Payment findPaymentByPaymentId(int paymentId)
	{
		
		Payment payment = em.find(Payment.class, paymentId);
		
		return payment ;
	}


	@Override
	@Transactional
	public Payment createPayment(Payment payment) {
		em.persist(payment);
		return payment;
	}

	
}
