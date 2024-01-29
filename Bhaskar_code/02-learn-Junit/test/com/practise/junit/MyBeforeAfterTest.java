package com.practise.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	
	@Test
	void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	void test3() {
		System.out.println("Test 3");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}



}
