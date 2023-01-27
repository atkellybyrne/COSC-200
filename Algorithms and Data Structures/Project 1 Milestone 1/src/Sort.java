import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	// Selection Sort Method (Smallest to Biggest)
	public void SelectionSortSB(ArrayList<String> arr) {

		for (int i = 0; i < arr.size(); i++) {
			int pos = i;
			for (int j = i; j < arr.size(); j++) {
				if (Integer.parseInt(arr.get(j)) < Integer.parseInt(arr.get(pos))) {
					pos = j;
				}
			}
			int min = Integer.parseInt(arr.get(pos));
			arr.set(pos, arr.get(i));
			arr.set(i, String.valueOf(min));

		}

		Sort.this.Paragraphs(1);
		System.out.println("This is the sorted ArrayList using Selection Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	// Selection Sort Method (Biggest to Smallest)
	public void SelectionSortBS(ArrayList<String> arr) {

		for (int i = 0; i < arr.size(); i++) {
			int pos = i;
			for (int j = i; j < arr.size(); j++) {
				if (Integer.parseInt(arr.get(j)) > Integer.parseInt(arr.get(pos))) {
					pos = j;
				}
			}
			int max = Integer.parseInt(arr.get(pos));
			arr.set(pos, arr.get(i));
			arr.set(i, String.valueOf(max));

		}
		Sort.this.Paragraphs(1);

		System.out.println("This is the sorted ArrayList using Selection Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	// Bubble Sort Method (Smallest to Biggest)
	public void BubbleSortSB(ArrayList<String> arr) {

		// Iterates through the array
		for (int i = 0; i < arr.size(); i++) {

			// Iterates through again at the length minus whatever i is
			for (int j = 1; j < arr.size() - i; j++) {
				// if the index at j-1 is greater than j then they
				// need to switch
				if (Integer.parseInt(arr.get(j - 1)) > Integer.parseInt(arr.get(j))) {
					Collections.swap(arr, j - 1, j);
				}
			}
		}

		Sort.this.Paragraphs(2);

		// Print out the fully sorted array
		System.out.println("This is the sorted ArrayList using Bubble Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	// Bubble Sort Method (Smallest to Biggest)
	public void BubbleSortBS(ArrayList<String> arr) {

		// Iterates through the array
		for (int i = 0; i < arr.size(); i++) {

			// Iterates through again at the length minus whatever i is
			for (int j = 1; j < arr.size() - i; j++) {
				// if the index at j-1 is greater than j then they
				// need to switch
				if (Integer.parseInt(arr.get(j - 1)) < Integer.parseInt(arr.get(j))) {
					Collections.swap(arr, j - 1, j);
				}
			}
		}

		Sort.this.Paragraphs(2);

		// Print out the fully sorted array
		System.out.println("This is the sorted ArrayList using Bubble Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	// InsertionSort Method (Smallest to Biggest)
	public void InsertionSortSB(ArrayList<String> arr) {

		for (int i = 1; i < arr.size(); i++) {

			// Holds the current object from where arr is at i
			int current = Integer.parseInt(arr.get(i));

			// New integer j that is one less than i
			int j = i - 1;

			// While j is greater than or equal to zero and the number at
			// j is greater than the current value...
			while (j >= 0 && Integer.parseInt(arr.get(j)) > current) {

				// The value at j+1 is equal to the value at j
				arr.set(j + 1, arr.get(j));

				// J is now one less than it was
				j = j - 1;
			}

			// The value at j+1 is equal to the current value
			arr.set(j + 1, String.valueOf(current));
		}

		Sort.this.Paragraphs(3);

		// Prints out the whole sorted array
		System.out.println("This is the sorted ArrayList using Insertion Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	// InsertionSort Method (Smallest to Biggest)
	public void InsertionSortBS(ArrayList<String> arr) {

		for (int i = 1; i < arr.size(); i++) {

			// Holds the current object from where arr is at i
			int current = Integer.parseInt(arr.get(i));

			// New integer j that is one less than i
			int j = i - 1;

			// While j is greater than or equal to zero and the number at
			// j is greater than the current value...
			while (j >= 0 && Integer.parseInt(arr.get(j)) < current) {

				// The value at j+1 is equal to the value at j
				arr.set(j + 1, arr.get(j));

				// J is now one less than it was
				j = j - 1;
			}

			// The value at j+1 is equal to the current value
			arr.set(j + 1, String.valueOf(current));
		}

		Sort.this.Paragraphs(3);

		// Prints out the whole sorted array
		System.out.println("This is the sorted ArrayList using Insertion Sort:");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	public void Paragraphs(int num) {
		if (num == 1) {
			System.out.println("\nNice choice in picking 'Selection Sort' \n"
					+ "It has a worse-case run time of O(n^2) along with the "
					+ "other two sorts\nIt is very simple to make but sill"
					+ " requires the user to scan through the entire array. \n"
					+ "Even if that array has already been sorted \n This one is"
					+ " not as great to use compared to Insertion Sort. \nIt has the same "
					+ "run time as Bubble Sort \n");
		} else if (num == 2) {
			System.out.println("\nNice choice in picking 'Bubble Sort' \n"
					+ "It has a worse-case run time of O(n^2) along with the "
					+ "other two sorts\nmethod works by examining each set of adjacent elements "
					+ "in the string, from left to right...\nswitching their positions if they are " + "out of order \n"
					+ "This one is not as great to use compared to Insertion Sort. "
					+ "\nIt has the same run time as Selection Sort \n");
		} else if (num == 3) {
			System.out.println("\nNice choice in picking 'Selection Sort' \n"
					+ "It has a worse-case run time of O(n^2) but can be perfected to O(n)\n"
					+ "It is the best one to use of the other two \n");
		}
	}
}
