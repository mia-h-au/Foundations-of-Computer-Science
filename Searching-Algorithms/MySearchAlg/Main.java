// Question 1
class Main {
	
	// Define method to print array
	static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	// Question 5
	// Define method to compare
	// the index returned by searching algorithm
	// and ans - index as an integer generated by hand
	private static boolean test(int result, int ans) {
		if (result == ans) {
			return true;
		}
		else return false;
	}

	// Question 6
	// Define method to takes an array of elements 
	// which is first increasing and then decreasing as input
	// return the index value for the maximum number in this array
	private static int findMaxVal(int[] array) {
		int i;
		for (i = 0; i < array.length; i++) {
			// if next element array[i + 1] is smaller than current element array[i]
			// the array starts decreasing
			// array[i] is the maximum number in the array
			if (array[i + 1] < array[i]) {
				break; // terminate for loop
			}
		}
		return i;
	}

	public static void main(String[] args) {
		
		// Test cases
		System.out.println("Test cases: Arrays of integers which are first increasing and then decreasing");

		int[] arr1 = {1,5,8,12,9,7,-1};
		System.out.print("arr1 = ");		
		printArray(arr1);
		System.out.println("Index of the maximum number in this array: findMaxVal(arr1) = " + findMaxVal(arr1));

		int[] arr2 = {1,15,0};
		System.out.print("arr2 = ");		
		printArray(arr2);
		System.out.println("Index of the maximum number in this array: findMaxVal(arr2) = " + findMaxVal(arr2));

		int[] arr3 = {-5,6,8,10,17,-1};
		System.out.print("arr3 = ");		
		printArray(arr3);
		System.out.println("Index of the maximum number in this array: findMaxVal(arr1) = " + findMaxVal(arr3));

		System.out.println();

		System.out.println("Array of integers in random order");
		int[] arr4 = {5,7,1,3,6,9};
		System.out.print("arr4 = ");		
		printArray(arr4);

		System.out.println();	

		// Check searching methods

		System.out.println("Check LinearSearch");
		LinearSearch ls = new LinearSearch();	

		// arr1	
		// ans is the index generated by hand that search method is expected to return
		int ans1 = 2;		
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result1l = ls.search(arr1, 8);
		System.out.println("Index of 8 in arr1: result1 = search(arr1, 8) = " + result1l);
		System.out.println("ans1 = " + ans1);
		System.out.println("Is result = ans? test(result1, ans1) = " + test(result1l, ans1));

		// arr2	
		// ans is the index generated by hand that search method is expected to return
		int ans2 = -1;		
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result2l = ls.search(arr2, 8);
		System.out.println("Index of 8 in arr2: result2 = search(arr2, 8) = " + result2l);
		System.out.println("ans2 = " + ans2);
		System.out.println("Is result = ans? test(result2, ans2) = " + test(result2l, ans2));

		// arr3	
		// ans is the index generated by hand that search method is expected to return
		int ans3 = 5;		
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result3l = ls.search(arr3, -1);
		System.out.println("Index of -1 in arr3: result3 = search(arr3, -1) = " + result3l);
		System.out.println("ans3 = " + ans3);
		System.out.println("Is result = ans? test(result3, ans3) = " + test(result3l, ans3));

		// arr4	
		// ans is the index generated by hand that search method is expected to return
		int ans4 = -1;		
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result4l = ls.search(arr4, 2);
		System.out.println("Index of 2 in arr4: result4 = search(arr4, 2) = " + result4l);
		System.out.println("ans4 = " + ans4);
		System.out.println("Is result = ans? test(result4, ans4) = " + test(result4l, ans4));

		System.out.println();

		System.out.println("Check BinarySearch");
		BinarySearch bs = new BinarySearch();	

		// arr1	
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result1b = bs.search(arr1, 8);		
		System.out.println("Index of 8 in arr1: result1 = search(arr1, 8) = " + result1b);
		// ans is the index generated by hand that search method is expected to return
		System.out.println("ans1 = " + ans1);
		System.out.println("Is result = ans? test(result1, ans1) = " + test(result1b, ans1));

		// arr2
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result2b = bs.search(arr2, 8);
		System.out.println("Index of 8 in arr2: result2 = search(arr2, 8) = " + result2b);
		// ans is the index generated by hand that search method is expected to return
		System.out.println("ans2 = " + ans2);
		System.out.println("Is result = ans? test(result2, ans2) = " + test(result2b, ans2));

		// arr3			
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		int result3b = bs.search(arr3, -1);
		System.out.println("Index of -1 in arr3: result3 = search(arr3, -1) = " + result3b);
		// ans is the index generated by hand that search method is expected to return	
		System.out.println("ans3 = " + ans3);
		System.out.println("Is result = ans? test(result3, ans3) = " + test(result3b, ans3));

		// arr4			
		// Use search method to get the index of the given number in the given array
		System.out.println("==========");
		// ans is the index generated by hand that search method is expected to return	
		int result4b = bs.search(arr4, 2);
		System.out.println("Index of 2 in arr4: result4 = search(arr4, 2) = " + result4b);
		System.out.println("ans4 = " + ans4);
		System.out.println("Is result = ans? test(result4, ans4) = " + test(result4b, ans4));

	}

}