package com.siva.springboot.app.bank.service.api;

import org.springframework.stereotype.Service;

@Service
public class PhonePe implements Payment {

	@Override
	public String doTransaction() {
		// TODO Auto-generated method stub
		return "payment process using phonepe..!";
	}

}
