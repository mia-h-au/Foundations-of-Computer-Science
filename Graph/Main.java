// Question 4
public class Main {
      
    public static void main(String args[]) {

        System.out.println("===============");
        System.out.println("Check Part 2 (Question 4 -> 6):");
        System.out.println("Take a matrix as input and transform it into an adjacency list by implementing a matrixToList() method.");
        System.out.println("===============");
        System.out.println(); 
        
        // Input
        int[][] matrix = {{0, 1, 0, 1}, 
    					  {1, 0, 0, 0}, 
    					  {0, 0, 0, 1}, 
    					  {0, 1, 1, 0}};

    	MyGraph graph = new MyGraph(matrix.length);
    	
        // Display matrix
        System.out.println("Input matrix:\n");
        graph.displayMatrix(matrix);
        System.out.println();
        System.out.println("Output for displayAdjListArray:");

        // Output
    	// Display adjacency list if the adjacency matrix input is valid
        if (graph.matrixToList(matrix)) {                        
            graph.displayAdjListArray();            
        } 
        else {
            System.out.println("Invalid adjacency matrix input.");
        }

    }
}     
