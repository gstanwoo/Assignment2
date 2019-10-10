/**
 * Garrett Stanwood
 * CSE360 - 70641
 * Assignment 2
 * 
 * Adds or subtracts given values into a total value. 
 * Keeps track of operations and can return the total and the string of operations.
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String operations = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		operations = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		operations = operations + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		operations = operations + " - " + value;
	}
		
	public String toString () {
		return operations;
	}

	public void clear() {
	
	}
}
