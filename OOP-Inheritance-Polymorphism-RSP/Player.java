class Player {
	
	private int move;
	String choice, name;


	// Mutator
	void setMove(int tmpMove) {
		this.move = tmpMove;
	}

	// Accessor
	int getMove() {
		return this.move;
	}

	// Mutator
	void setChoice(String tmpChoice) {
		this.choice = tmpChoice;
	}

	// Accessor
	String getChoice() {
		return this.choice;
	}	

	// Mutator
	void setName(String tmpName) {
		this.name = tmpName;
	}

	// Accessor
	String getName() {
		return this.name;
	}

	// No-argument Constructor
	Player() {
		this.move = 0;
		this.choice = "UnknownChoice";
		this.name = "Player";
	}

	// Define method to generate move - to be overridden by Human and Computer classes
	// to be able to use Polymorphism in Referee class
	void chooseMove() {
		System.out.println("Choose move");
	}

	// Define method to return a string variable to show what player choose
	// Overridden by Human and Computer classes
	String performMove() {
		if (this.move == 1) {
			choice = "Player chose Rock";
		}
		else if (this.move == 2) {
			choice = "Player chose Paper";
		}
		else if (this.move == 3) {
			choice = "Player chose Scissors";
		}
		return choice;
	}	
	
}