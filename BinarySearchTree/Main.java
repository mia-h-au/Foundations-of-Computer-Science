// Question 1
public class Main {
	public static void main(String[] args) {
		int[] inserting = {20, 8, 22, 4, 8, 12};

		MyBST tree = new MyBST();

		System.out.println("Check insert() method");
		System.out.println("==========");

		for (int i = 0; i < inserting.length; i++) {
			tree.insert(inserting[i]);
		}
		System.out.println("==========");

		tree.display();
		System.out.println();

		System.out.println("Check search() method");
		System.out.println("==========");

		for (int i = 0; i < inserting.length; i++) {
			System.out.println(inserting[i] + " is in tree? " + tree.search(inserting[i]));
		}
		System.out.println("==========");

		for (int i = 0; i < 6; i++) {
			System.out.println(i + " is in tree? " + tree.search(i));
		}

	}
}