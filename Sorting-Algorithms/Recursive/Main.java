import java.util.Scanner;
import java.util.HashSet;
import java.util.Stack;
import java.util.InputMismatchException;

// Question 14
class Main {
	
	// Question 15
	// For a given non-negative integer N, find the next smallest Happy Number
	int nextHappyNum(int num) {
		boolean endLoop = false;
		int i = num + 1; // start with checking if the integer after num is happy

		while (!endLoop) {			
			if (isHappy(i)) {				
				endLoop = true; // exit loop and return i if i is happy
			} 
			else {
				i++; // if i is not happy, check i + 1
			}			
		}
		return i; // i is the next smallest Happy Number
	}

	// Define method to check if a number is happy
	// https://www.programcreek.com/2014/04/leetcode-happy-number-java/ 
	private static boolean isHappy(int num) {
		HashSet<Integer> set = new HashSet<Integer>();

		// Calculate sum of squares of digits until cycle ends
		// If num is already in the set, the cycle ends
		while(!set.contains(num)) {
			set.add(num);

			num = sumSquare(num);

			if (num == 1) {
				return true; // num is happy
			}
		}
		return false; // num is not happy
	}

	// Define recursive method to calculate sum of squares of digits
	// http://www.javatechblog.com/java/java-program-to-check-happy-number-using-recursion/
	private static int sumSquare(int num) {
		
		if (num == 0) {
			return 0;
		}
		else {
			int digit = num % 10;
			return (digit * digit) + sumSquare(num / 10);
		}

		/* // Iterative way	
		int sum = 0;
		// Calculate sum of squares of digits
		while (num > 0) {
			sum += (num % 10) * (num % 10);
			num = num / 10;
		}
		return sum;*/
	}

	// Question 16
	// Define method to decode a given encoded string
	// https://www.geeksforgeeks.org/decode-string-recursively-encoded-count-followed-substring/
	String decodeString(String s) {
		Stack<Integer> intStack = new Stack<>();
		Stack<Character> strStack = new Stack<>();
		String tmp = "", result = "";

		// Travel the string
		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			// If number, convert it to number and push it into integer stack
			if (Character.isDigit(s.charAt(i))) {
				while (Character.isDigit(s.charAt(i))) {
					// https://stackoverflow.com/questions/34409950/what-does-0-do-in-java
					count = count * 10 + s.charAt(i) - '0'; 
					i++;
				}

				i--;
				intStack.push(count);
			}
            // If closing bracket ']', pop elemment until 
            // '[' opening bracket is not found in the character stack. 			
			else if (s.charAt(i) == ']') {
				tmp = "";
				count = 0;

				if (!intStack.isEmpty()) {
					count = intStack.peek();
					intStack.pop();
				}

				while (!strStack.isEmpty() && strStack.peek() != '[') {
					tmp = strStack.peek() + tmp;
					strStack.pop();
				}

				if (!strStack.isEmpty() && strStack.peek() == '[') {
					strStack.pop();
				}

				// Repeat the popped string 'temo' count number of times
				for (int j = 0; j < count; j++) {
					result = result + tmp;
				}

				// Push it in the character stack
				for (int j = 0; j < result.length(); j++) {
					strStack.push(result.charAt(j));
				}

				result = "";
			}

			// If '[' opening bracket, push it into character stack
			else if (s.charAt(i) == '[') {
				if (Character.isDigit(s.charAt(i - 1))) {
					strStack.push(s.charAt(i));
				}
				else {
					strStack.push(s.charAt(i));
					intStack.push(1);
				}
			}

			else {
				strStack.push(s.charAt(i));
			}
		}

		// Pop all the elements, make a string and return
		while (!strStack.isEmpty()) {
			result = strStack.peek() + result;
			strStack.pop();
		}
		return result;
	}

	public static void main(String[] args) {

		Main main = new Main();

		System.out.println("Check nextHappyNum");
		
		// Get user input
		boolean correctInput = false;
		int nInput = 0;

		// Loop to get correct input
		while(!correctInput) {
			try {
				// Instantiate Scanner inside loop to avoid infinite loop caused by exceptions
				// https://stackoverflow.com/questions/3572160/how-to-handle-infinite-loop-caused-by-invalid-input-inputmismatchexception-usi
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a non-negative integer: ");
				nInput = input.nextInt();

				// Number must be >= 0
				if (nInput >= 0) {
					correctInput = true; // Out of loop
				}
				else {
					System.out.println("Number not accepted. Please enter a non-negative integer.");
				}
			}
			// Handle wrong input
			catch (InputMismatchException e) {
				System.out.println("Wrong input type. Please enter a non-negative integer.");
			}
			// Handle all other exceptions			
			catch (Exception e) {
				System.out.println("Exception occured. Please enter a non-negative integer.");
			}
		}
		
		System.out.println("The next smallest Happy Number is: " + main.nextHappyNum(nInput));

		System.out.println();

		System.out.println("Check decodeString");
		String str1 = "3[a3[b]1[ab]]";
		System.out.println("Input 1: " + str1);
		System.out.println("Output 1: " + main.decodeString(str1));
		String str2 = "1[b]";
		System.out.println("Input 2: " + str2);
		System.out.println("Output 2: " + main.decodeString(str2));
		String str3 = "3[b2[ca]1[d]]";
		System.out.println("Input 3: " + str3);
		System.out.println("Output 3: " + main.decodeString(str3));
		System.out.println();

/*		System.out.println("Checkk decodeString with user input");

		// Get user input
		boolean correctString = false;
		String sInput = "Encoded String", sOutput = "Decoded String";

		// Loop to get correct input
		while(!correctString) {
			try {
				// Instantiate Scanner inside loop to avoid infinite loop caused by exceptions
				// https://stackoverflow.com/questions/3572160/how-to-handle-infinite-loop-caused-by-invalid-input-inputmismatchexception-usi
				Scanner input = new Scanner(System.in);

				System.out.print("Enter an encoded string: ");
				sInput = input.next();

				sOutput = main.decodeString(sInput);

				correctString = true; // Out of loop if no error
			}
				
			// Handle all exceptions			
			catch (Exception e) {
				System.out.println("Exception occured. Please try again.");
			}
		}

		System.out.println("Input: " + sInput);
		System.out.println("Output: " + sOutput);
*/
	}
}