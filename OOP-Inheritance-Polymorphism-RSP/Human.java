import java.util.Scanner;

class Human extends Player {

	Scanner input = new Scanner(System.in);

	// No-argument Constructor
	Human() {
		super();
		this.name = "Human";
	}

	// Define method to obtain move of user
	void chooseMove() {
		int humanMoveInt = 0;

		// Handle exceptions
		boolean correctInput = false;
		while(!correctInput) {
			try {
				System.out.println();
				System.out.println("Press 1 or 2 or 3 to choose:");
				System.out.println("1) Rock     2) Paper     3) Scissors");
				System.out.print("Option: ");
				// Take input from the keyboard as a string
				// Use nextLine() instead of next() to control length of user input
				// next() read the input only till the space
				String humanMoveString = input.nextLine();
				
				// Ensure user enter only 1 number
				if (humanMoveString.length() == 1) {
					// Convert input to an int
					humanMoveInt = Integer.parseInt(humanMoveString);
					correctInput = true; // Out of while loop
				}
				else {
					System.out.println("Input not accepted. Please retry.");
				}				
			}
			catch (Exception e) {
				System.out.println("Exception occurred. Please retry.");
			}
		}
		// Call setMove() method
		this.setMove(humanMoveInt);
	}

	// Override Player class' method to return a string variable to show what player choose
	@Override
	String performMove() {
		if (this.getMove() == 1) {
			choice = this.name + " chose Rock";
		}
		else if (this.getMove() == 2) {
			choice = this.name + " chose Paper";
		}
		else if (this.getMove() == 3) {
			choice = this.name + " chose Scissors";
		}
		return choice;
	}	
	
}