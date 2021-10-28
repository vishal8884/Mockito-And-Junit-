package com.vishal.Rest.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.Rest.Service.AddService;
import com.vishal.Rest.Service.Calculator;

@Service("calcByVishal1")
public class CalculatorImpl implements Calculator {

	@Autowired
	private AddService addService; 
	
	@Override
	public int add(int a, int b) {
		
		return addService.addByExternalService(a, b);
		
	}

}
