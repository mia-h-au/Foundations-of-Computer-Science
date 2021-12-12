// Question 3
public class LinearSearch extends MySearchAlg {
	
	@Override
	// Define method to take a sequence of integer numbers 
	// and the number you want to find as input 
	// Return the index of that number
	// Return -1 if num is not in array
	public int search(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i; // return the index of that num
			}
		}
		return -1; // num does not exist.
	}

}