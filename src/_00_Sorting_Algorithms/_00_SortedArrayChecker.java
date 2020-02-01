package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int[] i) {
		int lowest = 0;
		for (int x = 0; x < i.length; x++) {
		lowest = i[0];
			if (i[x] < lowest) {
				return false;

			}
		
		}

		return true;

	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] d) {
		double lowest = 0;
		for (int x = 0; x < d.length; x++) {
		lowest = d[0];
			if (d[x] < lowest) {
				return false;

			}
		
		}

		return true;

	}
	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean doubleArraySorted(char[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].compareTo(c[i+1])) {
				return true;
			}
		}
		
		
		return false;
		
		
	}
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
