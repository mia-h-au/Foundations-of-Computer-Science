// Question 3
public class MyBST {
	private Node root; // The reference to the root node in this tree	

	public MyBST() {
		this.root = null;
	}

	// Insert a new value into the tree. This method calls insertRec()
	public void insert(int value) {
		if (this.root != null) {
			// when root is not empty
			this.insertRec(this.root, value);
		}
		else {
			// when root is empty
			this.root = new Node(value);
		}
	} 

	// This is a recursive function to insert a new value in the tree.
	private void insertRec(Node current, int value) {
		Node newNode = new Node(value);

		// check if value of newNode is smaller or bigger than current Node
		if (value < current.getData()) {
		 	
			if (current.getLeft() != null) {
				// recursive call when left node is NOT empty
				insertRec(current.getLeft(), value);
			} 
			// when left node is empty
			else {
				current.setLeft(newNode);
			}

		}

		else if (value > current.getData()) {
		 	if (current.getRight() != null) {
		 		// recursive call when right node is NOT empty
		 		insertRec(current.getRight(), value);
		 	}
		 	// when right node is empty
			else {
				current.setRight(newNode);
			}
		}

		// If value == current.getData()
		// The node is already in this tree, do not insert it again, 
		// instead, print out "Node is in the tree"
		else {
			System.out.println("Node " + value + " is already in the tree");
		} 
	}

	// Search a node in the tree. This method calls searchRec()
	public boolean search(int value) {
		boolean isInTree = false; // false if root is empty

		if (this.root != null) {
			// when root is not empty
			isInTree = this.searchRec(this.root, value);
		}
		return isInTree;		
	} 

	// This is a recursive function to search a node in the tree.
	private boolean searchRec(Node current, int value) {
		// After reaching the leaf node, 
		// if the value is not equal to the leaf node's value, return FALSE.
		boolean isInTree = false;

		// if the value is equal then return TRUE,
		if (value == current.getData()) {
			isInTree = true;
		}
		
		// if the value is less, then recurse for the left child if left is not empty
		else if (value < current.getData()) {
			if (current.getLeft() != null) {
				isInTree = searchRec(current.getLeft(),value);
			}
			// If current.getLeft() != null, the leaf node has been reached, 
			// if the value is not equal to the leaf node's value, isInTree remains FALSE.
		}
		
		// if the value is more, then recurse for the right child if right is not empty
		else {
			if (current.getRight() != null) {
				isInTree = searchRec(current.getRight(),value);
			}
			// If current.getRight() != null, the leaf node has been reached, 
			// if the value is not equal to the leaf node's value, isInTree remains FALSE.
		}

		return isInTree;

	}

	// Method to print Nodes in-order (left -> root -> right) by traversing the tree
	public void inOrder(Node tmp) {
		if (tmp != null) {
			this.inOrder(tmp.getLeft());
			tmp.printNode();
			System.out.println();
			this.inOrder(tmp.getRight());
		}
	}

	// Method to display tree in-order
	public void display() {
		if (this.root != null) {
			this.inOrder(this.root);
		}
	}

}