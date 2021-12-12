// Question 4
public class BinarySearch extends MySearchAlg {

	@Override
	// Define method to take a sequence of integer numbers 
	// and the number you want to find as input 
	// Return the index of that number
	// Note: Array input will be sorted in ascending order after this method
	// to preserve the ori array input: use clone()	
	public int search(int[] array, int num) {
		// sort array in ascending order
		// and get an array showing original indexes of sorted array
		int[] sortedIndex = this.sortByIndex(array);
		
		// search index of num in sorted array
		// -1 is returned if num is not in array
		int indexSorted = this.binarySearch(array, num, 0, array.length - 1);
		
		// If num is in array
		if (indexSorted >= 0) {
			return sortedIndex[indexSorted]; // return index of num in ori array input
		}

		else return -1; // num not in array
	}

	// Define method to take a sequence of integer numbers sorted in ascending order
	// and the number you want to find as input 
	// Return the index of that number
	// Return -1 if num is not in array	
	private static int binarySearch(int[] array, int num, int left, int right) {

		if (right >= left) {
			int mid = (left + right) / 2;

			// If num is at the middle
			if (array[mid] == num) {
				return mid;
			}
			// If num is smaller than mid
			// num can only be in left array
			else if (num < array[mid]) {
				return binarySearch(array, num, left, mid - 1);
			} 
			// Else num can only be right subarray
			else {
				return binarySearch(array, num, mid + 1, right);
			}
		}

		// We reach here when num is not in array
		return -1;
	}

	// Define method to take an array as input
	// Sort the original array input in ascending order - using Bubble Sort
	// And return an array showing original indexes of sorted array input
	private static int[] sortByIndex(int[] array) {
		int n = array.length;

		// Instantiate array of indexs
		int[] index = new int[n];

		// Fill the array of indexes
		for (int i = 0; i < n; i++) {
			index[i] = i;
		}

		// Bubble sort in ascending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// ascending order
				if (array[i] > array[j]) {
					// swap elements of array input
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					// swap indexes
					int tmpIndex = index[i];
					index[i] = index[j];
					index[j] = tmpIndex;
				}
			}
		}
		return index;
	}



// Other way - longer - but ori array input is preserved without using clone()
// method to sort ori array and method to get array of indexes of ori array are separated
/*	@Override
	// Define method to take a sequence of integer numbers 
	// and the number you want to find as input 
	// Return the index of that number	
	public int search(int[] array, int num) {
		// sort array in ascending order
		int[] sortedArray = this.sort(array.clone());
		// search index of num in sorted array
		int indexSorted = this.binarySearch(sortedArray, num, 0, sortedArray.length - 1);
		
		// If num is in array
		if (indexSorted >= 0) {
			// array of indexes representing values of array sorted 
			int[] sortedIndex = this.sortByIndex(array.clone());
			// return index of num in original array
			return sortedIndex[indexSorted];
		}
		else return -1; // num not in array
	}

	// Buuble sort to array in ascending order
	private static int[] sort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					// swap elements
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	// Define method to take an array as input
	// Return the array of indexes representing values of input in ascending order
	// without sorting the original array input
	private static int[] sortByIndex(int[] array) {
		int n = array.length;

		// Instantiate array of indexs
		int[] index = new int[n];

		// Fill the array of indexes
		for (int i = 0; i < n; i++) {
			index[i] = i;
		}

		// Bubble sort in ascending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// ascending order
				if (array[index[i]] > array[index[j]]) {
					// swap indexes
					int tmp = index[i];
					index[i] = index[j];
					index[j] = tmp;
				}
			}
		}
		return index;
	}
*/
}