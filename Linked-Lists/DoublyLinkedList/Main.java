class Main {
	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();

		l.addTail(new Node(1));
		l.display();
		//l.displayFromTail();

		l.addTail(new Node(2));
		l.display();
		//l.displayFromTail();

		l.addTail(new Node(3));
		l.display();
		//l.displayFromTail();		

		l.addHead(new Node(4));
		l.display();
		//l.displayFromTail();	

		l.addHead(new Node(5));
		l.display();
		//l.displayFromTail();

		l.del(5);
		l.display();

		l.del(3);
		l.display();
		
		l.del(1);
		l.display();

		l.del(2);
		l.display();
		
		l.del(4);
		l.display();				
	}
}