// Question 5
public class Node {
	private int index; // the index of this node

	// Mutator
	public void setIndex(int i) {
		this.index = i;
	}
	// Accessor
	public int getIndex() {
		return this.index;
	}

	// Constructors
	public Node() {
		this.index = -1;
	}
	public Node(int i) {
		this.index = i;
	}

	// Print the data (the index) saved in the node. 
	public void printNode() {
		System.out.print("Node " + this.index);
	}
}