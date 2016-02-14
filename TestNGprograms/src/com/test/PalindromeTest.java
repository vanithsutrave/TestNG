package com.test;

import static org.testng.Assert.*;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import com.main.Palindrome;


@Test(groups={"checkTest", "funcTest"})
public class PalindromeTest {
	
	@BeforeGroups(groups={"checkTest"})
	public void g1(){
		System.out.println("in before group");
	}
	
	@Test(groups = {"checkTest"})
	public void method1(){
		String s = "madam";
		Palindrome p = new Palindrome();
		boolean actual = p.word();
		assertEquals(true,actual);	
	}
	
	@Test(groups = {"funcTest"})
	public void method2(){
		String s = "liril";
		Palindrome p = new Palindrome();
		boolean actual = p.word();
		assertEquals(true,actual);	
	}
	
	@Test(dependsOnGroups = {"checkTest","funcTest"})
	public void method3(){
		System.out.println("method1 and method2 successfully executed");
	}
	
	@AfterGroups
	public void g2(){
		System.out.println("in after group");
	}

}
