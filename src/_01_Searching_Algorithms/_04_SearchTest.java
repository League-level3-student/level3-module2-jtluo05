package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	int[] arr =new int[]{0,1,2,3,4,5,6};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		//assertEquals(4,_00_LinearSearch.linearSearch(arr, "8"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		//assertEquals(5,_01_BinarySearch.binarySearch(arr,0,arr.length-1,5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(5,_02_InterpolationSearch.interpolationSearch(arr,5));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
