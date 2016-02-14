package com.test;
/* This class contains all the test cases for testing LargestNumber class 
 * Applied Annotations: @Test, @BeforeTest, @AfterTest
 * Applied Assertions:assertEquals
 * Applied expectedExceptions, alwaysRun, dependsOnMethods
 */

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import com.main.LargestElement;

public class LargestElementTest {
	
	LargestElement le;
	
	//Creation of Object
	@BeforeTest
	public void intialize(){
		le = new LargestElement();
	}
	
	//With positive numbers in an array
	@Test
	public void method1(){
		int[] a = {12, 34, 56, 23, 45};
		int expected = 56;
		int actual = le.getLargest(a);
		assertEquals(expected, actual);	
	}
	
	//With negative numbers in an array
	@Test(alwaysRun = true, dependsOnMethods = {"method1"})
	public void method2(){
		int[] a = {-12, 34, -56, 23, 45};
		int expected = 45;
		int actual = le.getLargest(a);
		assertEquals(expected, actual);
	}
	
	//With duplicates in an array
	@Test
	public void method3(){
		int[] a = {12, 34, 12, 23, 45};
		int expected = 45;
		int actual = le.getLargest(a);
		assertEquals(expected, actual);
	}
	
	//With no values in an array
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void method4(){
		int[] a = {};
		int expected = 0;
		int actual = le.getLargest(a);
		assertEquals(expected, actual);
	}
	
	//Setting the Object to null
	@AfterTest
	public void clear(){
		le = null;	
	}

}
