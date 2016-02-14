package com.test;

/* This class contains all the test cases for testing PrimeNumber class 
 * Applied Annotations: @Test, @BeforeTest, @AfterTest
 * Applied Assertions:assertTrue,assertFalse, assertEquals
 * Applied enabled, priority
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.main.PrimeNumber;

public class PrimeNumberTest {

	PrimeNumber pm;

	@BeforeTest
	public void intialiaze() {
		pm = new PrimeNumber();
		System.out.println("new instance created in before test");
	}
	
	// Checking with a PrimeNumber
	@Test(priority = 1)
	public void positiveTest() {
		boolean actual = pm.isPrime(5);
		assertTrue(actual);
	}

	// Checking with not a PrimeNumber
	@Test(priority = 2)
	public void negativeTest() {
		boolean actual = pm.isPrime(6);
		assertFalse(actual);
	}

	// Checking with AssertEquals Assertion;
	@Test(enabled = false)
	public void method() {
		boolean expected = false;
		boolean actual = pm.isPrime(123);
		assertEquals(expected, actual);
	}

	@AfterTest
	public void clear() {
		pm = null;
		System.out.println("instance cleared in after test");
	}

}
