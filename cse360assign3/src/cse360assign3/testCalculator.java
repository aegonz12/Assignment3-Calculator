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

	//Subtracts a single value from the total
	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		
		testCalc.subtract(5);
		assertEquals(-5, testCalc.getTotal());
	}
	
	//Subtracts multiple values from the total in succession
	@Test
	public void testSubtract_multipleSubtractions() {
		Calculator testCalc = new Calculator();
		
		testCalc.subtract(5);
		testCalc.subtract(-5);
		testCalc.subtract(4);
		
		assertEquals(-4, testCalc.getTotal());
	}

	//Multiplies the default total, 0, by a single value
	@Test
	public void testMultiply_initialMultiply() {
		Calculator testCalc = new Calculator();
		
		testCalc.multiply(5);
		assertEquals(0, testCalc.getTotal());
	}
	
	//Changes the default value of total, and multiplies by a single value
	@Test
	public void testMultiply_afterAddingValue() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(2);
		testCalc.multiply(5);
		assertEquals(10, testCalc.getTotal());
	}

	//Divides the initial value of total by a single value
	@Test
	public void testDivide_initialDivide() {
		Calculator testCalc = new Calculator();
		
		testCalc.divide(5);
		assertEquals(0, testCalc.getTotal());
	}
	
	//Changes the default value of total, and divides by a single value
	public void testDivide_afterAddingValue() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(5);
		testCalc.divide(5);
		assertEquals(1, testCalc.getTotal());
	}
	
	//Divides the default value of total by zero, ensuring there is no error
	@Test
	public void testDivide_initialDivideByZero() {
		Calculator testCalc = new Calculator();
		
		testCalc.divide(0);
		assertEquals(0, testCalc.getTotal());
	}

	//Changes the default value of total, then divides by 0.
	//Expects value of 0.
	@Test
	public void testDivide_DivideByZero() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(25);
		testCalc.divide(0);
		assertEquals(0, testCalc.getTotal());
	}
	
	//Manipulates the total in several ways and checks the returned history string
	@Test
	public void testGetHistory() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(4);
		testCalc.subtract(2);
		testCalc.multiply(2);
		testCalc.add(5);
		
		assertEquals("0 + 4 - 2 * 2 + 5", testCalc.getHistory());
	}
	
	//Manipulates the total is several ways, with the specific inclusion of dividing by 0,
	//and checks the returned history string
	@Test
	public void testGetHistory_withDivideByZero() {
		Calculator testCalc = new Calculator();
		
		testCalc.add(40);
		testCalc.subtract(2);
		testCalc.multiply(2);
		testCalc.add(5);
		testCalc.divide(2);
		
		testCalc.divide(0);
		
		assertEquals("0 + 40 - 2 * 2 + 5 / 2 / 0", testCalc.getHistory());
	}

}
