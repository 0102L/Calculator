package cse360assign2;

/** Class ID: 518
 * @author Owen O'Toole
 * @version Feb 25, 2019
 * 
 * @category Assignment 2: Version 3 - Basic Calculator functions and function history implemented.
 * Calculator.java contains the calculator class. This class has methods for the 4 basic mathematical functions: addition, subtraction,
 * multiplication and division. The history method allows a complete history of all calculations performed to be accessed. The getTotal
 * method returns the current total.
 */
public class Calculator {

	private int total;
	private String history;
	/**
	 * Constructor that initializes the Calculator class with the total calculations and history set to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * getTotal method returns current total of calculations
	 * @return the current result of all calculations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add method accepts integer value and adds it to total
	 * @param value - the integer added to the current total
	 */
	public void add (int value) {
		history = history + " + " + value; //Adds value addition to history
		total = total + value; //Adds value to total
	}
	
	/**
	 * subtract method accepts an integer value and subtracts it from total
	 * @param value - the integer subtracted from current total
	 */
	public void subtract (int value) {
		history = history + " - " + value; //Adds value subtraction to history
		total = total - value; //Subtracts value from total
	}
	
	/**
	 * multiply method accepts an integer value and multiplies the total
	 * @param value - the integer to multiply the current total by
	 */
	public void multiply (int value) {
		history = history + " * " + value; //Adds value multiplication to history
		total = total * value; //Multiplies total by value
	}
	
	/**
	 * divide method accepts an integer value and divides the total
	 * @param value - the integer to divide the current total by
	 */
	public void divide (int value) {
		history = history + " / " + value; //Adds value division to history
		if (value == 0) //Checks to see if division by 0 occurs
		{
			total = 0; //Total will be set to 0 if the denominator is 0
		}
		else
		{
			total = total / value; //Otherwise, value divides total normally
		}
	}
	
	/**
	 * getHistory method returns a string of the history of calculations done
	 * @return - the string of calculations done up to current point
	 */
	public String getHistory () {
		return history;
	}
}