import java.util.Random;

class Computer extends Player {

	// Create random object
	Random ran = new Random();

	// No-argument Constructor
	Computer() {
		super();
		this.name = "Computer";
	}

	// Define method to generate move of computer
	void chooseMove() {
		/* Return an int between 0 (inclusive) and 3 (exclusive)
		https://docs.oracle.com/javase/8/docs/api/java/util/Random.html*/
		int ranInt = ran.nextInt(3);
		this.setMove(ranInt + 1);
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