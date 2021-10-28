package com.vishal.Rest.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vishal.Rest.Service.Calculator;
import com.vishal.Rest.controller.MainController;
import com.vishal.Rest.modelClass.Numbers;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {
	
	@InjectMocks
	private MainController mainController;
	
	@Mock
	private Calculator calc;
	

	@Test
	public void helloTest()
	{
		ResponseEntity<String> res = new ResponseEntity<String>("hello weclome to this api",HttpStatus.OK);
		assertEquals(res, mainController.hello());
		
	}
	
	
	public void addTest()
	{
	    Numbers num = Numbers.builder().a(5).b(9).build();
		//when(calc.add(num.getA(),num.getB())).thenReturn(15);       
		ResponseEntity<Integer> res = new ResponseEntity<Integer>(15,HttpStatus.OK);
		assertEquals(res, mainController.add(num));
	}
}
