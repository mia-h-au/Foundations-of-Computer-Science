// Question 4
// https://www.geeksforgeeks.org/merge-sort/
public class MergeSort extends MySortAlg {
	
	// Define method to merge 2 sub-arrays of array[]
	// First sub-array is array[1..m]
	// Second sub-array is array[m+1..r]
	private void merge(int[] array, int l, int m, int r) {
		// Finds sizes of 2 sub-arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		int[] left = new int[n1];
		int[] right = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; i++) {
			left[i] = array[l + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = array[m + 1 + j];
		}

		// Merge the temp arrays

		// Initial indexes of left and right sub-arrays
		int i = 0, j = 0;
		// Initial index of merged array
		int k = l;

		// Return sorted array in descending order
		while (i < n1 && j < n2) {
			if (left[i] >= right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of left[] if any
		while (i < n1) {
			array[k] = left[i];
			i++;
			k++;
		}

		// Copy remaining elements of right[] if any
		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}
	}

	// Define method to recursively sort array using merge()
	private void mergeSort(int[] array, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;
			// Sort first and second halves
			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);
			//Merge the sorted halves
			merge(array, l, m, r);
		}
	}

	// Sorting method to be implemented
	// take a sequence of integer numbers as input and return a sorted array in descending order.
	public int[] sort(int[] array) {
		this.mergeSort(array, 0, array.length - 1);
		return array;
	}	

}