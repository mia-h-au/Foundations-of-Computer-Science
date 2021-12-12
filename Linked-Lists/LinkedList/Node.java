class Node {
	int value;
	Node next;

	Node() {
		this.value = 0;
		this.next =  null;
	}

	Node(int v) {
		this.value = v;
		this.next =  null;
	}

	Node(int v, Node n) {
		this.value = v;
		this.next =  n;
	}
}