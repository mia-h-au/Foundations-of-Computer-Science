class LinkedList {
	Node head;
	int numberOfNodes;

	LinkedList() {
		this.head = null;
		this.numberOfNodes = 0;
	}

	public void addHead(Node nNode) {
		if (this.head != null) {
			nNode.next = this.head;
			this.head = nNode;
		}
		else {
			this.head = nNode;
		}
		this.numberOfNodes++;
	}

	public void addTail(Node nNode) {
		if (this.head == null) {
			this.head = nNode;
		}
		else {
			Node tmp = this.head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = nNode;
		}
		this.numberOfNodes++;
	}

	public void del(int n) {
		if (this.head != null) {
			Node tmp = this.head;
			Node prev = null;

			while(tmp != null) {
				if (tmp.value == n) {
					if (prev == null) {
						this.head = this.head.next;
						this.numberOfNodes--;
						break;
					}
					else {
						prev.next = tmp.next;
						break;
					}
				}
				else {
					prev = tmp;
					tmp = tmp.next;
				}
			}

		}
	} 

	public void display() {
		if (this.head == null) {
			System.out.println("Empty list.");
		}
		else {
			Node tmp = this.head;
			while (tmp != null) {
				System.out.print(tmp.value + " ");
				tmp = tmp.next;
			}
			System.out.println();

		}
		System.out.println();
	}
}