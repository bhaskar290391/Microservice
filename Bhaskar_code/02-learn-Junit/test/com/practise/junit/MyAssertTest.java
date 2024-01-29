package com.practise.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	private List<String> data=Arrays.asList("Test","Bhaskar","Data");
	@Test
	void test() {
		assertEquals(true, data.contains("Test"));
		assertTrue(data.contains("Data"));
		assertFalse(data.contains("Dataa"));
		
		//assertNull ,assertNotNull
		
		assertEquals(3, data.size());
		
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
	}

}
