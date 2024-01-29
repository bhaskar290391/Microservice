package com.practise.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void test1() {
		List mock = mock(List.class);
		when(mock.size()).thenReturn(3);
		assertEquals(3, mock.size());
	}
	
	
	@Test
	public void test2() {
		List mock = mock(List.class);
		when(mock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3, mock.size());
		assertEquals(2, mock.size());
	}
	
	
	@Test
	public void test3() {
		List mock = mock(List.class);
		when(mock.get(0)).thenReturn("Bhaskar");
		assertEquals("Bhaskar", mock.get(0));
		
	}
	
	
	@Test
	public void test4() {
		List mock = mock(List.class);
		when(mock.get(Mockito.anyInt())).thenReturn("Sudhakar");
		assertEquals("Sudhakar", mock.get(0));
		
	}
}
