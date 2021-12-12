class Main {
	
	public static void main(String[] args) {

		// Instantiate a referee object
		Referee ref = new Referee();

		// Call method to take moves of human and computer
		ref.takeMoves();
		// Call method to print moves of human and computer
		ref.printMoves();
		// Call method to determine and announce who has won
		ref.compareMoves();
	}
}