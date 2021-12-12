// Question 1
public class Main {

	// Define method to print array
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < (array.length - 1); i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length - 1] + "]");
		System.out.println();
	}

	// Question 6
	// Define method to test sorting methods
	// pass the sorted array from sorting method into 'result' 
	// and pass array sorted by hand to 'ans'
	// return true if they are the same and false if not
	private static boolean test(int[] result, int[] ans) {
		boolean same = true;
		// Check if two arrays have same length
		if (result.length == ans.length) {
			// Check if all elements in two arrays are the same
			for (int i = 0; i < result.length; i++) {
				// return false if any element is not the same
				if (result[i] != ans[i]) {
					same = false;
				}
			}
		}
		// Return false if two arrays have different lengths
		else {
			same = false;
		}
		return same;
	}

	// Question 7
	// Define method to compares elements of two arrays
	// equal if both of them contain same set of elements
	// order of elements may be different
	private static boolean compare(int[] arr1, int[] arr2) {
		// Two arrays must have same length if they contain same set of elements
		// Therefore, use test() after sort()
		QuickSort qS = new QuickSort();
		int[] sortedArr1 = qS.sort(arr1);
		int[] sortedArr2 = qS.sort(arr2);

		return test(sortedArr1, sortedArr2);
	}

	// Question 8
	// Define method to take an array as input 
	// and return the smallest sum of two elements in this array
	private static int findSmallestSum(int[] array) {
		// Sort array
		QuickSort qS = new QuickSort();
		int[] sortedArray = qS.sort(array);

		// Sum the two smallest elements
		int n = sortedArray.length;
		int sum = sortedArray[n - 1] + sortedArray[n - 2];

		return sum;		
	}

	// Main method
	public static void main(String[] args) {
		
		int[] test1 = {4, 2, 3, 1};
		System.out.print("test1 = ");
		printArray(test1);
		// As findSmallestSum sort the array, use clone() to preserve the original array to check sorting method later
		System.out.println("Smallest sum = " + findSmallestSum(test1.clone()));

		int[] test2 = {1, 5, 6, 3, 2, 7};
		System.out.print("test2 = ");
		printArray(test2);
		System.out.println("Smallest sum = " + findSmallestSum(test2.clone()));

		int[] test3 = {4, 7, 0, 0, 2, 9, 10};
		System.out.print("test3 = ");
		printArray(test3);
		System.out.println("Smallest sum = " + findSmallestSum(test3.clone()));

		System.out.println();

		System.out.println("Check InsertionSort");
		InsertionSort iS = new InsertionSort();
		// Array sorted by method
		int[] result1i = iS.sort(test1.clone());
		// int[] result = iS.sort(new int[] {4, 2, 3, 1});						
		System.out.print("Array test1 sorted by method: result1 = (sort(test1)) = ");
		printArray(result1i);

		// Array sorted by hand
		int[] ans1 = {4, 3, 2, 1};
		System.out.print("Array test1 sorted by hand: ans1 = ");
		printArray(ans1);
		int[] ans2 = {7, 6, 5, 3, 2, 1};
		int[] ans3 = {10, 9, 7, 4, 2, 0, 0};

		// Call test method to check if result and ans are the same
		System.out.println("result1 = ans1? " + test(result1i, ans1));
		int[] result2i = iS.sort(test2.clone());
		System.out.println("result2 = ans2? " + test(result2i, ans2));
		int[] result3i = iS.sort(test3.clone());
		System.out.println("result3 = ans3? " + test(result3i, ans3));			
		System.out.println();
		

		System.out.println("Check MergeSort");
		MergeSort mS = new MergeSort();

		// Array sorted by method
		int[] result2m = mS.sort(test2.clone());				
		System.out.print("Array test2 sorted by method: result2 = (sort(test2)) = ");
		printArray(result2m);

		// Array sorted by hand		
		System.out.print("Array test2 sorted by hand: ans2  = ");
		printArray(ans2);

		// Call test method to check if result and ans are the same
		System.out.println("result2 = ans2? " + test(result2m, ans2));
		int[] result1m = mS.sort(test1.clone());
		System.out.println("result1 = ans1? " + test(result1m, ans1));
		int[] result3m = mS.sort(test3.clone());		
		System.out.println("result3 = ans3? " + test(result3m, ans3));	
		System.out.println();


		System.out.println("Check QuickSort");
		QuickSort qS = new QuickSort();

		// Array sorted by method
		int[] result3q = qS.sort(test3.clone());				
		System.out.print("Array test3 sorted by method: result3 = (sort(test3)) = ");
		printArray(result3q);

		// Array sorted by hand		
		System.out.print("Array test3 sorted by hand: ans3 = ");
		printArray(ans3);

		// Call test method to check if result and ans are the same
		System.out.println("result3 = ans3? " + test(result3q, ans3));
		int[] result1q = qS.sort(test1.clone());
		System.out.println("result1 = ans1? " + test(result1q, ans1));
		int[] result2q = qS.sort(test2.clone());
		System.out.println("result2 = ans2? " + test(result2q, ans2));			
		System.out.println();

		System.out.println("Check compare() method");
		int[] arr1a = {2,4,1,3,5};
		System.out.print("arr1a = ");
		printArray(arr1a);
		int[] arr2a = {2,4,1,3,5};
		System.out.print("arr2a = ");
		printArray(arr2a);
		System.out.println("arr1a = arr2a? " + compare(arr1a, arr2a)); 

		int[] arr1b = {1,3,5,2,4};
		System.out.print("arr1b = ");
		printArray(arr1b);
		int[] arr2b = {2,4,1,3,5};
		System.out.print("arr2b = ");
		printArray(arr2b);
		System.out.println("arr1b = arr2b? " + compare(arr1b, arr2b)); 

		int[] arr1c = {1,7,2,8,5};
		System.out.print("arr1c = ");
		printArray(arr1c);
		int[] arr2c = {2,4,1,3,5};
		System.out.print("arr2c = ");
		printArray(arr2c);
		System.out.println("arr1c = arr2c? " + compare(arr1c, arr2c)); 
	}
}