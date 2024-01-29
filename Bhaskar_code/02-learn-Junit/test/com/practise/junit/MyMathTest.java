package com.practise.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math=new MyMath();
	
	@Test
	void calculateSum_ThreeMember() {
		
		int[] number= {1,2,3};
		assertEquals(6, math.calculateSum(number));
	}

	
	@Test
	void calculateSum_ZeroMember() {
		
		int[] number= {};
		assertEquals(0, math.calculateSum(number));
	}
}
