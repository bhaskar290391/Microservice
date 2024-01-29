package com.practise.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BusinessImplMockitoTest {
	
	
	@Mock
	private DataService service;
	
	@InjectMocks 
	private BusinessImpl business;

	@Test
	void test() {
		when(service.retrieveData()).thenReturn(new int[] {58,98,100});
		int result=business.getGreaterValueFormArray();
		assertEquals(100, result);
	}
	
	@Test
	void test1() {
		when(service.retrieveData()).thenReturn(new int[] {58});
		int result=business.getGreaterValueFormArray();
		assertEquals(58, result);
	}

}



