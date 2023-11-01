package com.ecommerce.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Standard Test Class Example")
class Test1 {
	
	@BeforeAll()
	public static void myBefAll() {
		// create the jdbc statement obj here
		// that will used when the test cases are run
		System.out.println("Inside myBefAll().");
	}
	
	@AfterAll
	public static void myAfterAll() {
		// close the jdbc connection
		
		System.out.println("Inside myAfterAll().");
	}
	
	@BeforeEach
	public void myBefEach() {
		// create the jdbc statement obj here
		// that will used when the test cases are run
		System.out.println("Inside myBefEach().");
	}
	
	@AfterEach
	public void myAfterEach() {
		// close the jdbc statement obj here
		System.out.println("Inside myAfterEach().");
	}
	

	@Test
	@DisplayName("Sample Test 1")
	public void test1() {
		System.out.println("Inside test1()");
		//jdbc sql query to fetch all eproduct
	}
	
	@Test
	@DisplayName("Sample Test 2")
	public void test2() {
		System.out.println("Inside test2()");
		//jdbc sql query to fetch all eproduct
	}

}
