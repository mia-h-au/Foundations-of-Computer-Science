class Node {
	int value;
	Node next;
	Node prev;

	Node() {
		this.value = 0;
		this.next =  null;
		this.prev = null;
	}

	Node(int v) {
		this.value = v;
		this.next =  null;
		this.prev = null;
	}

	Node(int v, Node n) {
		this.value = v;
		this.next =  n;
		this.prev = null;
	}

	Node(int v, Node n, Node p) {
		this.value = v;
		this.next =  n;
		this.prev = p;
	}
}