// Question 3
public class InsertionSort extends MySortAlg {
	
	// Define method to take a sequence of integer numbers as input and return a sorted array in descending order
	public int[] sort(int[] array) {
		int key, n = array.length;

		for (int j = 1; j < n; j++) {
			// temporary variable fixed on j
			key = array[j];
			// elements before j
			int i = j - 1;

			// Verify if there are still elements and
			// Verify whether current element array[i] is smaller than key
			while ((i >= 0) && (array[i] < key)) {
				// Assign value of smaller element array[i] to bigger element array[i + 1]
				array[i + 1] = array[i];
				// Move counter
				i--;
			}
			// Assign value of key to the element at the correct position
			array[i + 1] = key;
		}
		return array;
	}
}