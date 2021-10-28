package com.vishal.Rest.Service.Impl;

import org.springframework.stereotype.Service;

import com.vishal.Rest.Service.AddService;

@Service
public class AddServiceImpl implements AddService {

	@Override
	public int addByExternalService(int a, int b) {
		return a+b;
	}

}
