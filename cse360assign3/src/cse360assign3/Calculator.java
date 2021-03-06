
package cse360assign3;

/**
 * Calculator class contains several methods for performing integer arithmetic and retrieving the history of calculations.
 * @author Anthony Gonzalez
 * @version Version 4: February 20, 2016
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * Default constructor of Calculator objects
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * A getter method for returning the total value.
	 * @return An integer containing the total value for the current calculation.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Performs addition on the total.
	 * @param value The value to add to the total.
	 */
	public void add (int value) {
		total += value;
		
		history += " + " + value;	//update history string
	}
	
	/**
	 * Performs subtraction on the total
	 * @param value The value to subtract from the total.
	 */
	public void subtract (int value) {
		total -= value;
		
		history += " - " + value;	//update history string
	}
	
	/**
	 * Performs multiplication on the total.
	 * @param value The value to multiply the total by.
	 */
	public void multiply (int value) {
		total *= value;
		
		history += " * " + value;	//update history string
	}
	
	/**
	 * Performs division on the total. Division by 0 sets the calculation total to 0.
	 * @param value The value to divide the total by.
	 */
	public void divide (int value) {
		if(value == 0){
			total = 0;
			
			history += " / " + 0;		//update history string for case of value = 0
		}else{
			total /= value;
			
			history += " / " + value;	//update history string for case of value != 0
		}
	}
	
	/**
	 * A getter method for returning the history of a calculation.
	 * @return A string containing the history of the calculation.
	 */
	public String getHistory () {
		return history;
	}
}
