package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void additiontest() {
		Calculator c  = new Calculator(10,20);
		int actualResult = c.add();
		int expectedResult = 30;
		assertEquals(expectedResult, actualResult);
		
		
	}
	
	@Test
	public void substractiontest() {
		Calculator c  = new Calculator(10,20);
		int actualResult = c.sub();
		int expectedResult = -10;
		assertEquals(expectedResult, actualResult);
		
		
	

}
}
