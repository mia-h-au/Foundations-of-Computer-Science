class DoublyLinkedList {
	public Node head, tail;

	DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addTail(Node nNode) {
		if (this.head == null) {
			this.head = nNode;
			this.tail = nNode;
		}
		else {
			nNode.prev = this.tail;
			this.tail.next = nNode;
			this.tail = nNode;
		}
	}

	public void addHead(Node nNode) {
		if (this.head == null) {
			this.head = nNode;
			this.tail = nNode;
		}
		else {
			nNode.next = this.head;
			this.head.prev = nNode;
			this.head = nNode;
		}		
	}

	public void del(int n) {
		if (this.head != null) {
			Node tmp = this.head;

			while(tmp != null) {
				if (tmp.value == n) {
					
					if (tmp.prev == null) {
						this.head = this.head.next;						
					}
					else {
						tmp.prev.next = tmp.next;
					}

					if (tmp.next == null) {
						this.tail = this.tail.prev;
					}
					else {
						tmp.next.prev = tmp.prev;
					}

					break;
				}
				else {
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
			while(tmp != null) {
				System.out.print(tmp.value + " ");
				tmp = tmp.next;
			}
			System.out.println();
		}
		System.out.println();
	}

	public void displayFromTail() {
		if (this.head == null) {
			System.out.println("Empty list.");
		}
		else {
			Node tmp = this.tail;
			while(tmp != null) {
				System.out.print(tmp.value + " ");
				tmp = tmp.prev;
			}
			System.out.println();
		}
		System.out.println();		
	}
}