package com.vishal.Rest.Service.ImplTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.vishal.Rest.Service.AddService;
import com.vishal.Rest.Service.Impl.CalculatorImpl;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorImplTest {

	@InjectMocks
	CalculatorImpl calculatorImpl;
	
	@Mock
	AddService addService;
	
	@Test
	public void addTest()
	{
		when(addService.addByExternalService(8, 2)).thenReturn(10);   //if you remove this you will get failure j
		assertEquals(10, calculatorImpl.add(8, 2));
	}
}
