package com.cts;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GenaralUnitTest {
	static GenralAPI api=null;
	@BeforeClass
	public static void start()
	{
		api=new GenralAPI();
		System.out.println("Genral API object created");
	}
	@AfterClass
	public static void destroy()
	{
		api= null;
		System.out.println("Genral API object created");
	}
	@Ignore
	@Test
	public void testAddNumbers() 
	{
		assertEquals(12,api.add(4,8));
	}
	@Test
	public void testCheckForEven() 
	{
		assertEquals(true,api.checkEven(12));
	}
	@Test
	public void testFactorialNumber() 
	{
		assertEquals(6,api.getFactorial(3));
	}
	@Test
	public void checkPrime() 
	{
		assertEquals(true,api.checkPrime(13));
	}
}
