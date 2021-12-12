// Question 2
public class Node {

	private int data; // the data saved in this node
	private Node left; // the reference to its left child
	private Node right; // the reference to its right child

	// Mutators
	public void setData(int d) {
		this.data = d;
	}
	public void setLeft(Node l) {
		this.left = l;
	}	
	public void setRight(Node r) {
		this.right = r;
	}

	// Accessors
	public int getData() {
		return this.data;
	}
	public Node getLeft() {
		return this.left;
	}
	public Node getRight() {
		return this.right;
	}

	// Constructors
	public Node() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	public Node(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}

	// Print the data saved in the node. 
	public void printNode() {
		System.out.print("Node data: ");
		System.out.print(this.data);
	}

}