/*
 * Kelly Byrne
 * 
 * January 23, 2022
 * Project 1 Milestone 1
 */

// Import Statements
import java.io.*;
import java.util.*;

public class driver {

	public static void main(String[] args) throws FileNotFoundException {

		// Driver and Sort Objects
		driver d = new driver();
		Sort s = new Sort();

		// Scanners for future use
		Scanner scan = null;
		Scanner sc = new Scanner(System.in);

		// ArrayList where all values will be stored
		ArrayList<String> al = new ArrayList<String>();

		// Try-Catch to put values from numbers.txt into the
		// ArrayList
		try {
			// Scaner for the file numbers.txt
			scan = new Scanner(new FileReader("numbers.txt"));
			// While the scanner has a next value
			while (scan.hasNext()) {
				// Add that value to the array List
				al.add(scan.next());

			}
		} finally {
			// If scan is not null
			if (scan != null) {
				// Close the scanner
				scan.close();
			}

		}

		// Iterates through the ArrayList
		for (int i = 0; i < al.size(); i++) {
			// If any value in the arrayList is not an
			// Integer, it gets removed
			if (d.isInt(al.get(i)) == false) {
				al.remove(i);
			}
		}

		// ChoiceOrder and choiceSort are set to one higher
		// so their respective while-loops keep running
		int choiceOrder = 3;
		int choiceSort = 4;

		// Print welcome statement
		System.out.println("Hello! Welcome to the Sorting Program!");

		// Asks the user to pick their choice for the order
		// and stores it in choiceOrder
		while (choiceOrder >= 3 || choiceOrder <= 0) {
			System.out.println("What is the order you would like to sort in? \n\n"
					+ "Press 1 to choose 'Largest-to-Smallest'\n" + "Press 2 to choose 'Smallest-to-Largest'");
			choiceOrder = sc.nextInt();
		}

		// Asks the user to pick their choice for the sorting method
		// and stores it in choiceSort
		while (choiceSort >= 4 || choiceOrder <= 0) {
			System.out.println("Now that that's settled...\nWhat is the type of" + " sort you'd like to use? \n\n"
					+ "Press 1 to choose 'Selection Sort' \n" + "Press 2 to choose 'Bubble Sort' \n"
					+ "Press 3 to choose 'Insertion Sort'");
			choiceSort = sc.nextInt();
		}

		// If choieSort is 1...
		if (choiceSort == 1) {
			// If choiceOrder is 1...
			if (choiceOrder == 1) {
				// Run SelectionSort from Largest-To-Smallest
				s.SelectionSortBS(al);
			}
			// If choiceOrder is 2...
			if (choiceOrder == 2) {
				// Run SelectionSort from Smallest-To-Largest
				s.SelectionSortSB(al);
			}
		}
		// If choiceSort is 2...
		if (choiceSort == 2) {
			// If choiceOrder is 1...
			if (choiceOrder == 1) {
				// Run BubbleSort from Largest-To-Smallest
				s.BubbleSortBS(al);
			}
			// If choiceORder is 2...
			if (choiceOrder == 2) {
				// Run BubbleSort from Smallest-To-Largest
				s.BubbleSortSB(al);
			}
		}
		// If choiceSort is 3...
		if (choiceSort == 3) {
			// If choiceOrder is 1...
			if (choiceOrder == 1) {
				// Run InsertionSort from Largest-To-Smallest
				s.InsertionSortBS(al);
			}
			// If choiceOrder is 2...
			if (choiceOrder == 2) {
				// Run InsertionSort from Smallest-To-Largest
				s.InsertionSortSB(al);
			}
		}

	}

	// Checks to see if a value is an Integer
	public boolean isInt(String arr) {
		// Iterates through the arraylist
		for (int i = 0; i < arr.length(); i++) {
			// Surrounded by Try-Catch
			try {
				// Parses the String to Number if possible
				Integer.parseInt(String.valueOf(arr.charAt(i)));
			} catch (NumberFormatException e) {
				// If not possible, returns false
				return false;
			}
		}
		// Otherwise, returns true
		return true;

	}

}
