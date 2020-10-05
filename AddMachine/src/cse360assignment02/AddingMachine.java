package cse360assignment02;

import java.util.*;

/**
 * The AddingMachine program implements an application that either adds,
 * subtracts, and displays the history of transactions that is given to the
 * program. The program also clears the memory of transactions for a reset.
 *
 * @author Malin Tan
 * @version 1.0
 * @since 2020-10-05 
 * Email: mtan12@asu.edu
 * ID: 1216503951
 */
public class AddingMachine {
	private int total;
	private ArrayList<String> operators;
	private ArrayList<Integer> numbers;

	/**
	 * This method is the constructor of the AddingMachine class. It sets the total
	 * to 0, and initializes the ArrayList to hold the operator, and number values.
	 * 
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		operators = new ArrayList<String>(); // initialize the ArrayList to hold operator values
		numbers = new ArrayList<Integer>(); // initialize the ArrayList to hold number values
	}

	/**
	 * This method is a helper method that returns the current total.
	 * 
	 * @return int This returns total variable.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * This method is used to add two integers. This method adds an integer to the
	 * total variable, and adds "+" operator to memory.
	 * 
	 * @param value This is the first paramter to add method
	 * @return Nothing.
	 */
	public void add(int value) {
		total = total + value;
		numbers.add(value);
		operators.add("+");
	}

	/**
	 * This method is used to subtracts two integers. This method subtracts an
	 * integer to the total variable, and adds "-" operator to memory..
	 * 
	 * @param value This is the first paramter to subtract method
	 * @return Nothing.
	 */
	public void subtract(int value) {
		total = total - value;
		numbers.add(value);
		operators.add("-");
	}

	/**
	 * This method is a toString method that returns a string that documents that
	 * history of transactions, and separates all operations and values with a
	 * space.
	 * 
	 * @return String This returns a formatted string.
	 */
	public String toString() {
		String returnString = "0 ";
		for (int i = 0; i < numbers.size(); i++) {
			returnString = returnString + operators.get(i) + " " + String.valueOf(numbers.get(i)) + " ";
		}
		return returnString;
	}

	/**
	 * This method is used to subtracts two integers. This method clears the memory
	 * of all the transactions, and sets total equal to 0.
	 * 
	 * @return Nothing.
	 */
	public void clear() {
		numbers.clear();
		operators.clear();
		total = 0;
	}
}
