// Question 5
// https://www.geeksforgeeks.org/quick-sort/
public class QuickSort extends MySortAlg {

	/* Define method to take last element as pivot,
	place the pivot element at its correct position in sort array, 
	and place all bigger elements (than pivot) to the left of pivot 
	and all smaller elements to the right
	*/
	private int partition(int[] array, int l, int r) {
		int pivot = array[r];
		int i = (l - 1); // index of smaller element

		for (int j = l; j < r; j++) {
			// If current element is bigger than or equal to pivot
			if (array[j] >= pivot) {
				i++;
				// Swap array[i] and array[j]
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;				
			}
		}

		// Swap array[i + 1] and array[r] (pivot)
		int tmp = array[i + 1];
		array[i + 1] = array[r];
		array[r] = tmp;

		return i + 1;
	}

	// Define method to recursively sort array using partition()
	private void quickSort(int[] array, int l, int r) {
		if (l < r) {
			// pi is partitioning index
			int pi = partition(array, l, r);

			// Recursively sort elements before and after partition
			quickSort(array, l, pi -1);
			quickSort(array, pi + 1, r);
		}
	}
	
	// Sorting method to be implemented
	public int[] sort(int[] array)  {
		this.quickSort(array, 0, array.length - 1);
		return array;
	}	
}