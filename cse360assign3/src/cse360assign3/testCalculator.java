package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	//Creates a Calculator object and tests if the object is NULL
	@Test
	public void testCalculator() {
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}

	//Return total of new Calculator object. Expects 0 since total is initialized to 0
	@Test
	public void testGetTotal() {
		Calculator testCalc = new Calculator();
		
		assertEquals(0, testCalc.getTotal());
	}

	//Adds a single value to the total
	@Test
	public void testAdd() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(5);
		assertEquals(5, testCalc.getTotal());
	}
	
	//Adds multiple values to the total in succession
	@Test
	public void testAdd_multipleAdditions() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(5);
		testCalc.add(4);
		testCalc.add(3);
		assertEquals(12, testCalc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		
		testCalc.subtract(5);
		assertEquals(-5, testCalc.getTotal());
	}
	
	@Test
	public void testSubtract_multipleSubtractions() {
		Calculator testCalc = new Calculator();
		
		testCalc.subtract(5);
		testCalc.subtract(-5);
		testCalc.subtract(4);
		
		assertEquals(-4, testCalc.getTotal());
	}

	@Test
	public void testMultiply_initialMultiply() {
		Calculator testCalc = new Calculator();
		
		testCalc.multiply(5);
		assertEquals(0, testCalc.getTotal());
	}
	
	@Test
	public void testMultiply_afterAddingValue() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(1);
		testCalc.multiply(5);
		assertEquals(5, testCalc.getTotal());
	}

	@Test
	public void testDivide_initialDivide() {
		Calculator testCalc = new Calculator();
		
		testCalc.divide(5);
		assertEquals(0, testCalc.getTotal());
	}
	
	public void testDivide_afterAddingValue() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(5);
		testCalc.divide(5);
		assertEquals(1, testCalc.getTotal());
	}
	
	@Test
	public void testDivide_divideByZero() {
		Calculator testCalc = new Calculator();
		
		testCalc.divide(0);
		assertEquals(0, testCalc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator testCalc = new Calculator();
		
		assertEquals("", testCalc.getHistory());
	}

}
