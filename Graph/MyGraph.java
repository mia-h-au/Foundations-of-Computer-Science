// Quesion 6
import java.util.LinkedList;

public class MyGraph {
	int V;
	LinkedList<Node>  adjListArray[]; // Array of linked list
	

	// Initialise an empty graph in the constructor.
	public MyGraph() {
		V = 0;
		adjListArray = new LinkedList[0];		
	}

	// Basic constructor required number of vertices
	public MyGraph(int numV) {

		// Allocating memory
		// Define the size of array as number of vertices		
		V = numV;
		adjListArray = new LinkedList[numV];
		
		// Instantiating
		// Create a new list for each vertex that adjacent nodes can be stored
		for (int i = 0; i < numV; i++) {
			adjListArray[i] = new LinkedList<Node>();
			this.adjListArray[i].add(new Node(i));
		}
	}

	// Add an edge to the directed graph using add method
	// that inserts the specified element at the specified position in this list
	// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
	public void addEdge(int src, int dest) {
		// Add an edge from src to edge
		this.adjListArray[src].add(new Node(dest));
	}

	// Transform an adjacency matrix to an adjacency list
	// return true if matrix contains only 0 and 1 elements
	// else return false
	public boolean matrixToList(int[][] matrix) {

		try {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					// a element adj[i][j] = 1 indicates that 
					// there is an edge from node i to node j
					if (matrix[i][j] == 1) {
						addEdge(i, j);
					}
					// adj[i][j] = 0 indicates that there is no edge from node i to j
					// if element is ne
					else if (matrix[i][j] != 0) {
						System.out.println("Element " + matrix[i][j] + " at [" + i + "][" + j + "] is not accepted. Element of an adjacency matrix can only be 0 or 1.");
						return false;
					}
				}
			}			
		}
		catch (Exception e) {
			System.out.println("Exception occurred.");
			return false;
		}

		return true;
	}

	// Print out the matrix
	public void displayMatrix(int[][] matrix) {
		
		// Find the longest matrix[i] array
		int maxLength = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length > maxLength) {
				maxLength = matrix[i].length;
			}
		}

		// Print out indexes as the first row
		System.out.print("    ");
		for (int j = 0; j < maxLength; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.print("    ");
		for (int j = 0; j < maxLength; j++) {
			System.out.print("- ");
		}
		System.out.println();

		// Print out elements of the matrix
		for (int i = 0; i < matrix.length; i++) {
			// Print out indexes as the first column
			System.out.print(i + " | ");
			// Print out elements
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

    // Print out the adjacency list array
    public void displayAdjListArray() {                

        try {
	        for(int i = 0; i < this.V; i++) { 
	            // Display the vertex
	            System.out.print(i + ": ");

	            // Display the list of nodes adjacent (connected) to the i th node
	            // https://beginnersbook.com/2013/12/how-to-loop-linkedlist-in-java/
	            int num;
	            if (adjListArray[i].size() >= 2) {
		            for (num = 1; num < adjListArray[i].size() - 1; num++) {        		
	            		this.adjListArray[i].get(num).printNode(); // call printNode() from Node class
	            		// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
	            		// get(int index): Returns the element at the specified position in this list.
		            	System.out.print(" -> ");
		            }
		            this.adjListArray[i].get(num).printNode(); // no "->"" after last Node	            	
	            }
	            System.out.println(); 
	        }         	
        }
        catch (Exception e) {
        	System.out.println("Exception occurred.");
        }

    } 

}