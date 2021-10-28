package com.vishal.Rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.Rest.Service.Calculator;
import com.vishal.Rest.modelClass.Numbers;

@RestController
@RequestMapping("/vishal/mockito")
public class MainController {
	
	@Autowired
	@Qualifier("calcByVishal1")
	private Calculator calc;

	@GetMapping("/hello")
	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>("hello weclome to this api",HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Integer> add(@RequestBody Numbers num)
	{
		int res = calc.add(num.getA(), num.getB());
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
}
