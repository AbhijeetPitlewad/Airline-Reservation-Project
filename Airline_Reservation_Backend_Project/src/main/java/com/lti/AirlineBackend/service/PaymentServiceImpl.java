package com.lti.AirlineBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AirlineBackend.dao.PaymentDao;
import com.lti.AirlineBackend.entity.Payment;


@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

	@Autowired 
	PaymentDao paymentdao ;
	
	@Override
	public Payment findPaymentByPaymentId(int paymentId) {
		Payment payment = paymentdao.findPaymentByPaymentId(paymentId);
		return payment;
	}


	@Override
	public Payment createPayment(Payment payment) {
		Payment payment1 = paymentdao.createPayment(payment);
		return payment1;
	}

	
}
