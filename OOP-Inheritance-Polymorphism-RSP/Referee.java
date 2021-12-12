import java.util.Scanner;

class Referee {
	
	Scanner input = new Scanner(System.in);

	// Instantiate the players using polymorphism
	Player [] players = new Player[] {new Human(), new Computer()};

	// Define method to take moves of human and computer
	// then determine if the move is valid and report errors (if any)
	void takeMoves() {
		
		// Get user name
		boolean validName = false;
		// Use loop to get valid name input
		while (!validName) {
			System.out.print("Enter your name: ");
			String nameInput = input.nextLine();

			if (nameInput.length() > 0) {
				players[0].setName(nameInput);
				validName = true; // Out of user name loop
			}
			else {
				System.out.println("Invalid name. Please retry.");
			}			
		}		

		// Get moves of user and computer
		boolean validMove = false;
		// Loop to check if human move is valid: 1 <= move <=3
		while (!validMove) {
			players[0].chooseMove();
			players[1].chooseMove();

			if (players[0].getMove() >= 1 && players[0].getMove() <=3) {
				validMove = true; // Out of move loop
			}
			else {
				System.out.println("Invalid input. Please retry.");
			}
		}		
	}

	// Define method to print moves of human and computer
	// Call chooseMove() method from Human and Computer classes
	void printMoves() {
		System.out.println(players[0].performMove());
		System.out.println(players[1].performMove());
	}

	// Define method to determine and announce who has won
	void compareMoves() {
		// 1) Rock     2) Paper     3) Scissors"				

		if (players[0].getMove() == players[1].getMove()) {
			System.out.println("Tie!");
		}

		else {
			if ((players[0].getMove() - players[1].getMove()) == 1 || (players[0].getMove() - players[1].getMove()) == -2) {
				System.out.println(players[0].getName() + " won! " + players[1].getName() + " lost!");
			}
			else {
				System.out.println(players[1].getName() + " won! " + players[0].getName() + " lost!");
			}
		}

		/*	Winner		C 	1 R 	2 P 	3 S
			H	H - C			
			1 R				T 0		C -1	H -2
			2 P				H 1		T 0		C -1
			3 S				C 2		H 1		T 0		*/		
	}

}