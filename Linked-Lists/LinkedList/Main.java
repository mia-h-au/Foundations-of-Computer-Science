public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.display();

		l.addHead(new Node(1));
		l.display();

		l.addHead(new Node(2));
		l.display();

		l.addHead(new Node(3));
		l.display();		

		l.addHead(new Node(4));
		l.display();

		l.addTail(new Node(5));
		l.display();

		l.del(4);
		l.display();

		l.del(5);
		l.display();

		l.del(2);
		l.display();

	}
	
}