package com.practise.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusinessImplStubTest {

	@Test
	void test() {
		DataServiceImpl data=new DataServiceImpl();
		BusinessImpl business =new BusinessImpl(data);
		int result=business.getGreaterValueFormArray();
		assertEquals(98, result);
	}

}


class DataServiceImpl implements DataService{

	@Override
	public int[] retrieveData() {
		return new int[] {25,12,98};
	}
	
}
